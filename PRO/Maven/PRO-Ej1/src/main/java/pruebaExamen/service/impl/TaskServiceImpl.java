package pruebaExamen.service.impl;

import pruebaExamen.entity.TaskPriority;
import pruebaExamen.entity.Task;
import pruebaExamen.repository.TaskRepository;
import pruebaExamen.repository.impl.TaskRepositoryImpl;
import pruebaExamen.service.TaskService;

import java.util.List;

public class TaskServiceImpl implements TaskService {
    TaskRepository taskRepository = new TaskRepositoryImpl();

    @Override
    public Task markCompleted(Task task) {
        return taskRepository.markCompleted(task);
    }

    @Override
    public List<Task> showActiveTasks() {
        return taskRepository.showActiveTasks();
    }

    @Override
    public List<Task> showCompletedTasks() {
        return taskRepository.showCompletedTasks();
    }

    @Override
    public List<Task> showByPriority(TaskPriority taskPriority) {
        return taskRepository.showByPriority(taskPriority);
    }

    @Override
    public List<Task> findByWord(String word) {
        return taskRepository.findByWord(word);
    }

    @Override
    public void deleteTaskById(int id) {
        taskRepository.deleteTaskById(id);
    }

    @Override
    public Task editDescription(Task task, String newDescription) {
        return taskRepository.editDescription(task, newDescription);
    }
}
