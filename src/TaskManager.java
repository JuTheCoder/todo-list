import java.util.ArrayList;

public class TaskManager {
	private ArrayList<Task> task_list = new ArrayList<>();
	private int id = 1;
	private boolean check = false;
	
	public TaskManager() {
		
	}
	
	public void createTask(String task, String description) {
		Task user_task = new Task(task, description, id, check);
		addTask(user_task);
		id++;
	}
	
	public void addTask(Task task) {
		task_list.add(task);
	}
	
	public void removeTask(int id) {
		boolean found = false;
		for(int i = 0; i < task_list.size(); i++) {
			Task task = task_list.get(i);
			int current_task = task.getId();
			
			if(current_task == id) {
				task_list.remove(i);
				System.out.println("Success!");
				found = true;
				break;
			}
		}
		if(found == false) {
			System.out.println("Task not found.");
		}
	}
	
	public void showList() {
		for(int i = 0; i < task_list.size(); i++) {
			System.out.println(task_list.get(i));
		}
	}
	
	public void markTask(int choice) {
		boolean flag = false;
		for(int i = 0; i < task_list.size(); i++) {
			Task task = task_list.get(i);
			int current_id = task.getId();
	
			if(current_id == choice) {
				flag = true;
				task.setCheck(flag);
				System.out.println("Success!");
				break;
				
			}
		}
		if(flag == false) {
			System.out.println("Task not found.");
		}
	}
	
	
}
