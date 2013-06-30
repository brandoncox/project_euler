package edu.projecteuler.problem;

import java.util.Date;

public abstract class AbstractProblem implements Executable{
	
	public Result runProblem(){
		Result result = new Result(getTitle(), getDescription());
		result.setAnswer(execute());
		result.setEnd(new Date());
		return result;
	}
	
	public abstract String getTitle();
	public abstract String getDescription();
	
}
