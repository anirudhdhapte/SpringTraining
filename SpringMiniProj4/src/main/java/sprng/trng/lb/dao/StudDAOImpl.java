package sprng.trng.lb.dao;

import org.springframework.stereotype.Repository;

import sprng.trng.lb.bo.StudentBO;

@Repository("studdao")
public class StudDAOImpl implements IStudRegDAO {

	@Override
	public void enrollStud(StudentBO studbo) {
		System.out.println(studbo);
	}
}
