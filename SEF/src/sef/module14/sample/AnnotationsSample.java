package sef.module14.sample;
// Complete Code
import sef.module14.sample.Task;

public class AnnotationsSample {
	
	@Task(
			task="Remember to create this method",
			date="09/13/1977",
			assignedTo="John Doe")
	public void testFindPeople(){
	}
	@Task(
			task="Remember to create this method",
			date="09/13/1977",
			assignedTo="Luis Chua")
	public void testFindProject(){
	}
}
