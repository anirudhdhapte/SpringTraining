package trng.sprmvc.repo;

import org.springframework.data.repository.CrudRepository;

import trng.sprmvc.entity.UsernPWD;

public interface LoginREPO extends CrudRepository<UsernPWD, String>{

}
