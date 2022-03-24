package trng.sprng.cntrlr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import trng.sprng.dto.MiniProjDTO;
import trng.sprng.service.MiniProjService;
import trng.sprng.vo.MiniProjVO;

@Controller("ctrl")
public class MiniProjController {
	@Autowired
	private MiniProjService service;

	public List<MiniProjVO> getEmp(String dsgn1, String dsgn2, String dsgn3) throws Exception {
		List<MiniProjVO> empvo = null;
		;
		List<MiniProjDTO> empdto = null;
		MiniProjVO vo = null;
		// MiniProjDTO dto;	
		empdto = service.getempbydesgn(dsgn1.toUpperCase(), dsgn2.toUpperCase(), dsgn3.toUpperCase());
		empvo = new ArrayList<MiniProjVO>();
		for (MiniProjDTO dto : empdto) {
			vo = new MiniProjVO();
			vo.setSno(String.valueOf(dto.getSno()));
			vo.setEmpno(String.valueOf(dto.getEmpno()));
			vo.setEmpname(String.valueOf(dto.getEmpname()));
			vo.setJob(String.valueOf(dto.getJob()));
			vo.setManager(String.valueOf(dto.getManager()));
			vo.setHiredate(String.valueOf(dto.getHiredate()));
			vo.setSalary(String.valueOf(dto.getSalary()));
			vo.setCommission(String.valueOf(dto.getCommission()));
			vo.setDeptno(String.valueOf(dto.getDeptno()));
			empvo.add(vo);
		}
		return empvo;
	}
}
