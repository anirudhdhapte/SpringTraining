package trng.sprmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import trng.sprmvc.entity.PagedEmpDetails;
import trng.sprmvc.entity.UserDetails;
import trng.sprmvc.repo.EmpDetailsREPO;
import trng.sprmvc.repo.EmpPageRepo;

@Component
public class EmpOperations {
	
	@Autowired
	private EmpDetailsREPO er;
	@Autowired
	private EmpPageRepo epr;
	
	public Iterable<UserDetails> listempdetails() {
	return er.findAll();
	}
	
	public void deleteempdetails(Integer eno) {
		er.deleteById(eno);
	}
	public UserDetails getempdetails(Integer eno) {
		UserDetails ud=er.findById(eno).get();
		return ud;
	}
	public void submitempdetails(UserDetails ud) {
		er.save(ud);
	}
	public Page<PagedEmpDetails> pagedempdetails(Pageable pageable) {
		Page<PagedEmpDetails> page=epr.findAll(pageable);
		return page;
		}
}
