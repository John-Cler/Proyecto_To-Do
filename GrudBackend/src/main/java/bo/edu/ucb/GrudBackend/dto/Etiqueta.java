package bo.edu.ucb.GrudBackend.dto;

import org.hibernate.annotations.Comment;

public class Etiqueta {
    private Integer etiquetId;
    private String nombre;
    public Etiqueta(Integer etiquetId, String nombre) {
        this.etiquetId = etiquetId;
        this.nombre = nombre;
    }

    public Etiqueta() {

    }

    public Integer getEtiquetId() {
        return etiquetId;
    }

    public void setEtiquetId(Integer etiquetId) {
        this.etiquetId = etiquetId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "EtiquetaApi{" +
                "etiquetId=" + getEtiquetId() + "'" +
                ", nombre='" + getNombre() + "'" +
                '}';
    }


}
