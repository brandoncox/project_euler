package edu.projecteuler.problem.impl;

import edu.projecteuler.problem.AbstractProblem;
import edu.projecteuler.problem.annotation.Problem;

@Problem
public class Problem1 extends AbstractProblem {

	private static int UPPER = 1000;
	private int total = 0;
	
	public String execute() {
		for (int i = 0; i < UPPER; i++) {
			if(i % 3 == 0 || i % 5 == 0)
				total += i;
		}
		return String.valueOf(total);
	}

	public String getDescription() {
		return "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. \n" +
				"The sum of these multiples is 23.\n" +
				"Find the sum of all the multiples of 3 or 5 below 1000.";
	}

	public String getTitle() {
		return "Multiples of 3 and 5";
	}
	

}
