package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException 
	{
		double dInterestRate = 0;
		
		compare(GivenCreditScore);
		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		
		return GivenCreditScore;
	}	 
		
		public static double main(double dInterestRate) {
				
			    main(dInterestRate);
		
			    return dInterestRate;
		
	}
	
	
	
	private static int compare(int givenCreditScore) {
		
		return givenCreditScore;
		
	}

	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
