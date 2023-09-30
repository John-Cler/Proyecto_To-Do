//package bo.edu.ucb.GrudBackend.api;
//
//import bo.edu.ucb.GrudBackend.Entity.TaskEntity;
//import bo.edu.ucb.GrudBackend.Service.TaskService;
//import bo.edu.ucb.GrudBackend.bl.EtiquetaBl;
//import bo.edu.ucb.GrudBackend.bl.LoginBl;
//import bo.edu.ucb.GrudBackend.dto.Response;
//import bo.edu.ucb.GrudBackend.dto.Task;
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.net.http.HttpRequest;
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
////@CrossOrigin(origins = "*")
//@RequestMapping("/tasks")
//public class TaskApi {
////    private List<Task> tasks = new ArrayList<>();
////    //Retorna todas las tareas
////    @GetMapping("/api/v1/task")
////    public Response<List<Task>> getAllTasks(@RequestHeader ("Authorization")String token) {
////        LoginBl loginBl =new LoginBl();
////        if (!loginBl.validateToken(token)){
////            Response<List<Task>> response = new Response<>();
////            response.setCode("0001");
////            response.setResponse(null);
////            response.setErrorMessage(" token Invalido");
////            return response;
////        }
////        Response<List<Task>> response = new Response<>();
////        response.setCode("0000");
////        response.setResponse(tasks);
////        return response;
////    }
////    //Obtiene el detalle de una tareapor el ID
////
////    @GetMapping("/api/v1/task/{idTask}")
////    public Response<Task> getTaskId( @PathVariable("idTask") Integer id, @RequestHeader("Authorization") String token){
////        Response<Task> response = new Response<>();
////        LoginBl loginBl =new LoginBl();
////        if (!loginBl.validateToken(token)){
////            response.setCode("0001");
////            response.setResponse(null);
////            response.setErrorMessage("token Invalido");
////            return response;
////        }
////        //Busca el elemento en la lista
////        Task task =tasks.stream().filter(t -> t.getTaskId().equals(id)).findFirst().orElse(null);
////        //Si no existe retorna un error
////        if (task == null){
////            response.setCode("404");
////            response.setResponse(null);
////            response.setErrorMessage("Tarea no encontrada");
////            return response;
////        }else {
////            //Si existe retorna el elemento
////            response.setCode("0000");
////            response.setResponse(task);
////            return response;
////        }
////    }
////    //Actualiza una tarea
////    @PutMapping("/api/v1/task/{idTask}")
////    public Response<Task> updateTaskById( @PathVariable Integer idTask, @RequestBody Task newTask, @RequestHeader("Authorization") String token) {
////        Response<Task>
////    }
//    @Autowired
//    private TaskService taskService;
//
//    @GetMapping
//    public List<Task> getAllTasks() {
//        return taskService.getAllTasks();
//    }
//
//    @PostMapping
//    public Task createTask(@RequestBody TaskEntity taskEntity) {
//        return taskService.createTask(taskEntity);
//    }
//
//    @PutMapping("/{taskId}")
//    public Task updateTask(@PathVariable Long taskId, @RequestBody TaskEntity taskEntity) {
//        return taskService.updateTask(taskId, taskEntity);
//    }
//
//    @DeleteMapping("/{taskId}")
//    public ResponseEntity<Void> deleteTask(@PathVariable Long taskId) {
//        taskService.deleteTask(taskId);
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }
//
//}
