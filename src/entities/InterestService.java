package entities;

import java.security.InvalidParameterException;

public interface InterestService {

double getInterestRate();
	
	default double payment(double valor, int meses) {
		if(meses < 1) {
			throw new InvalidParameterException("Os meses têm que ter um valor acima de zero");
		}
		return valor*(Math.pow(1 + getInterestRate() / 100, meses));
	}
}
