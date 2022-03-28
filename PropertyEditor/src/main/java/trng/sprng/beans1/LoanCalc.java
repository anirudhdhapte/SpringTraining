package trng.sprng.beans1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoanCalc {
@Autowired
	private LoanAmtDetails details;

public LoanCalc(LoanAmtDetails details) {
	this.details = details;
}
public void calcinterestamt() {
	System.out.println("Interest Amount is: "+(details.getAmount()*details.getRate()*details.getTerm())/100.0f);
}
}
