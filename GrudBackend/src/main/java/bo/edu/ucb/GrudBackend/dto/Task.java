package bo.edu.ucb.GrudBackend.dto;

import java.sql.Date;
import java.util.List;

public class Task {
    private Integer id;
    private String description;
    private Date date;

    private boolean state;

    private String label;

    public Task() {

    }
    public Task(String description, Date date, boolean state, String label) {
        this.description = description;
        this.date = date;
        this.state = state;
        this.label = label;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.sql.Date getDate() {
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

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
}
