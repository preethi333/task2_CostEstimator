package com.task;
/**
 * Program to estimate house construction cost
 * @author PREETHI
 *
 */
public class CostEstimator {

	double areaofhouse;
	String material;
	/**
	 * fun to calculate to estimated cost for construction
	 * @param areaofhouse
	 * @param material
	 * @return cost estimated
	 */
	public double costestimator(double areaofhouse,String material) {
		double cost=0;
		if(material.equals("standard")) {
			cost=areaofhouse*1200;
		}
		else if(material.equals("abovestandard")) {
			cost=areaofhouse*1500;
		}
		else if(material.equals("highstandard")) {
			cost=areaofhouse*1800;
		}
		else {
			cost=areaofhouse*2500;
		}
		return cost;
	}
}
