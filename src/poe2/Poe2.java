/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe2;

import javax.swing.JOptionPane;


/**
 *
 * @author RC_Student_lab
 */
public class Poe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
		JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
		
		int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks to add"));
		
		Task[] tasks = new Task[numTasks];
		
		for (int i = 0; i < numTasks; i++) {
			String taskName = JOptionPane.showInputDialog("Enter task name");
			String taskDescription = JOptionPane.showInputDialog("Enter task description");
			String developerDetails = JOptionPane.showInputDialog("Enter developer details");
			int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration"));
			
			Task task = new Task(taskName, i, taskDescription, developerDetails, taskDuration);
			tasks[i] = task;
			
			JOptionPane.showMessageDialog(null, task.printTaskDetails());
		}
		
		int totalHours = 0;
		for (Task task : tasks) {
			totalHours += task.returnTotalHours();
		}
		
		JOptionPane.showMessageDialog(null, "Total hours: " + totalHours);
	}
}

       
    
    

