package bo.edu.ucb.GrudBackend.Service;

import bo.edu.ucb.GrudBackend.Entity.LabelEntity;

import java.util.List;

public interface EtiquetaService {
    List<LabelEntity> obtenerTodasLasEtiquetas();
    LabelEntity obtenerEtiquetaPorId(Long id);
    LabelEntity crearEtiqueta(LabelEntity etiqueta);
    LabelEntity actualizarEtiqueta(Long id, LabelEntity etiqueta);
    void eliminarEtiqueta(Long id);
}
