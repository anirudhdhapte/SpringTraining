package trng.spraws.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import trng.spraws.model.CustomerBO;

@Repository
public class CustomerDAO {

	@Autowired
	DataSource ds;
	String GET_SQL_QUERY = "select custno,custname,item,amount from custdetails";
	String PUT_SQL_QUERY = "insert into custdetails (custno,custname,item,amount) values(?,?,?,?)";

	public List<CustomerBO> getallcusts() throws Exception {
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(GET_SQL_QUERY);
		ResultSet rs = ps.executeQuery();
		CustomerBO cbo = null;
		List<CustomerBO> listbo = new ArrayList<CustomerBO>();
		while (rs.next()) {
			cbo = new CustomerBO();
			cbo.setCustno(rs.getInt(1));
			cbo.setCustname(rs.getString(2));
			cbo.setItem(rs.getString(3));
			cbo.setAmount(rs.getFloat(4));
			listbo.add(cbo);
		}
		return listbo;
	}

	public int putemps(CustomerBO cbo) throws Exception {
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(PUT_SQL_QUERY);
		ps.setInt(1, cbo.getCustno());
		ps.setString(2, cbo.getCustname());
		ps.setString(3, cbo.getItem());
		ps.setFloat(4, cbo.getAmount());
		return ps.executeUpdate();
	}
	 
}
