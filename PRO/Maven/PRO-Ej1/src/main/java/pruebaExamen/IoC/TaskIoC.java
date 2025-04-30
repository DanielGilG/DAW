package pruebaExamen.IoC;

import pruebaExamen.repository.TaskRepository;
import pruebaExamen.repository.impl.TaskRepositoryImpl;
import pruebaExamen.service.TaskService;
import pruebaExamen.service.impl.TaskServiceImpl;

public class TaskIoC {
    // Not entirely sure about this one :(
    TaskRepository taskRepository = new TaskRepositoryImpl();
    TaskService taskService = new TaskServiceImpl();
/*
    // It was something like this
    public void createService(){
        if (taskService == null){
            TaskService taskService = new TaskServiceImpl();
        }
    }
 */
}
