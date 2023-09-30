package bo.edu.ucb.GrudBackend.Service;

import bo.edu.ucb.GrudBackend.Entity.TaskEntity;
import bo.edu.ucb.GrudBackend.Repository.TaskRepository;
import bo.edu.ucb.GrudBackend.dto.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class TaskService implements TaskServiceI {
    private TaskRepository taskRepository;

    @Autowired
    public void TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getAllTasks() {
        List<TaskEntity> taskEntities = taskRepository.findAll();
        return taskEntities.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public Task createTask(Task task) {
        TaskEntity taskEntity = convertToEntity(task);
        TaskEntity savedEntity = taskRepository.save(taskEntity);
        return convertToDto(savedEntity);
    }

    @Override
    public Task updateTask(Long taskId, Task task) {
        Optional<TaskEntity> optionalTaskEntity = taskRepository.findById(taskId);
        if (optionalTaskEntity.isPresent()) {
            TaskEntity taskEntity = optionalTaskEntity.get();
            taskEntity.setDescription(task.getDescription());
            taskEntity.setDate(task.getDate());
            taskEntity.setState(task.isStatus());
//            taskEntity.setLabelIds(task.getLabelIds());

            TaskEntity updatedEntity = taskRepository.save(taskEntity);
            return convertToDto(updatedEntity);
        } else {
            // Manejar la excepción si la tarea no se encuentra
            throw new TaskNotFoundException("Tarea no encontrada con ID: " + taskId);
        }
    }

    @Override
    public void deleteTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }

    @Override
    public Task getTaskById(Long taskId) {
        Optional<TaskEntity> optionalTaskEntity = taskRepository.findById(taskId);
        if (optionalTaskEntity.isPresent()) {
            return convertToDto(optionalTaskEntity.get());
        } else {
            // Manejar la excepción si la tarea no se encuentra
            throw new TaskNotFoundException("Tarea no encontrada con ID: " + taskId);
        }
    }

//    // Métodos de conversión entre DTO y Entity
    private TaskEntity convertToEntity(Task task) {
        return null;// Implementa la conversión de Task a TaskEntity aquí
    }
//
    private Task convertToDto(TaskEntity taskEntity) {
        return null;
        // Implementa la conversión de TaskEntity a Task aquí
    }
}
