package main.java;

public class Calculator {
	
	

	Pi pi = new Pi();
	//Addition
    public double additionner(double a, double b) {
        return a + b;
    }

    //Soustraction
    public double soustraire(double a, double b) {
        return a - b;
    }

    //Multiplication
    public double multiplier(double a, double b) {
        return a * b;
    }

    //Division
    public double diviser(double a, double b) {
        if (b == 0)
            throw new IllegalArgumentException("Cannot divide by zero!");
        return a / b;
    }
    
    public double calculPerimetreCercle(double r) {
    	
    	return 2*pi.getPi()*r;
    	
    }
    
    public double racineCarre(double x) {
    	
    	
    	double t;
    	double rcarre = x/2;
    	do {
    		t = rcarre;
    		rcarre = (t+(x/t))/2;
    	} while((t-rcarre) != 0);
    	
    	return rcarre;
    }
    
    
    

}
