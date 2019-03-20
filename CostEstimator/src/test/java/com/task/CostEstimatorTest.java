package com.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CostEstimatorTest {

	@Test
	void Estimatecosttest() {
		CostEstimator c=new CostEstimator();
		assertEquals(3000000,c.costestimator(2500,"standard"));
		assertEquals(441540,c.costestimator(245.3, "highstandard"));
		assertEquals(754500,c.costestimator(503,"abovestandard"));
		assertEquals(3750000,c.costestimator(1500,"fullyautomatedhouse"));
		
	}

}
