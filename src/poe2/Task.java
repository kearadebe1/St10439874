/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe2;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    
	private String taskName;
	private int taskNumber;
	private String taskDescription;
	private String developerDetails;
	private int taskDuration;
	private String taskID;
	private String taskStatus;

	public Task(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration) {
		this.taskName = taskName;
		this.taskNumber = taskNumber;
		this.taskDescription = taskDescription;
		this.developerDetails = developerDetails;
		this.taskDuration = taskDuration;
		this.taskID = createTaskID();
		this.taskStatus = "To Do";
	}

	public boolean checkTaskDescription() {
		return taskDescription.length() <= 50;
	}

	public String createTaskID() {
		return (taskName.substring(0, 2) + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length() - 3)).toUpperCase();
	}

	public String printTaskDetails() {
		return "Task Status: " + taskStatus + "\nDeveloper Details: " + developerDetails + "\nTask Number: " + taskNumber + "\nTask Name: " + taskName + "\nTask Description: " + taskDescription + "\nTask ID: " + taskID + "\nDuration: " + taskDuration + " hours";
	}

	public int returnTotalHours() {
		return taskDuration;
	}
}


