package sprng.trng.lb.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import sprng.trng.lb.dto.StudentDTO;
import sprng.trng.lb.service.LMIService;

@Component("controller")
public class MainController {

	@Autowired
	private LMIService service;
	
	public void fetchstudent(int sid,String name,String sadd,String course,int m1, int m2, int m3) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("sprng/trng/lb/cfgs/ApplicationContext.xml");
		StudentDTO dto=ctx.getBean("stddto",StudentDTO.class);
		dto.setsid(sid);
		dto.setName(name);
		dto.setSadd(sadd);
		dto.setCourse(course);
		dto.setM1(m1);
		dto.setM2(m2);
		dto.setM3(m3);
		service.enrollstud(dto);
	}

}
