package zw.co.metbank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import zw.co.metbank.empaya_model_classes.products.dtos.PolicyDto;
import zw.co.metbank.empaya_model_classes.products.entities.Policy;
import zw.co.metbank.empaya_model_classes.products.repositories.PolicyRepository;
import zw.co.metbank.interfaces.PolicyServiceInterface;

import java.util.List;
import java.util.Optional;

@Service
public class PolicyService implements PolicyServiceInterface {
    @Autowired
    private PolicyRepository policyRepository;


    @Override
    public Policy createPolicy(PolicyDto dto) {
      return policyRepository.save(new Policy(dto));
    }

    @Override
    public Policy deletePolicy(Integer id) {
        Optional<Policy> optional = policyRepository.findById(id);
        if(optional.isPresent()){
            policyRepository.delete(optional.get());
            return optional.get();
        }
        return null;
    }

    @Override
    public Policy updatePolicy(Policy policy) {
        return policyRepository.save(policy);
    }

    @Override
    public Policy readPolicy(Integer id) {
        Optional<Policy> optional = policyRepository.findById(id);
        if(optional.isPresent())
            return optional.get();
        else
            return null;

    }

    @Override
    public List<Policy> readPolicies() {
        return policyRepository.findAll();
    }
}
