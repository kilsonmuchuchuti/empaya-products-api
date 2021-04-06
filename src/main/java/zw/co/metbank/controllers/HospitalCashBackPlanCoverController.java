package zw.co.metbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.metbank.empaya_model_classes.products.dtos.HospitalCashBackPlanCoverDto;
import zw.co.metbank.empaya_model_classes.products.entities.HospitalCashBackPlanCover;
import zw.co.metbank.interfaces.HospitalCashBackPlanControllerInterface;
import zw.co.metbank.services.CoverService;

import java.util.List;

@RestController
@RequestMapping(value="/hospital-cash-back-plan")
public class HospitalCashBackPlanCoverController implements HospitalCashBackPlanControllerInterface {
    @Autowired
    private CoverService coverService;

    @PostMapping
    @Override
    public ResponseEntity<HospitalCashBackPlanCover> createHospitalCashBackPlanCover(@RequestBody HospitalCashBackPlanCoverDto dto) {
        HospitalCashBackPlanCover cover = coverService.createHospitalCashBackPlanCover(dto);
        if(cover != null)
            return new ResponseEntity<>(cover,HttpStatus.CREATED);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @PutMapping
    @Override
    public ResponseEntity<HospitalCashBackPlanCover> updateHospitalCashBackPlanCover(@RequestBody HospitalCashBackPlanCover cover) {
        HospitalCashBackPlanCover updatedCover = coverService.updateHospitalCashBackPlanCover(cover);
        if(updatedCover!=null)
            return new ResponseEntity<>(updatedCover,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<HospitalCashBackPlanCover> deleteHospitalCashBackPlanCover(@PathVariable Integer id) {
        HospitalCashBackPlanCover cover = coverService.deleteHospitalCashBackPlanCover(id);
        if(cover!=null)
            return new ResponseEntity<>(cover, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<HospitalCashBackPlanCover> readHospitalCashBackPlanCover(@PathVariable Integer id) {
        HospitalCashBackPlanCover cover = coverService.readHospitalCashBackPlanCover(id);
        if(cover != null)
            return new ResponseEntity<>(cover,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @GetMapping
    @Override
    public ResponseEntity<List<HospitalCashBackPlanCover>> readHospitalCashBackPlanCovers() {
        List<HospitalCashBackPlanCover> covers = coverService.readHospitalCashBackPlanCovers();
        if(covers!=null)
            return new ResponseEntity<>(covers,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);

    }
}
