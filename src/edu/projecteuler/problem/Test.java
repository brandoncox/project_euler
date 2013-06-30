package edu.projecteuler.problem;

import java.util.List;


public class Test {

	public static void main(String[] args){
		ProblemFactory factory = ProblemFactory.getInstance();
		List<Executable> problems = factory.getAllProblems();
		
		for (Executable problem : problems) {
			System.out.println(problem.execute());
		}

	}
}
