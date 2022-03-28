package trng.spraws.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import trng.spraws.model.EmployeeBO;

@Repository
public class EmployeeDAO {

	@Autowired
	DataSource ds;
	String GET_SQL_QUERY = "select empno,ename,job,deptno from emp";
	String PUT_SQL_QUERY = "insert into emp (empno,ename,job,deptno) values(?,?,?,?)";

	public List<EmployeeBO> getallemps() throws Exception {
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(GET_SQL_QUERY);
		ResultSet rs = ps.executeQuery();
		EmployeeBO ebo = null;
		List<EmployeeBO> listbo = new ArrayList<EmployeeBO>();
		while (rs.next()) {
			ebo = new EmployeeBO();
			ebo.setEmpno(rs.getInt(1));
			ebo.setEname(rs.getString(2));
			ebo.setJob(rs.getString(3));
			ebo.setDeptno(rs.getInt(4));
			listbo.add(ebo);
		}
		return listbo;
	}

	public int putemps(EmployeeBO ebo) throws Exception {
		Connection con = ds.getConnection();
		/*
		 * String PUT_QUERY=PUT_SQL_QUERY + "(" + ebo.getEmpno() + "," +"'"+
		 * ebo.getEname()+"'" + "," +"'"+ ebo.getJob()+"'" + "," + ebo.getDeptno() +
		 * ")";
		 */
		PreparedStatement ps = con.prepareStatement(PUT_SQL_QUERY);
		ps.setInt(1, ebo.getEmpno());
		ps.setString(2, ebo.getEname());
		ps.setString(3, ebo.getJob());
		ps.setInt(4, ebo.getDeptno());
		return ps.executeUpdate();
	}
}
