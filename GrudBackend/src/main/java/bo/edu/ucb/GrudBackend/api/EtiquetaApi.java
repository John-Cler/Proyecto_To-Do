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
    @GetMapping("/")
    public List<LabelEntity> obtenerTodasLasEtiquetas() {
        return etiquetaServiceI.obtenerTodasLasEtiquetas();
    }

    @GetMapping("/{id}")
    public LabelEntity obtenerEtiquetaPorId(@PathVariable Long id) {
        return etiquetaServiceI.obtenerEtiquetaPorId(id);
    }

    @PostMapping("/")
    public LabelEntity crearEtiqueta(@RequestBody LabelEntity etiqueta) {
        return etiquetaServiceI.crearEtiqueta(etiqueta);
    }

    @PutMapping("/{id}")
    public LabelEntity actualizarEtiqueta(@PathVariable Long id, @RequestBody LabelEntity etiqueta) {
        return etiquetaServiceI.actualizarEtiqueta(id, etiqueta);
    }

    @DeleteMapping("/{id}")
    public void eliminarEtiqueta(@PathVariable Long id) {
        etiquetaServiceI.eliminarEtiqueta(id);
    }
}
