package zw.co.metbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.metbank.empaya_model_classes.products.dtos.MotorInsuranceCoverDto;
import zw.co.metbank.empaya_model_classes.products.entities.MotorInsuranceCover;
import zw.co.metbank.interfaces.MotorInsuranceControllerInterface;
import zw.co.metbank.services.CoverService;

import java.util.List;

@RestController
@RequestMapping(value="/motor-insurance-cover")
public class MotorInsuranceCoverController implements MotorInsuranceControllerInterface {
    @Autowired
    private CoverService coverService;


    @PostMapping
    @Override
    public ResponseEntity<MotorInsuranceCover> createMotorInsuranceCover(@RequestBody MotorInsuranceCoverDto dto) {
        MotorInsuranceCover cover = coverService.createMotorInsuranceCover(dto);
        if(cover!=null)
            return new ResponseEntity<>(cover, HttpStatus.CREATED);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<MotorInsuranceCover> updateMotorInsuranceCover(@PathVariable("id")Integer id ,@RequestBody MotorInsuranceCoverDto dto) {
        MotorInsuranceCover updatedCover = coverService.updateMotorInsuranceCover(id,dto);
        if(updatedCover!=null)
            return new ResponseEntity<>(updatedCover,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<MotorInsuranceCover> deleteMotorInsuranceCover(@PathVariable Integer id) {
        MotorInsuranceCover cover = coverService.deleteMotorInsuranceCover(id);
        if(cover!=null)
            return new ResponseEntity<>(cover,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<MotorInsuranceCover> readMotorInsuranceCover(@PathVariable("id") Integer id) {
        MotorInsuranceCover cover = coverService.readMotorInsuranceCover(id);
        if(cover!=null)
            return new ResponseEntity<>(cover,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @GetMapping
    @Override
    public ResponseEntity<List<MotorInsuranceCover>> readMotorInsuranceCovers() {
        List<MotorInsuranceCover> covers = coverService.readMotorInsuranceCovers();
        if(covers!=null)
            return new ResponseEntity<>(covers,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
}
