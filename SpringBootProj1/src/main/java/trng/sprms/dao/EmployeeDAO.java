package trng.sprms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO implements IEmployeeDAO {

	@Autowired
	DataSource ds;
	String SQL_QUERY="select empno,ename,job,mgr from emp";
	@Override
	public void GetEmployeeDetails() throws SQLException {
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(SQL_QUERY);
		ResultSet rs=ps.executeQuery(SQL_QUERY);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
			}

}
