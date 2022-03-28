package trng.sprng.cfgs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages={"trng.sprng.service","trng.sprng.dao"})
public class ParentConfigClass {
@Bean("ds")
	public DataSource hikarids() {
	HikariDataSource hkds=new HikariDataSource();
	hkds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	hkds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
	hkds.setUsername("system");
	hkds.setPassword("sys");
	return hkds;
}
}
