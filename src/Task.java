
public class Task {
	private String task;
	private String description;
	private int id;
	private boolean check;
	
	public Task(String task, String description, int id, boolean check) {
		this.task = task;
		this.description = description;
		this.id = id;
		this.check = check;
	}
	
	public String getTask() {
		return task;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getId(){
		return id;
	}
	
	public void setCheck(boolean check) {
		this.check = check;
	}
	
	public String toString() {
		if(check == true) {
			return " [X] " + id + ": " + task; 
		}
		return " [ ] " + id + ": " + task; 
	}
}
