package zw.co.metbank.interfaces;

import org.springframework.http.ResponseEntity;
import zw.co.metbank.empaya_model_classes.products.dtos.HousingInsuranceCoverDto;
import zw.co.metbank.empaya_model_classes.products.entities.HousingInsuranceCover;

import java.util.List;

public interface HousingInsuranceControllerInterface {
    public ResponseEntity<HousingInsuranceCover> createHousingInsuranceCover(HousingInsuranceCoverDto dto);
    public ResponseEntity<HousingInsuranceCover> updateHousingInsuranceCover(HousingInsuranceCover cover);
    public ResponseEntity<HousingInsuranceCover> deleteHousingInsuranceCover(Integer id);
    public ResponseEntity<HousingInsuranceCover> readHousingInsuranceCover(Integer id);
    public ResponseEntity<List<HousingInsuranceCover>> readHousingInsuranceCovers();
}
