package model;

import java.util.Date;

public class Project {
    
    private int ID;
    private String name;
    private String description;
    private Date createdAT;
    private Date updatedAT;

    public Project(int ID, String name, String description, Date createdAT, Date updatedAT) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.createdAT = createdAT;
        this.updatedAT = updatedAT;
    }

    public Project(){
        this.createdAT = new Date();
        this.updatedAT = new Date();
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

    public Date getUpdatedAT() {
        return updatedAT;
    }

    public void setUpdatedAT(Date updatedAT) {
        this.updatedAT = updatedAT;
    }      

    @Override
    public String toString() {
        return "Project{" + "ID=" + ID + ", name=" + name + ", description=" + description + ", createdAT=" + createdAT + ", updatedAT=" + updatedAT + '}';
    }   

    public Object getCreatecAt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
