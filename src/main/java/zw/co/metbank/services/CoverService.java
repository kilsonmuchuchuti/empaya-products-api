package zw.co.metbank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.metbank.empaya_model_classes.products.dtos.FuneralCoverDto;
import zw.co.metbank.empaya_model_classes.products.dtos.HospitalCashBackPlanCoverDto;
import zw.co.metbank.empaya_model_classes.products.dtos.HousingInsuranceCoverDto;
import zw.co.metbank.empaya_model_classes.products.dtos.MotorInsuranceCoverDto;
import zw.co.metbank.empaya_model_classes.products.entities.FuneralCover;
import zw.co.metbank.empaya_model_classes.products.entities.HospitalCashBackPlanCover;
import zw.co.metbank.empaya_model_classes.products.entities.HousingInsuranceCover;
import zw.co.metbank.empaya_model_classes.products.entities.MotorInsuranceCover;
import zw.co.metbank.empaya_model_classes.products.repositories.FuneralCoverRepository;
import zw.co.metbank.empaya_model_classes.products.repositories.HospitalCashBackPlanCoverRepository;
import zw.co.metbank.empaya_model_classes.products.repositories.HousingInsuranceCoverRepository;
import zw.co.metbank.empaya_model_classes.products.repositories.MotorInsuranceCoverRepository;
import zw.co.metbank.interfaces.CoverServiceInterface;

import java.util.List;
import java.util.Optional;

@Service
public class CoverService implements CoverServiceInterface {

    @Autowired
    private FuneralCoverRepository funeralCoverRepository;
    @Autowired
    private HospitalCashBackPlanCoverRepository hospitalCashBackPlanCoverRepository;
    @Autowired
    private HousingInsuranceCoverRepository housingInsuranceCoverRepository;
    @Autowired
    private MotorInsuranceCoverRepository motorInsuranceCoverRepository;

    @Override
    public FuneralCover createFuneralCover(FuneralCoverDto dto) {
        return funeralCoverRepository.save(new FuneralCover(dto));
    }

    @Override
    public FuneralCover updateFuneralCover(Integer id,FuneralCoverDto dto) {
        Optional<FuneralCover> optional = funeralCoverRepository.findById(id);
        if(optional.isPresent()){
            FuneralCover cover = optional.get();
            cover.update(dto);
            return funeralCoverRepository.save(cover);
        }
        return null;
    }

    @Override
    public FuneralCover deleteFuneralCover(Integer id) {
        Optional<FuneralCover> optional = funeralCoverRepository.findById(id);
        if(optional.isPresent()){
            funeralCoverRepository.delete(optional.get());
            return optional.get();
        }
        return null;
    }

    @Override
    public FuneralCover readFuneralCover(Integer id) {
        Optional<FuneralCover> optional = funeralCoverRepository.findById(id);
        if(optional.isPresent())
            return optional.get();
        return null;
    }

    @Override
    public List<FuneralCover> readFuneralCovers() {
        return funeralCoverRepository.findAll();
    }

    @Override
    public HospitalCashBackPlanCover createHospitalCashBackPlanCover(HospitalCashBackPlanCoverDto dto) {
        return hospitalCashBackPlanCoverRepository.save(new HospitalCashBackPlanCover(dto));
    }

    @Override
    public HospitalCashBackPlanCover updateHospitalCashBackPlanCover(HospitalCashBackPlanCover cover) {
        return hospitalCashBackPlanCoverRepository.save(cover);
    }

    @Override
    public HospitalCashBackPlanCover deleteHospitalCashBackPlanCover(Integer id) {
        Optional<HospitalCashBackPlanCover> optional = hospitalCashBackPlanCoverRepository.findById(id);
        if(optional.isPresent()){
            hospitalCashBackPlanCoverRepository.delete(optional.get());
            return optional.get();
        }
        return null;
    }

    @Override
    public HospitalCashBackPlanCover readHospitalCashBackPlanCover(Integer id) {
        Optional<HospitalCashBackPlanCover> optional = hospitalCashBackPlanCoverRepository.findById(id);
        if(optional.isPresent())
            return optional.get();
        return null;
    }

    @Override
    public List<HospitalCashBackPlanCover> readHospitalCashBackPlanCovers() {
        return hospitalCashBackPlanCoverRepository.findAll();
    }

    @Override
    public HousingInsuranceCover createHousingInsuranceCover(HousingInsuranceCoverDto dto) {
        return housingInsuranceCoverRepository.save(new HousingInsuranceCover(dto));
    }

    @Override
    public HousingInsuranceCover updateHousingInsuranceCover(HousingInsuranceCover cover) {
        return housingInsuranceCoverRepository.save(cover);
    }

    @Override
    public HousingInsuranceCover deleteHousingInsuranceCover(Integer id) {
        Optional<HousingInsuranceCover> optional = housingInsuranceCoverRepository.findById(id);
        if(optional.isPresent()){
            housingInsuranceCoverRepository.delete(optional.get());
            return optional.get();
        }
        return null;
    }

    @Override
    public HousingInsuranceCover readHousingInsuranceCover(Integer id) {
        Optional<HousingInsuranceCover> optional = housingInsuranceCoverRepository.findById(id);
        if(optional.isPresent())
            return optional.get();
        return null;
    }

    @Override
    public List<HousingInsuranceCover> readHousingInsuranceCovers() {
        return housingInsuranceCoverRepository.findAll();
    }

    @Override
    public MotorInsuranceCover createMotorInsuranceCover(MotorInsuranceCoverDto dto) {
            return motorInsuranceCoverRepository.save(new MotorInsuranceCover(dto));
    }

    @Override
    public MotorInsuranceCover updateMotorInsuranceCover(Integer id, MotorInsuranceCoverDto dto) {
        Optional<MotorInsuranceCover> optional = motorInsuranceCoverRepository.findById(id);
        if(optional.isPresent()){
            MotorInsuranceCover cover = optional.get();
            cover.update(dto);

            return motorInsuranceCoverRepository.save(cover);
        }
        return null;
    }

    @Override
    public MotorInsuranceCover deleteMotorInsuranceCover(Integer id) {
        Optional<MotorInsuranceCover> optional = motorInsuranceCoverRepository.findById(id);
        if(optional.isPresent()){
            motorInsuranceCoverRepository.delete(optional.get());
            return optional.get();
        }
        return null;
    }

    @Override
    public MotorInsuranceCover readMotorInsuranceCover(Integer id) {
        Optional<MotorInsuranceCover> optional = motorInsuranceCoverRepository.findById(id);
        if(optional.isPresent())
            return optional.get();
        return null;
    }

    @Override
    public List<MotorInsuranceCover> readMotorInsuranceCovers() {
        return motorInsuranceCoverRepository.findAll();
    }
}
