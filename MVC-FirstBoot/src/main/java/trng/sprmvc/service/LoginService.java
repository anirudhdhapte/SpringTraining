package trng.sprmvc.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import trng.sprmvc.entity.UsernPWD;
import trng.sprmvc.repo.LoginREPO;

@Component
public class LoginService {

	@Autowired
	private LoginREPO lp;
	private UsernPWD up;
	public boolean logincheck(String username,String password) {
		try {
			up=lp.findById(username).get();
		}
		catch(NoSuchElementException e) {
			return false;
		}
		if(password.equals(up.getPassword()))
			return true;
		else
			return false;
	}
}
