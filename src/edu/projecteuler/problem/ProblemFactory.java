package edu.projecteuler.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.reflections.Reflections;

import edu.projecteuler.problem.annotation.Problem;


public class ProblemFactory {

	private static ProblemFactory problemFactory;
	private static Set<Class<?>> problemClasses;
	private static Map<String, Executable> problemMap;
	
	// static initializer
	static{
		problemFactory = new ProblemFactory();
		problemMap = new HashMap<String, Executable>();
		//start at the base of the project structure and scan for any class annotated with the Problem annotation.
		Reflections reflections = new Reflections("");
		problemClasses = reflections.getTypesAnnotatedWith(Problem.class);
		for (Class<?> clazz : problemClasses) {
			try {
				Executable newProblem = (Executable)clazz.newInstance();
				problemMap.put(clazz.getSimpleName(), newProblem);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	private ProblemFactory() {}
	
	public static ProblemFactory getInstance(){
		return problemFactory;
	}
	
	public Executable getProblem(String key){
		return problemMap.get(key);
	}
	
	public List<Executable> getAllProblems(){
		return new ArrayList<Executable>(problemMap.values());
	}
}