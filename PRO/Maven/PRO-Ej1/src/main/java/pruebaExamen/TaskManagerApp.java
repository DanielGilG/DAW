package pruebaExamen;

import pruebaExamen.entity.TaskPriority;
import pruebaExamen.service.TaskService;
import pruebaExamen.service.impl.TaskServiceImpl;

public class TaskManagerApp {
    public static void main(String[] args) {
        TaskService taskService = new TaskServiceImpl();

        System.out.println("--------ACTIVE TASKS--------");
        System.out.println(taskService.showActiveTasks());
        System.out.println(" ");
        System.out.println("--------COMPLETED TASKS--------");
        System.out.println(taskService.showCompletedTasks());
        System.out.println(" ");
        System.out.println("--------BY PRIORITY--------");
        System.out.println(taskService.showByPriority(TaskPriority.MEDIUM));
        System.out.println(" ");
        System.out.println("--------DESCRIPTIONS--------");
        System.out.println(taskService.findByWord("Mine"));
        System.out.println(taskService.findByWord("Fir"));
        System.out.println(" ");
    }
}
