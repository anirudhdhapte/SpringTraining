package trng.prcdcall.springprcdcall;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "trng.prcdcall")
@PropertySource(value="trng/prcdcall/springprcdcall/jdbc.properties")
public class AppConfig {
	@Autowired
	private Environment env;
	
	@Bean("hkds")
	public DataSource createDS() {
		HikariDataSource hkds=new HikariDataSource();
		hkds.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
		hkds.setUsername(env.getRequiredProperty("jdbc.user"));
		hkds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		hkds.setPassword(env.getRequiredProperty("jdbc.password"));
		return hkds;
	}
	@Bean
	public JdbcTemplate createJdbcTemplate() {
		return new JdbcTemplate(createDS());
	}

}
