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
        try {
            TaskEntity taskEntity = convertToEntity(task);
            TaskEntity savedEntity = taskRepository.save(taskEntity);
            return convertToDto(savedEntity);
        } catch (Exception e) {
            // Maneja la excepción y registra en los registros
            e.printStackTrace(); // Esto ayudará a identificar problemas específicos
            throw new RuntimeException("Error al crear la tarea: " + e.getMessage(), e);
        }
    }

    @Override
    public Task updateTask(Long taskId, Task task) {
        Optional<TaskEntity> optionalTaskEntity = taskRepository.findById(taskId);
        if (optionalTaskEntity.isPresent()) {
            TaskEntity taskEntity = optionalTaskEntity.get();
            taskEntity.setDescription(task.getDescription());
            taskEntity.setDate(task.getDate());
            taskEntity.setLabel(task.getLabel());
            taskEntity.setState(task.isState());
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
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setId(task.getId());
        taskEntity.setDescription(task.getDescription());
        taskEntity.setLabel(task.getLabel());
        taskEntity.setDate(task.getDate());
        taskEntity.setState(task.isState());
        return taskEntity;
    }
//
    private Task convertToDto(TaskEntity taskEntity) {
        Task task = new Task();
        task.setId(taskEntity.getId());
        task.setDescription(taskEntity.getDescription());
        task.setLabel(taskEntity.getLabel());
        task.setDate(taskEntity.getDate());
        task.setState(taskEntity.isState());
        // Si tienes una lista de etiquetas en TaskEntity, puedes copiarla a la lista labels de Task
        // task.setLabelIds(taskEntity.getLabels());

        return task;
        // Implementa la conversión de TaskEntity a Task aquí
    }
}
