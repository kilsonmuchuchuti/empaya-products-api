package zw.co.metbank.interfaces;

import org.springframework.http.ResponseEntity;
import zw.co.metbank.empaya_model_classes.products.dtos.LicenseDto;
import zw.co.metbank.empaya_model_classes.products.entities.License;

import java.util.List;

public interface LicenseServiceInterface {
    public License createLicense (LicenseDto dto);
    public License updateLicense (Integer id,LicenseDto dto);
    public License deleteLicense (Integer id);
    public License readLicense (Integer id);
    public  List<License> readLicense();
}
