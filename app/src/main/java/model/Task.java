package model;

import java.util.Date;

public class Task {
 
    private Integer id;
    private Integer idProject;
    private String name;
    private String description;
    private String notes;
    private Boolean isCompleted;
    private Date deadLine;
    private Date createcAt;
    private Date updateAT;

    public Task(Integer id, Integer idProject, String name, String description, String notes, Boolean isCompleted, Date deadLine, Date createcAt, Date updateAT) {
        this.id = id;
        this.idProject = idProject;
        this.name = name;
        this.description = description;
        this.notes = notes;
        this.isCompleted = isCompleted;
        this.deadLine = deadLine;
        this.createcAt = createcAt;
        this.updateAT = updateAT;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdProject() {
        return idProject;
    }

    public void setIdProject(Integer idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public Date getCreatecAt() {
        return createcAt;
    }

    public void setCreatecAt(Date createcAt) {
        this.createcAt = createcAt;
    }

    public Date getUpdateAT() {
        return updateAT;
    }

    public void setUpdateAT(Date updateAT) {
        this.updateAT = updateAT;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", idProject=" + idProject + ", name=" + name + ", description=" + description + ", notes=" + notes + ", isCompleted=" + isCompleted + ", deadLine=" + deadLine + ", createcAt=" + createcAt + ", updateAT=" + updateAT + '}';
    }       
}
