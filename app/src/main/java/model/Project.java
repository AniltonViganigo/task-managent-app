package model;

import java.util.Date;

public class Project {
    
    private int ID;
    private String name;
    private String description;
    private Date createdAT;
    private Date updateAT;

    public Project(int ID, String name, String description, Date createdAT, Date updateAT) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.createdAT = createdAT;
        this.updateAT = updateAT;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public Date getCreatedAT() {
        return createdAT;
    }

    public void setCreatedAT(Date createdAT) {
        this.createdAT = createdAT;
    }

    public Date getUpdateAT() {
        return updateAT;
    }

    public void setUpdateAT(Date updateAT) {
        this.updateAT = updateAT;
    }      

    @Override
    public String toString() {
        return "Project{" + "ID=" + ID + ", name=" + name + ", description=" + description + ", createdAT=" + createdAT + ", updateAT=" + updateAT + '}';
    }   
}
