import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int user_choice = 0;
		String task;
		String description;
		Scanner scan = new Scanner(System.in);
		TaskManager manager = new TaskManager();
		
		
		
		System.out.println("Welcome to your To Do List!");
		System.out.println(" ");
		
		while(user_choice != 5) {
			System.out.println("1. Add Task");
			System.out.println("2. List Task");
			System.out.println("3. Mark Done");
			System.out.println("4. Remove Task");
			System.out.println("5. Exit");
			
			System.out.println(" ");
			
			System.out.print("Choose an option: ");
			
			user_choice = scan.nextInt();
			
			System.out.println(" ");
			
			if(user_choice == 1) {
				
				System.out.print("Enter task title: ");
				task = scan.next();
				
				System.out.print("Enter task description: ");
				description = scan.next();
				
				manager.createTask(task, description);
				
				System.out.println(" ");
				
				System.out.println("Success!");
				
				System.out.println(" ");
				
			}
			else if(user_choice == 2) {
				System.out.println("------------");
				manager.showList();
				System.out.println("------------");
			}
			
			else if(user_choice == 3) {
				System.out.println("------------");
				manager.showList();
				System.out.println("------------");
				System.out.print("Which task would you like to mark: ");
				int mark_choice = scan.nextInt();
				
				manager.markTask(mark_choice);
			}
			else if(user_choice == 4) {
				System.out.println("------------");
				manager.showList();
				System.out.println("------------");
				System.out.print("Which task would you like to remove: ");
				int remove_choice = scan.nextInt();
				
				manager.removeTask(remove_choice);
			}
			else if(user_choice > 5) {
				System.out.print("Error. Please enter a number between 1 - 5");
			}
		}
		System.out.print("Goodbye.");
	}
}
