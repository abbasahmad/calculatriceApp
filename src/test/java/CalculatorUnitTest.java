package test.java;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import main.java.Calculator;


public class CalculatorUnitTest {
	

	Calculator calculator;

   

    @Before
    public void setUp() {
    	calculator = new Calculator();
    }

 

    // TODO Ajouter des Methodes de test ici
    
    @Test
    public void additionnerTest() {
    	
    	double resultat = calculator.additionner(1, 1);
        assertEquals(2, resultat, 0);
        assertEquals(2, calculator.additionner(3.14, -1.14), 0.001);
       
    }

    @Test
    public void soustraireTest() {
        assertEquals(0, calculator.soustraire(1, 1), 0);
        assertEquals(4.86, calculator.soustraire(3.14, -1.72), 0.001);
        
    }

    @Test
    public void multiplierTest() {
        assertEquals(8, calculator.multiplier(4, 2), 0);
        assertEquals(-5.4008, calculator.multiplier(3.14, -1.72), 0.001);
        
    }

    @Test
    public void diviserTest() {
        assertEquals(2, calculator.diviser(4, 2), 0);
        assertEquals(-1.826, calculator.diviser(3.14, -1.72), 0.001);
       
    }

    @Test()
    public void diviserTestException() {
    	
    	assertThrows(IllegalArgumentException.class, () -> calculator.diviser(2, 0));
    }
    
    
    @Test
    public void calculPerimetreCercleTest() {
    	assertEquals(18.84, calculator.calculPerimetreCercle(3.0), 0.01);
    	
    }
    
    
    @Ignore
    @Test
    public void racineCarreTest() {
    	
    	assertEquals(2, calculator.racineCarre(4), 0);
    	assertEquals(1.41, calculator.racineCarre(2), 0.01);
    	
    }
    
    
}
