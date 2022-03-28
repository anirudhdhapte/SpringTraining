package trng.sprmvc.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import trng.sprmvc.entity.UploadFiles;
import trng.sprmvc.entity.UserDetails;
import trng.sprmvc.entity.UsernPWD;
import trng.sprmvc.model.ULorDLFiles;
import trng.sprmvc.service.EmpOperations;
import trng.sprmvc.service.LoginService;
import trng.sprmvc.service.ULDLFileService;

@Controller
public class HomeController {

	@Autowired
	private LoginService ls;
	@Autowired
	private EmpOperations eo;
	@Autowired
	private ULDLFileService ud;
	@Autowired
	private ServletContext sc;
	
	@GetMapping("/")
	public String homepage(@ModelAttribute("loginform") UsernPWD up) {
		//return "login";
		return "homepage";
}
	@PostMapping("/")
	public String formsubmit(@ModelAttribute("loginform") UsernPWD up,Map<String,Object> map, RedirectAttributes reda) {
		if(ls.logincheck(up.getUsername(),up.getPassword())) {
			return "homepage";
		}
			
		else {
			reda.addFlashAttribute("loginstatus","Invalid Credentials");
			return "redirect:/";
		}
			
}
	@GetMapping("/delete")
	public String deleteid(@RequestParam Integer no, Map<String,Object> map) {
		eo.deleteempdetails(no);
		return "redirect:emplist";
	}
	
	@GetMapping("/emplist")
	public String emplist(Map<String,Object> map) {
		map.put("empdetails",eo.listempdetails());
		return "emplist";
	}
	
	@GetMapping("/edit")
	public String fetchemp(@ModelAttribute("editform") UserDetails ud, @RequestParam Integer no) {
		UserDetails ud1=eo.getempdetails(no);
		BeanUtils.copyProperties(ud1, ud);
		return "editemp";
	}
	
	@PostMapping("/edit")
	public String editemp(@ModelAttribute("editform") UserDetails ud) {
		eo.submitempdetails(ud);
		return "redirect:emplist";
	}
	
	@GetMapping("/homepage")
	public String homepage() {
		return "homepage";
	}
	
	@GetMapping("/upload")
	public String getuploadpage(@ModelAttribute("uploadform") UploadFiles uf) throws IOException {
		return "upload";
	}
	
	@PostMapping("/upload")
	public String postuploadpage(@ModelAttribute("uploadform") ULorDLFiles uf,RedirectAttributes ra) throws IOException {
		String status=ud.uploadfile(uf);
		ra.addFlashAttribute("uploadstatus", status);
		return "redirect:upload";
	}
	
	@GetMapping("/downloadlist")
	public String filelist(Map<String,Object> map) {
		map.put("filedetails",ud.listfiles());
		return "download";
	}
	
	@GetMapping("/download")
	public String download(@RequestParam("path") String filename,HttpServletResponse res) throws IOException {
		File file=new File(filename);
		System.out.println(filename);
		res.setContentLengthLong(file.length());
		String mimeType=sc.getMimeType(filename);
		System.out.println(mimeType);
		res.setContentType(mimeType!=null?mimeType:"application/octet-stream");
		//res.setContentType("application/octet-stream");
		res.addHeader("Content-Disposition","attachment;filename="+file.getName());
		System.out.println(file.getName());
		InputStream is=new FileInputStream(file);
		OutputStream os=res.getOutputStream();
		IOUtils.copy(is, os);
		is.close();
		os.close();
		return null;
	}
	
	@GetMapping("/pagedemplist")
	public String pagedemplist(Map<String,Object> map,@PageableDefault(direction = Direction.ASC,size=4,sort="empno")Pageable pageable) {
		map.put("empdetails",eo.pagedempdetails(pageable));
		return "pagedemplist";
	}
}
