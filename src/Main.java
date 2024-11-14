public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Finish Essay", Priority.HIGH);
        Task task2 = new Task("Grocery Shopping", Priority.MEDIUM);
        Task task3 = new Task("Watch Show", Priority.LOW);

        task1.displayTask();
        task2.displayTask();
        task3.displayTask();
    }
}
