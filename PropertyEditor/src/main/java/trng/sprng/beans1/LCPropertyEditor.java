package trng.sprng.beans1;

import java.beans.PropertyEditorSupport;

public class LCPropertyEditor extends PropertyEditorSupport {
LoanAmtDetails details;
	@Override
public void setAsText(String text) throws IllegalArgumentException {
String val[]=null;
val=text.split(",");
details=new LoanAmtDetails();
details.setAmount(Float.parseFloat(val[0]));
details.setRate(Float.parseFloat(val[1]));
details.setTerm(Float.parseFloat(val[2]));
setValue(details);
}
}
