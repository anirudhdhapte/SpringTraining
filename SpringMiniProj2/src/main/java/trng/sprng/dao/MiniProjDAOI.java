package trng.sprng.dao;

import java.util.List;

import trng.sprng.bo.MiniProjBO;

public interface MiniProjDAOI {
	public List<MiniProjBO> getEmpbyDesgn(String desgn1,String desgn2, String desgn3) throws Exception;
}
