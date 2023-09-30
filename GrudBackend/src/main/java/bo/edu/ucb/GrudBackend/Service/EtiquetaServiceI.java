package bo.edu.ucb.GrudBackend.Service;

import bo.edu.ucb.GrudBackend.Entity.LabelEntity;
import bo.edu.ucb.GrudBackend.Repository.EtiquetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtiquetaServiceI implements EtiquetaService {
    private final EtiquetaRepository etiquetaRepository;

    @Autowired
    public EtiquetaServiceI(EtiquetaRepository etiquetaRepository) {
        this.etiquetaRepository = etiquetaRepository;
    }

    @Override
    public List<LabelEntity> obtenerTodasLasEtiquetas() {
        return etiquetaRepository.findAll();
    }

    @Override
    public LabelEntity obtenerEtiquetaPorId(Long id) {
        Optional<LabelEntity> etiquetaOptional = etiquetaRepository.findById(id);
        return etiquetaOptional.orElse(null);
    }

    @Override
    public LabelEntity crearEtiqueta(LabelEntity etiqueta) {
        return etiquetaRepository.save(etiqueta);
    }

    @Override
    public LabelEntity actualizarEtiqueta(Long id, LabelEntity etiqueta) {
        if (etiquetaRepository.existsById(id)) {
            etiqueta.setId(id);
            return etiquetaRepository.save(etiqueta);
        }
        return null;
    }

    @Override
    public void eliminarEtiqueta(Long id) {
        etiquetaRepository.deleteById(id);
    }
}
