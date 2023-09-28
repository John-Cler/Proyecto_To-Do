package bo.edu.ucb.GrudBackend.dto;

import java.util.Date;
import java.util.List;

public class Task {
    private Integer taskId;
    private String description;
    private Date date;
    private List<Integer> labelIds;

    public Task() {

    }
    public Task(Integer taskId, String description, Date date, List<Integer> labelIds) {
        this.taskId = taskId;
        this.description = description;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Integer> getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + getTaskId() + "'" +
                ", description='" + getDescription() + "'" +
                ", date=" + getDate() + "'" +
                ", labelIds=" + getLabelIds() + "'" +
                '}';
    }
}
