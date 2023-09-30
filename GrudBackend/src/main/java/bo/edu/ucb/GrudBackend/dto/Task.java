package bo.edu.ucb.GrudBackend.dto;

import java.sql.Date;
import java.util.List;

public class Task {
//    private Integer taskId;
    private String description;
    private Date date;
    private boolean status;
    private List<Integer> labels;

    public Task() {

    }
    public Task(String description, Date date, boolean status, List<Integer> labels) {
        this.description = description;
        this.date = date;
        this.status = status;
        this.labels = labels;
    }

//    public Integer getTaskId() {
//        return taskId;
//    }
//
//    public void setTaskId(Integer taskId) {
//        this.taskId = taskId;
//    }

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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Integer> getLabelIds() {
        return labels;
    }

    public void setLabelIds(List<Integer> labelIds) {
        this.labels = labelIds;
    }


}
