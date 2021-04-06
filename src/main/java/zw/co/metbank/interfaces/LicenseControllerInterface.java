package zw.co.metbank.interfaces;

import org.springframework.http.ResponseEntity;
import zw.co.metbank.empaya_model_classes.products.dtos.LicenseDto;
import zw.co.metbank.empaya_model_classes.products.entities.License;

import java.util.List;

public interface LicenseControllerInterface {
    public ResponseEntity<License> createLicense (LicenseDto dto);
    public ResponseEntity<License> updateLicense (Integer id,LicenseDto dto);
    public ResponseEntity<License> deleteLicense (Integer id);
    public ResponseEntity<License> readLicense (Integer id);
    public ResponseEntity <List<License>> readLicense();

}
