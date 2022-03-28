package trng.sprmvc.repo;

import org.springframework.data.repository.CrudRepository;

import trng.sprmvc.entity.UploadFiles;

public interface UploadNDownloadRepo extends CrudRepository<UploadFiles,String> {

}
