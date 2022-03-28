package trng.prcdcall.springprcdcall;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository("DAO")
public class DAO {

	@Autowired
	private JdbcTemplate jt;
	
	public void procedurecall() {
		LocalDate dt=LocalDate.now();
		SimpleJdbcCall sjc=new SimpleJdbcCall(jt).withProcedureName("INSERTDBUSER");
		SqlParameterSource in=new MapSqlParameterSource()
				.addValue("p_userid","1005")
				.addValue("p_username","ANI")
				.addValue("p_createdby","anirudh")
				.addValue("p_date",dt);
		sjc.execute(in);
	}
}
