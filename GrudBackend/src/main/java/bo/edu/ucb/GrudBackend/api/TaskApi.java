package bo.edu.ucb.GrudBackend.api;

import bo.edu.ucb.GrudBackend.Service.TaskServiceI;
import bo.edu.ucb.GrudBackend.dto.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
//@RequestMapping("/tasks")
public class TaskApi {
    private final TaskServiceI taskServiceI;
    // La siguiente línea define un constructor para la clase TaskApi
    @Autowired
    public TaskApi(TaskServiceI taskServiceI) {
        this.taskServiceI = taskServiceI;
    }
    /* Este constructor se utiliza para inyectar (autowire) una instancia de TaskServiceI en TaskApi.
     Spring Boot maneja la creación y gestión de esta instancia automáticamente.*/

    // La siguiente línea define un método HTTP GET que responde a la URL "/api/v1/alltask"
    @GetMapping("/api/v1/alltask")
    public List<Task> getAllTasks() {
        return taskServiceI.getAllTasks();
    }
    // Este método permite obtener una lista de todas las tareas y devuelve una lista de objetos Task.

    // La siguiente línea define un método HTTP POST que responde a la URL "/api/v1/create"
    @PostMapping("/api/v1/create")
    public Task createTask(@RequestBody Task task) {
        return taskServiceI.createTask(task);
    }
    // Este método permite crear una nueva tarea y devuelve la tarea creada.

    // Esta línea define un método HTTP PUT que responde a la URL "/api/v1/update/{taskId}"
    @PutMapping("/api/update/{taskId}")
    public Task updateTask(@PathVariable Long taskId, @RequestBody Task task) {
        return taskServiceI.updateTask(taskId, task);
    }
    // Este método permite actualizar una tarea existente y devuelve la tarea actualizada.

    // La siguiente línea define un método HTTP DELETE que responde a la URL "/api/v1/delete/{taskId}"
    @DeleteMapping("/api/delete{taskId}")
    public void deleteTask(@PathVariable Long taskId) {
        taskServiceI.deleteTask(taskId);
    }
    // Este método permite eliminar una tarea existente.

    // La siguiente línea define un método HTTP GET que responde a la URL "/api/v1/gettask/{taskId}"
    @GetMapping("/api/gettask{taskId}")
    public Task getTaskById(@PathVariable Long taskId) {
        return taskServiceI.getTaskById(taskId);
    }
    // Este método permite obtener una tarea por su ID y devuelve la tarea correspondiente.
}
