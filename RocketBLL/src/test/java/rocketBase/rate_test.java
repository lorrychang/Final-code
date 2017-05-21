package rocketBase;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import exceptions.RateException;
import rocketDomain.RateDomainModel;


public class rate_test {

	private static RateDomainModel rate0;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test() {
		
		assertEquals(1,1);
		
	}
	
	@Test
	public void Ratetest() {
		double dInterestRate = 0;
		try {
			dInterestRate = RateBLL.getRate(100);
		} catch (RateException e) {
			e.printStackTrace();
		}
		assertEquals(dInterestRate, 10.0, 0.1);
	}

}
