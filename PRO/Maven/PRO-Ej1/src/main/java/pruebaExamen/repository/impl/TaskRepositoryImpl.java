package pruebaExamen.repository.impl;

import pruebaExamen.entity.TaskPriority;
import pruebaExamen.entity.State;
import pruebaExamen.entity.Task;
import pruebaExamen.repository.TaskRepository;

import java.util.ArrayList;
import java.util.List;

public class TaskRepositoryImpl implements TaskRepository {
    Task t1 = new Task(1, "Firefox", State.PENDING, TaskPriority.MEDIUM);
    Task t2 = new Task(2, "Chrome", State.PENDING, TaskPriority.HIGH);
    Task t3 = new Task(3, "Photoshop", State.COMPLETED, TaskPriority.MEDIUM);
    Task t4 = new Task(4, "Minecraft", State.PENDING, TaskPriority.HIGH);
    Task t5 = new Task(5, "Music", State.PENDING, TaskPriority.LOW);
    Task t6 = new Task(6, "Calendar", State.COMPLETED, TaskPriority.LOW);
    List<Task> tasks;

    public TaskRepositoryImpl() {
        tasks = new ArrayList<Task>();
        tasks.add(t1);
        tasks.add(t2);
        tasks.add(t3);
        tasks.add(t4);
        tasks.add(t5);
        tasks.add(t6);
    }

    @Override
    public Task markCompleted(Task task) {
        task.setState(State.COMPLETED);
        return task;
    }

    @Override
    public List<Task> showActiveTasks() {
        return tasks.stream().filter(task -> (task.getState() == State.PENDING)).toList();
    }

    @Override
    public List<Task> showCompletedTasks() {
        return tasks.stream().filter(task -> (task.getState() == State.COMPLETED)).toList();
    }

    @Override
    public List<Task> showByPriority(TaskPriority taskPriority) {
        return tasks.stream().filter(task -> ((task.getPriority() == taskPriority))).toList();
    }

    @Override
    public List<Task> findByWord(String word) {
        return tasks.stream().filter(task -> (task.getDescription().contains(word))).toList();
    }

    @Override
    public void deleteTaskById(int id) {
        tasks.remove((Task) tasks.stream().filter(task -> (task.getId() == id)));
    }

    @Override
    public Task editDescription(Task task, String newDescription) {
        task.setDescription(newDescription);
        return task;
    }
}
