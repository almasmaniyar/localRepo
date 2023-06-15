package miniprojects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.next();
                    
                    Task task = new Task(description);
                    taskList.add(task);
                    System.out.println("Task added successfully!");
                    break;
                    
                case 2:
                    System.out.println("Task List:");
                    for (Task t : taskList) {
                        System.out.println("Description: " + t.getDescription());
                        System.out.println("Completed: " + t.isCompleted());
                        System.out.println();
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter the index of the task to mark as completed: ");
                    int index = scanner.nextInt();
                    
                    if (index >= 0 && index < taskList.size()) {
                        Task selectedTask = taskList.get(index);
                        selectedTask.setCompleted(true);
                        System.out.println("Task marked as completed!");
                    } else {
                        System.out.println("Invalid task index!");
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}

class Task {
    private String description;
    private boolean completed;
    
    public Task(String description) {
        this.description = description;
        this.completed = false;
    }
    
    public String getDescription() {
        return description;
    }
    
    public boolean isCompleted() {
        return completed;
    }
    
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
