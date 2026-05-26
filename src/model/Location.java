package model;

public class Location {
    private int id;
    private String name;
    private String idRegion;
    
    public Location(int id, String name, String idRegion) {
        this.id = id;
        this.name = name;
        this.idRegion = idRegion;
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

    public String getId_region() {
        return idRegion;
    }

    public void setId_region(String idRegion) {
        this.idRegion = idRegion;
    }



    
}
