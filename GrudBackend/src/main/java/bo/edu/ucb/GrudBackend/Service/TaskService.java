//package bo.edu.ucb.GrudBackend.Service;
//
//import bo.edu.ucb.GrudBackend.Entity.TaskEntity;
//import bo.edu.ucb.GrudBackend.Repository.TaskRepository;
//import bo.edu.ucb.GrudBackend.dto.Task;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//
//public class TaskService {
//
//    @Autowired
//    private TaskRepository taskRepository;
//
//
//    public TaskService(TaskRepository taskRepository) {
//        this.taskRepository = taskRepository;
//    }
//
//    public List<Task> getAllTasks() {
//        return taskRepository.findAll();
//    }
//
//    public Task createTask(TaskEntity taskEntity) {
//        Task task = new Task();
//        task.setDescription(taskEntity.getDescription());
//        task.setDate(taskEntity.getDate());
//        task.setStatus(false);
//        return taskRepository.save(task);
//    }
//    public Task updateTask(Long taskId, TaskEntity taskEntity)  {
//        Task existingTask = taskRepository.findById(taskId)
//                .orElseThrow(() -> new TaskNotFoundException("Tarea no encontrada"));
//
//        existingTask.setDescription(taskEntity.getDescription());
//        existingTask.setDate(taskEntity.getDate());
////        existingTask.setStatus(taskEntity.getStatus());
//
//        return taskRepository.save(existingTask);
//    }
//
//    public void deleteTask(Long taskId) {
//        taskRepository.deleteById(taskId);
//    }
//}
