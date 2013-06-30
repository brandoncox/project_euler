package edu.projecteuler.problem;

import java.text.DateFormat;
import java.util.Date;


public class Result{
	
	private static final String RESULT_DELIMITER = "------------------------------------";
	private static final DateFormat formatter = new java.text.SimpleDateFormat("HH:mm:ss");
	private String problemName;
	private String description;
	private String answer;
	private Date start;
	private Date end;
	
	public Result(String problemName, String description) {
		this.problemName = problemName;
		this.description = description;
		this.start = new Date();
	}
	
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public void setEnd(Date end) {
		this.end = end;
	}


	public void writeResultToConsole(){
		StringBuilder builder = new StringBuilder();
		builder.append(RESULT_DELIMITER)
		.append("Problem: ").append(problemName)
		.append(description)
		.append(answer)
		.append(formatter.format(start))
		.append(formatter.format(end))
		.append(RESULT_DELIMITER);
		System.out.println(builder.toString());
	}
}
