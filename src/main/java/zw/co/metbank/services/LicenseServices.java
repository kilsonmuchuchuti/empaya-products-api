package zw.co.metbank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import zw.co.metbank.empaya_model_classes.products.dtos.LicenseDto;
import zw.co.metbank.empaya_model_classes.products.entities.License;
import zw.co.metbank.empaya_model_classes.products.repositories.LicenseRepository;
import zw.co.metbank.interfaces.LicenseControllerInterface;
import zw.co.metbank.interfaces.LicenseServiceInterface;

import java.util.List;

@Service
public class LicenseServices implements LicenseServiceInterface {
    @Autowired
    private LicenseRepository licenseRepository;


    @Override
    public License createLicense(LicenseDto dto) {
        return null;
    }

    @Override
    public License updateLicense(Integer id, LicenseDto dto) {
        return null;
    }

    @Override
    public License deleteLicense(Integer id) {
        return null;
    }

    @Override
    public License readLicense(Integer id) {
        return null;
    }

    @Override
    public List<License> readLicense() {
        return null;
    }
}
