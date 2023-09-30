package bo.edu.ucb.GrudBackend.Repository;

import bo.edu.ucb.GrudBackend.Entity.LabelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtiquetaRepository extends JpaRepository<LabelEntity, Long> {


}
