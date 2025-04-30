package pruebaExamen.entity;

public class Task {
    private int id;
    private String description;
    private State state;
    private TaskPriority taskPriority;

    public Task(){

    }

    public Task(int id, String description, State state, TaskPriority taskPriority) {
        this.id = id;
        this.description = description;
        this.state = state;
        this.taskPriority = taskPriority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public TaskPriority getPriority() {
        return taskPriority;
    }

    public void setPriority(TaskPriority taskPriority) {
        this.taskPriority = taskPriority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", state=" + state +
                ", priority=" + taskPriority +
                '}';
    }
}
