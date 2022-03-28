package sprng.trng.lb.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import sprng.trng.lb.bo.StudentBO;
import sprng.trng.lb.dao.IStudRegDAO;
import sprng.trng.lb.dto.StudentDTO;

@Component("service")
@Scope("singleton")
public abstract class LMIService {
	StudentBO bo = null;
	@Autowired
	private IStudRegDAO dao;

	@Lookup
	public abstract StudentBO getstudbo();
	public void enrollstud(StudentDTO dto) {

		bo = getstudbo();
		int total = dto.getM1() + dto.getM2() + dto.getM3();
		float avg = total / 3;
		BeanUtils.copyProperties(dto, bo);
		bo.setName(dto.getName());
		bo.setTotal(total);
		bo.setAvg(avg);
		dao.enrollStud(bo);
	}
}
