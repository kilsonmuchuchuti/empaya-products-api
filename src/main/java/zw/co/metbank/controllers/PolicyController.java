package zw.co.metbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.metbank.empaya_model_classes.products.dtos.PolicyDto;
import zw.co.metbank.empaya_model_classes.products.entities.Policy;
import zw.co.metbank.interfaces.PolicyControllerInterface;
import zw.co.metbank.services.PolicyService;

import java.util.List;
@RestController
@RequestMapping(value="/policy")
public class PolicyController implements PolicyControllerInterface {
    @Autowired
    private PolicyService policyService;


    @PostMapping
    @Override
    public ResponseEntity<Policy> createPolicy(@RequestBody PolicyDto dto) {
        Policy policy = policyService.createPolicy(dto);
        if(policy != null)
            return new ResponseEntity<>(policy, HttpStatus.CREATED);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<Policy> deletePolicy(@PathVariable("id") Integer id) {
        Policy policy = policyService.deletePolicy(id);
        if(policy != null)
            return new ResponseEntity<>(policy, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @PutMapping
    @Override
    public ResponseEntity<Policy> updatePolicy(@RequestBody Policy policy) {
        Policy updatedPolicy = policyService.updatePolicy(policy);
        if(updatedPolicy != null)
            return new ResponseEntity<>(updatedPolicy,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Policy> readPolicy(@PathVariable("id") Integer id) {
        Policy policy = policyService.readPolicy(id);
        if(policy != null)
            return new ResponseEntity<>(policy,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    @Override
    public ResponseEntity<List<Policy>> readPolicies() {
        List<Policy> policies = policyService.readPolicies();
        if(policies != null)
            return new ResponseEntity<>(policies,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
}
