package edu.projecteuler.problem.impl;

import edu.projecteuler.problem.AbstractProblem;
import edu.projecteuler.problem.annotation.Problem;

@Problem
public class Problem3 extends AbstractProblem{

	public String execute() {
		return null;
	}

	
	public String getTitle() {
		return "Largest prime factor";
	}

	public String getDescription() {
		return descriptionBuilder.append("The prime factors of 13195 are 5, 7, 13 and 29.")
		.append(NEW_LINE)
		.append("What is the largest prime factor of the number 600851475143 ?")
		.toString();
	}

}
