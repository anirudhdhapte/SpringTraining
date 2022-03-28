package sprng.trng.lb.dao;

import org.springframework.stereotype.Repository;

import sprng.trng.lb.bo.EmployeeBO;

@Repository("empdao")
public class EmpRegDAOImpl implements IEmpRegDAO {

	@Override
	public void enrollEmp(EmployeeBO empbo) {
		System.out.println(empbo);

	}

}
