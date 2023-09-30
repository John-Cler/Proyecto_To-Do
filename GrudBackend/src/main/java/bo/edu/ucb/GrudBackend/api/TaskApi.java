package bo.edu.ucb.GrudBackend.api;

import bo.edu.ucb.GrudBackend.Service.TaskServiceI;
import bo.edu.ucb.GrudBackend.dto.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "*")
@RequestMapping("/tasks")
public class TaskApi {
    private final TaskServiceI taskServiceI;

    @Autowired
    public TaskApi(TaskServiceI taskServiceI) {
        this.taskServiceI = taskServiceI;
    }
    @GetMapping
    public List<Task> getAllTasks() {
        return taskServiceI.getAllTasks();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskServiceI.createTask(task);
    }

    @PutMapping("/{taskId}")
    public Task updateTask(@PathVariable Long taskId, @RequestBody Task task) {
        return taskServiceI.updateTask(taskId, task);
    }

    @DeleteMapping("/{taskId}")
    public void deleteTask(@PathVariable Long taskId) {
        taskServiceI.deleteTask(taskId);
    }

    @GetMapping("/{taskId}")
    public Task getTaskById(@PathVariable Long taskId) {
        return taskServiceI.getTaskById(taskId);
    }
}
