package zw.co.metbank.interfaces;

import org.springframework.http.ResponseEntity;
import zw.co.metbank.empaya_model_classes.products.dtos.FuneralCoverDto;
import zw.co.metbank.empaya_model_classes.products.entities.FuneralCover;

import java.util.List;

public interface FuneralCoverControllerInterface {

    public ResponseEntity<FuneralCover> createFuneralCover(FuneralCoverDto dto);
    public ResponseEntity<FuneralCover> updateFuneralCover(Integer id ,FuneralCoverDto dto);
    public ResponseEntity<FuneralCover> deleteFuneralCover(Integer id);
    public ResponseEntity<FuneralCover> readFuneralCover(Integer id);
    public ResponseEntity<List<FuneralCover>> readFuneralCovers();
}
