package bo.edu.ucb.GrudBackend.api;

import bo.edu.ucb.GrudBackend.Entity.LabelEntity;
import bo.edu.ucb.GrudBackend.Service.EtiquetaServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EtiquetaApi {
    private final EtiquetaServiceI etiquetaServiceI;

    @Autowired
    public EtiquetaApi(EtiquetaServiceI etiquetaServiceI) {
        this.etiquetaServiceI = etiquetaServiceI;
    }
    @GetMapping("/api/v1/alletiqueta")
    public List<LabelEntity> obtenerTodasLasEtiquetas() {
        return etiquetaServiceI.obtenerTodasLasEtiquetas();
    }

    @GetMapping("/api/v1/Idetiqueta/{id}")
    public LabelEntity obtenerEtiquetaPorId(@PathVariable Long id) {
        return etiquetaServiceI.obtenerEtiquetaPorId(id);
    }

    @PostMapping("/api/v1/etiqueta")
    public LabelEntity crearEtiqueta(@RequestBody LabelEntity etiqueta) {
        return etiquetaServiceI.crearEtiqueta(etiqueta);
    }

    @PutMapping("/api/v1/etiqueta/update/{id}")
    public LabelEntity actualizarEtiqueta(@PathVariable Long id, @RequestBody LabelEntity etiqueta) {
        return etiquetaServiceI.actualizarEtiqueta(id, etiqueta);
    }

    @DeleteMapping("/api/v1/etiqueta/delete/{id}")
    public void eliminarEtiqueta(@PathVariable Long id) {
        etiquetaServiceI.eliminarEtiqueta(id);
    }
}
