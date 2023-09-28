package bo.edu.ucb.GrudBackend.bl;

import bo.edu.ucb.GrudBackend.dto.Etiqueta;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EtiquetaBl {
    private List<Etiqueta> etiquetas;

    public EtiquetaBl(){
        this.etiquetas = new ArrayList<>();
        this.etiquetas.add(new Etiqueta(1,"Trabajo"));
        this.etiquetas.add(new Etiqueta(2,"Limpieza"));
        this.etiquetas.add(new Etiqueta(3,"Personal"));
    }
    public List<Etiqueta> getAllEtiquetas (){
        return etiquetas;
    }
    public Etiqueta getEtiquetaById(Integer id){
        Etiqueta etiqueta = etiquetas.stream()
                .filter(t -> t.getEtiquetId().equals(id))
                .findFirst().orElse(null);
        return etiqueta;
    }
    public Etiqueta updateEtiquetaById(Integer idEtiqueta, Etiqueta newEtiqueta){
        Etiqueta etiqueta = etiquetas.stream()
                .filter(t -> t.getEtiquetId().equals(idEtiqueta))
                .findFirst().orElse(null);
        etiqueta.setNombre(newEtiqueta.getNombre());
        return etiqueta;
    }
    public void CrearEtiqueta(Etiqueta etiqueta){
        if (etiquetas.size() > 0) {
            Etiqueta lastetiqueta =etiquetas.get(etiquetas.size() - 1);
            etiqueta.setEtiquetId(lastetiqueta.getEtiquetId() + 1);
        }else {
            etiqueta.setEtiquetId(1);
        }
        etiquetas.add(etiqueta);
    }
}
