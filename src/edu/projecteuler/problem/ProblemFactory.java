package edu.projecteuler.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.reflections.Reflections;

import edu.projecteuler.problem.annotation.Problem;


public class ProblemFactory {

	private static ProblemFactory problemFactory;
	private static Set<Class<?>> problems;
	
	
	static{
		problemFactory = new ProblemFactory();
		//start at the base of the project structure and scan for any class annotated with the Problem annotation.
		Reflections reflections = new Reflections("");
		problems = reflections.getTypesAnnotatedWith(Problem.class);
	}
	
	private ProblemFactory() {}
	
	public static ProblemFactory getInstance(){
		return problemFactory;
	}
	
	
	public static List<Class<?>> getAllProblems(){
		return new ArrayList<Class<?>>(problems);
	}
}