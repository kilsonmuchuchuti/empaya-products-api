package zw.co.metbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.metbank.empaya_model_classes.products.dtos.FuneralCoverDto;
import zw.co.metbank.empaya_model_classes.products.entities.FuneralCover;
import zw.co.metbank.interfaces.FuneralCoverControllerInterface;
import zw.co.metbank.services.CoverService;

import java.util.List;

@RestController
@RequestMapping(value="/funeral-cover")
public class FuneralCoverController implements FuneralCoverControllerInterface {
    @Autowired
    private CoverService coverService;

    @PostMapping
    @Override
    public ResponseEntity<FuneralCover> createFuneralCover(@RequestBody FuneralCoverDto dto) {
        FuneralCover cover = coverService.createFuneralCover(dto);
        if(cover!=null)
            return new ResponseEntity<>(cover, HttpStatus.CREATED);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<FuneralCover> updateFuneralCover(@PathVariable("id")Integer id,@RequestBody FuneralCoverDto dto) {
        FuneralCover updateFuneralCover = coverService.updateFuneralCover(id,dto);
        if(updateFuneralCover!=null)
            return new ResponseEntity<>(updateFuneralCover,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<FuneralCover> deleteFuneralCover(@PathVariable("id") Integer id) {
        FuneralCover cover = coverService.deleteFuneralCover(id);
        if(cover!=null)
            return new ResponseEntity<>(cover,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
    @GetMapping("/{id}")
    @Override
    public ResponseEntity<FuneralCover> readFuneralCover(@PathVariable("id") Integer id) {
        FuneralCover cover = coverService.readFuneralCover(id);
        if(cover != null)
            return new ResponseEntity<>(cover ,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);

    }

    @GetMapping
    @Override
    public ResponseEntity<List<FuneralCover>> readFuneralCovers() {
        List<FuneralCover> covers = coverService.readFuneralCovers();
        if(covers != null)
            return new ResponseEntity<>(covers,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);

    }
}
