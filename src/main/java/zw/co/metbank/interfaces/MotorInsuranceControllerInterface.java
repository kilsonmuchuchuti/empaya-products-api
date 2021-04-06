package zw.co.metbank.interfaces;

import org.springframework.http.ResponseEntity;
import zw.co.metbank.empaya_model_classes.products.dtos.MotorInsuranceCoverDto;
import zw.co.metbank.empaya_model_classes.products.entities.MotorInsuranceCover;

import java.util.List;

public interface MotorInsuranceControllerInterface {
    public ResponseEntity<MotorInsuranceCover> createMotorInsuranceCover(MotorInsuranceCoverDto dto);
    public ResponseEntity<MotorInsuranceCover> updateMotorInsuranceCover(Integer id ,MotorInsuranceCoverDto dto);
    public ResponseEntity<MotorInsuranceCover> deleteMotorInsuranceCover(Integer id);
    public ResponseEntity<MotorInsuranceCover> readMotorInsuranceCover(Integer id);
    public ResponseEntity<List<MotorInsuranceCover>> readMotorInsuranceCovers();
}
