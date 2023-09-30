package bo.edu.ucb.GrudBackend.dto;

import java.util.Date;
import java.util.List;

public class Task {
    private Integer taskId;
    private String description;
    private Date date;
    private boolean status;
    private List<Integer> labelIds;

    public Task() {

    }
    public Task(Integer taskId, String description, Date date, boolean status, List<Integer> labelIds) {
        this.taskId = taskId;
        this.description = description;
        this.date = date;
        this.status = status;
        this.labelIds = labelIds;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.sql.Date getDate() {
        return (java.sql.Date) date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Integer> getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
    }

    public void setDate(String date) {
    }
}
