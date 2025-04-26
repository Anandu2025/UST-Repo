package com.ust.OverloadingDemo;
import java.util.logging.Logger;
public class AreaCalculator {

	public static Logger logger = Logger.getLogger(AreaCalculator.class.getName());
	//Square
	int area(int side) {
		return side*side;
		
	}
	//Rectangle
	double area(int length,int breadth) {
		return length*breadth;
		
	}
	//Circle
	double area(double radius) {
		return Math.PI*radius*radius;
		
	}
	//triangle
	double area(double base,double height) {
		return 0.5*base*height;
	}
	public static void main(String[] args) {
		AreaCalculator c = new AreaCalculator();
		logger.info("Area of square"+c.area(5));
		logger.info("Area of rectangle"+c.area(10,8));
		logger.info("Area of circle"+c.area(4.76));
		logger.info("Area of triangle"+c.area(5.53,4.4));
	}
	

	}


