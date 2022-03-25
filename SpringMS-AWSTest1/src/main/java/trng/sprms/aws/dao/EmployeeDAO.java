package trng.sprms.aws.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import trng.sprms.aws.model.EmployeeBO;

@Component
public class EmployeeDAO {

	@Autowired
	DataSource ds;
	String SQL_QUERY="select empno,ename,job,deptno from emp";
	EmployeeBO emp=null;
	public List<EmployeeBO> getemployees() throws Exception {
	
		List<EmployeeBO> names=new ArrayList<EmployeeBO>();
		Connection con=ds.getConnection();
	PreparedStatement ps=con.prepareStatement(SQL_QUERY);
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		emp=new EmployeeBO();
		emp.setEmpno(rs.getInt(1));
		emp.setEname(rs.getString(2));
		emp.setJob(rs.getString(3));
		emp.setDeptno(rs.getInt(4));
		names.add(emp);
	}
	return names;
}
}