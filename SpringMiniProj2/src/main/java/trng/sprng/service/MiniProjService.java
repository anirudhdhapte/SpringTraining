package trng.sprng.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import trng.sprng.bo.MiniProjBO;
import trng.sprng.dao.MiniProjDAO;
import trng.sprng.dto.MiniProjDTO;

@Service("service")
public class MiniProjService {
	@Autowired
	private MiniProjDAO dao;

	public List<MiniProjDTO> getempbydesgn(String desgn1, String desgn2, String desgn3) throws Exception {
		List<MiniProjBO> emplistbo = null;
		List<MiniProjDTO> emplistdto = null;
		MiniProjDTO dto = null;
		emplistdto = new ArrayList<MiniProjDTO>();
		emplistbo = dao.getEmpbyDesgn(desgn1, desgn2, desgn3);
		for (MiniProjBO bo : emplistbo) {
			dto = new MiniProjDTO();
			BeanUtils.copyProperties(bo, dto);
			emplistdto.add(dto);
		}
		return emplistdto;
	}
}
