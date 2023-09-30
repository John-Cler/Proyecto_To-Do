package bo.edu.ucb.GrudBackend.Service;

import bo.edu.ucb.GrudBackend.dto.Task;

import java.util.List;

public interface TaskServiceI {
    List<Task> getAllTasks();
    Task createTask(Task task);
    Task updateTask(Long taskId, Task task);
    void deleteTask(Long taskId);
    Task getTaskById(Long taskId);
}
