package bo.edu.ucb.GrudBackend.Repository;

import bo.edu.ucb.GrudBackend.Entity.TaskEntity;
import bo.edu.ucb.GrudBackend.dto.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
