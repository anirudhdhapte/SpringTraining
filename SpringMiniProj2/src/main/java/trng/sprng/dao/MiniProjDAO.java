package trng.sprng.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import trng.sprng.bo.MiniProjBO;

@Repository("dao")
public class MiniProjDAO implements MiniProjDAOI {
	@Autowired
	DataSource ds;
	private static String sqlquery = "select * from spring_emp where JOB in(?,?,?)";

	public List<MiniProjBO> getEmpbyDesgn(String desgn1, String desgn2, String desgn3) throws Exception {
		List<MiniProjBO> emplist = new ArrayList<MiniProjBO>();
		Connection con = ds.getConnection();
		MiniProjBO bo = null;
		PreparedStatement ps = null;
		ps = con.prepareStatement(sqlquery);
		ps.setString(1, desgn1);
		ps.setString(2, desgn2);
		ps.setString(3, desgn3);
		ResultSet rs = null;
		rs = ps.executeQuery();
		try {
			while (rs.next()) {
				bo = new MiniProjBO();
				bo.setEmpno(rs.getInt(1));
				bo.setEmpname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setManager(rs.getInt(4));
				bo.setHiredate(rs.getDate(5));
				bo.setSalary(rs.getLong(6));
				bo.setCommission(rs.getLong(7));
				bo.setDeptno(rs.getInt(8));
				bo.setSno(emplist.size() + 1);
				emplist.add(bo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
			ps.close();
			rs.close();
		}
		return emplist;
	}
}
