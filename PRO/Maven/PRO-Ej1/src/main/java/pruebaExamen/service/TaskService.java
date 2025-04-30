package pruebaExamen.service;

import pruebaExamen.entity.TaskPriority;
import pruebaExamen.entity.Task;

import java.util.List;

public interface TaskService {
    Task markCompleted(Task task);
    List<Task> showActiveTasks();
    List<Task> showCompletedTasks();
    List<Task> showByPriority(TaskPriority taskPriority);
    List<Task> findByWord(String word);
    void deleteTaskById(int id);
    Task editDescription(Task task, String newDescription);
}
