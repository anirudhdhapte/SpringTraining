package trng.sprng.miniproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("controller")
public class MainController {
	@Autowired
	private CustomerMgmtService service;

	public  String  processCustomer(CustomerVO  vo)throws Exception{
		CustomerDTO dto=null;
		String result=null;
		//convert  VO class object to DTO class object
		dto=new CustomerDTO();
		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setPamt(Float.parseFloat(vo.getpAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		//use service
		result=service.calculateIntrestAmount(dto);
		return result;
		
	}
}
