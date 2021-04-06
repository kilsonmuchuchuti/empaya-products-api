package zw.co.metbank.interfaces;

import zw.co.metbank.empaya_model_classes.products.dtos.PolicyDto;
import zw.co.metbank.empaya_model_classes.products.entities.Policy;

import java.util.List;


public interface PolicyServiceInterface {
    public Policy createPolicy(PolicyDto dto);
    public Policy deletePolicy(Integer id);
    public Policy updatePolicy(Policy policy);
    public Policy readPolicy(Integer id);
    public List<Policy> readPolicies();
}
