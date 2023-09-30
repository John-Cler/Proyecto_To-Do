package bo.edu.ucb.GrudBackend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Date date;
    private boolean completed;

    public TaskEntity() {
    }

    public TaskEntity(Long id, String description, Date date, boolean completed) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescripcion(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "TaskEntity{" +
                "id=" + getId() +
                ", descripcion='" + getDescription() + '\'' +
                ", date='" + getDate() + '\'' +
                ", completed=" + completed +
                '}';
    }
}
