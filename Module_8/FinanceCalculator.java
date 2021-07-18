package Module_8;

public class FinanceCalculator extends KondaEnhancedFutureValueApp{

	
	//Method to calculate future value.
    static double calculateFutureValue(double monthlyPayment,double rate, int years)
    {
    	double months=years*getMONTHS_IN_YEAR();
    	double interestRate=(1+rate/100);
    	
    	double presentValue=monthlyPayment*months;
    	double futureValue=(presentValue * (Math.pow(interestRate, months)));
    	
		return futureValue;
    	
    }
    
    
	
}
