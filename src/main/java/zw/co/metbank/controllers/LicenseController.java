package zw.co.metbank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zw.co.metbank.empaya_model_classes.products.dtos.LicenseDto;
import zw.co.metbank.empaya_model_classes.products.entities.License;
import zw.co.metbank.interfaces.LicenseControllerInterface;
import zw.co.metbank.services.LicenseServices;

import java.util.List;

@RestController
@RequestMapping(value = "/licenses")
public class LicenseController implements LicenseControllerInterface {
    @Autowired
    private LicenseServices licenseServices;


    @Override
    public ResponseEntity<License> createLicense(LicenseDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<License> updateLicense(Integer id, LicenseDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<License> deleteLicense(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<License> readLicense(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<License>> readLicense() {
        return null;
    }
}
