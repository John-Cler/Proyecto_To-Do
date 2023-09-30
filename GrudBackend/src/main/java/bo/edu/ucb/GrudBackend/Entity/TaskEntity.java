package bo.edu.ucb.GrudBackend.Entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "task")
public class TaskEntity {
    @Id //Esta anotación marca el campo id como la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Esta anotación indica que el valor del campo id se generará automáticamente
    @Column(unique = true,nullable = false)//Esta anotación especifica que el campo id en la base de datos

    private Integer id;
    private String description;
    private Date date;
    private boolean state;

    public TaskEntity() {
    }
//
    public TaskEntity(Integer id, String description, Date date, boolean state) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.state = state;
    }
    //Constructor vacio
    public Integer getId() {
        return id;
    }
//metodos de getters y Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
