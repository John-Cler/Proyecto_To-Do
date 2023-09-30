package bo.edu.ucb.GrudBackend.Entity;

public class LabelEntity {
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
