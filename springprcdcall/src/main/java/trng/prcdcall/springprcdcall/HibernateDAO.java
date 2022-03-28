package trng.prcdcall.springprcdcall;

import java.time.LocalDate;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository("DAOhb")
public class HibernateDAO {	
	public void procedurecall() {
		LocalDate dt=LocalDate.now();
		Configuration cfg=new Configuration();
		cfg.configure("trng/prcdcall/springprcdcall/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		StoredProcedureQuery pc=ses.createStoredProcedureQuery("INSERTDBUSER")
				.registerStoredProcedureParameter("p_userid", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_username", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_createdby", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_date", LocalDate.class, ParameterMode.IN)
				.setParameter("p_userid","1007")
				.setParameter("p_username","ANI")
				.setParameter("p_createdby","anirudh")
				.setParameter("p_date",dt);
		pc.execute();
	}
}
