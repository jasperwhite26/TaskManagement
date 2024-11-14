public class Task {
    private String name;
    private Priority priority;

    public Task(String name, Priority priority){
        this.name = name;
        this.priority = priority;
    }

    public void displayTask(){
        System.out.println("Task: " + name + ", Priority: " + priority);
    }
}
