package zw.co.metbank.interfaces;

import org.springframework.http.ResponseEntity;
import zw.co.metbank.empaya_model_classes.products.dtos.PolicyDto;
import zw.co.metbank.empaya_model_classes.products.entities.Policy;

import java.util.List;

public interface PolicyControllerInterface {

    public ResponseEntity<Policy> createPolicy(PolicyDto dto);
    public ResponseEntity<Policy> deletePolicy(Integer id);
    public ResponseEntity<Policy> updatePolicy(Policy policy);
    public ResponseEntity<Policy> readPolicy(Integer id);
    public ResponseEntity<List<Policy>> readPolicies();
}
