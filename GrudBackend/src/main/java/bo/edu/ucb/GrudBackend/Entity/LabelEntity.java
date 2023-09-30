package bo.edu.ucb.GrudBackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "label")
public class LabelEntity {
    @Id //Esta anotación marca el campo id como la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Esta anotación indica que el valor del campo id se generará automáticamente
    @Column(unique = true,nullable = false)//Esta anotación especifica que el campo id en la base de datos
    private Long id;

    private String title;

    public LabelEntity() {
    }

    public LabelEntity(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "LabelEntity{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                '}';
    }
}
