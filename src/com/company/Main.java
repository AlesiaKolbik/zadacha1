package com.company;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		double firstSquareSide = 3;
		double secondSquareSide = 4;
		double radius = 3;
		double diagonal = Math.sqrt((Math.pow(firstSquareSide, 2) + Math.pow(secondSquareSide, 2)));
		double diameter = radius * 2;

		if (diameter >= diagonal) {
			out.println("Закроет.");
		} else {
			out.println("Не закроет.");
		}
	}
}
