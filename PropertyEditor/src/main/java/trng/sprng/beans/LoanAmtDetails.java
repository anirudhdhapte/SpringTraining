package trng.sprng.beans;

import org.springframework.stereotype.Component;

@Component
public class LoanAmtDetails {
private float amount,rate,term;

public float getAmount() {
	return amount;
}

public void setAmount(float amount) {
	this.amount = amount;
}

public float getRate() {
	return rate;
}

public void setRate(float rate) {
	this.rate = rate;
}

public float getTerm() {
	return term;
}

public void setTerm(float term) {
	this.term = term;
}
}
