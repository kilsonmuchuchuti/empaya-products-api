package zw.co.metbank.interfaces;

import zw.co.metbank.empaya_model_classes.products.dtos.FuneralCoverDto;
import zw.co.metbank.empaya_model_classes.products.dtos.HospitalCashBackPlanCoverDto;
import zw.co.metbank.empaya_model_classes.products.dtos.HousingInsuranceCoverDto;
import zw.co.metbank.empaya_model_classes.products.dtos.MotorInsuranceCoverDto;
import zw.co.metbank.empaya_model_classes.products.entities.FuneralCover;
import zw.co.metbank.empaya_model_classes.products.entities.HospitalCashBackPlanCover;
import zw.co.metbank.empaya_model_classes.products.entities.HousingInsuranceCover;
import zw.co.metbank.empaya_model_classes.products.entities.MotorInsuranceCover;

import java.util.List;

public interface CoverServiceInterface {

    public FuneralCover createFuneralCover(FuneralCoverDto dto);
    public FuneralCover updateFuneralCover(Integer id,FuneralCoverDto dto);
    public FuneralCover deleteFuneralCover(Integer id);
    public FuneralCover readFuneralCover(Integer id);
    public List<FuneralCover> readFuneralCovers();


    public HospitalCashBackPlanCover createHospitalCashBackPlanCover(HospitalCashBackPlanCoverDto dto);
    public HospitalCashBackPlanCover updateHospitalCashBackPlanCover(HospitalCashBackPlanCover cover);
    public HospitalCashBackPlanCover deleteHospitalCashBackPlanCover(Integer id);
    public HospitalCashBackPlanCover readHospitalCashBackPlanCover(Integer id);
    public List<HospitalCashBackPlanCover> readHospitalCashBackPlanCovers();

    public HousingInsuranceCover createHousingInsuranceCover(HousingInsuranceCoverDto dto);
    public HousingInsuranceCover updateHousingInsuranceCover(HousingInsuranceCover cover);
    public HousingInsuranceCover deleteHousingInsuranceCover(Integer id);
    public HousingInsuranceCover readHousingInsuranceCover(Integer id);
    public List<HousingInsuranceCover> readHousingInsuranceCovers();

    public MotorInsuranceCover createMotorInsuranceCover(MotorInsuranceCoverDto dto);
    public MotorInsuranceCover updateMotorInsuranceCover(Integer id,MotorInsuranceCoverDto dto);
    public MotorInsuranceCover deleteMotorInsuranceCover(Integer id);
    public MotorInsuranceCover readMotorInsuranceCover(Integer id);
    public List<MotorInsuranceCover> readMotorInsuranceCovers();

}
