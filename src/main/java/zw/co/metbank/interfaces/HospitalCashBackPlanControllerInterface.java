package zw.co.metbank.interfaces;

import org.springframework.http.ResponseEntity;
import zw.co.metbank.empaya_model_classes.products.dtos.HospitalCashBackPlanCoverDto;
import zw.co.metbank.empaya_model_classes.products.entities.HospitalCashBackPlanCover;

import java.util.List;

public interface HospitalCashBackPlanControllerInterface {
    public ResponseEntity<HospitalCashBackPlanCover> createHospitalCashBackPlanCover(HospitalCashBackPlanCoverDto dto);
    public ResponseEntity<HospitalCashBackPlanCover> updateHospitalCashBackPlanCover(HospitalCashBackPlanCover cover);
    public ResponseEntity<HospitalCashBackPlanCover> deleteHospitalCashBackPlanCover(Integer id);
    public ResponseEntity<HospitalCashBackPlanCover> readHospitalCashBackPlanCover(Integer id);
    public ResponseEntity<List<HospitalCashBackPlanCover>> readHospitalCashBackPlanCovers();
}
