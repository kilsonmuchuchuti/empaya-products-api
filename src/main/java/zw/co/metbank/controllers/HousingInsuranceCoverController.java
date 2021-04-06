package zw.co.metbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.metbank.empaya_model_classes.products.dtos.HousingInsuranceCoverDto;
import zw.co.metbank.empaya_model_classes.products.entities.HousingInsuranceCover;
import zw.co.metbank.interfaces.HousingInsuranceControllerInterface;
import zw.co.metbank.services.CoverService;

import java.util.List;

@RestController
@RequestMapping(value="/house-insurance-cover")
public class HousingInsuranceCoverController implements HousingInsuranceControllerInterface {
    @Autowired
    private CoverService coverService;

    @PostMapping
    @Override
    public ResponseEntity<HousingInsuranceCover> createHousingInsuranceCover(@RequestBody HousingInsuranceCoverDto dto) {
        HousingInsuranceCover cover = coverService.createHousingInsuranceCover(dto);
        if(cover!=null)
            return new ResponseEntity<>(cover, HttpStatus.CREATED);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @PutMapping
    @Override
    public ResponseEntity<HousingInsuranceCover> updateHousingInsuranceCover(@RequestBody HousingInsuranceCover cover) {
        HousingInsuranceCover updatedCover = coverService.updateHousingInsuranceCover(cover);
        if(updatedCover!=null)
            return new ResponseEntity<>(updatedCover,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<HousingInsuranceCover> deleteHousingInsuranceCover(@PathVariable("id") Integer id) {
        HousingInsuranceCover deletedCover = coverService.deleteHousingInsuranceCover(id);
        if(deletedCover != null)
            return new ResponseEntity<>(deletedCover,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<HousingInsuranceCover> readHousingInsuranceCover(@PathVariable("id") Integer id) {
        HousingInsuranceCover cover = coverService.readHousingInsuranceCover(id);
        if(cover!=null)
            return new ResponseEntity<>(cover,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @GetMapping
    @Override
    public ResponseEntity<List<HousingInsuranceCover>> readHousingInsuranceCovers() {
        List<HousingInsuranceCover> covers = coverService.readHousingInsuranceCovers();
        if(covers!=null)
            return new ResponseEntity<>(covers,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
}
