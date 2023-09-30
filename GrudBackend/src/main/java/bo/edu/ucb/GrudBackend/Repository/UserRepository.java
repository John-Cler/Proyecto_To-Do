package bo.edu.ucb.GrudBackend.Repository;

import bo.edu.ucb.GrudBackend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository {
    User findByUsername(String username);
}
