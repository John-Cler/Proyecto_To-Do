package bo.edu.ucb.GrudBackend.Repository;

import bo.edu.ucb.GrudBackend.Entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//Este código define una interfaz que extiende de  la interfaz JpaRepository.
public interface UserRepository extends JpaRepository<LoginEntity,Long> {
    LoginEntity findByUsername(String username);
}
