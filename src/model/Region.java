package model;

public class Region {
    private int id;
    private String name;
    private int idGeneration;
    
    public Region(int id, String name, int idGeneration) {
        this.id = id;
        this.name = name;
        this.idGeneration = idGeneration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdGeneration() {
        return idGeneration;
    }

    public void setIdGeneration(int idGeneration) {
        this.idGeneration = idGeneration;
    }

}
