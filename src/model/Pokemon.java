package model;

public class Pokemon {
    private int id;
    private String name;
    private int baseExpirience;
    private int height;
    private int weight;
    private int idGeneration;
    private String spriteUrl;

    public Pokemon(int id, String name, int baseExpirience, int height, int weight, int idGeneration,
            String spriteUrl) {
        this.id = id;
        this.name = name;
        this.baseExpirience = baseExpirience;
        this.height = height;
        this.weight = weight;
        this.idGeneration = idGeneration;
        this.spriteUrl = spriteUrl;
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

    public int getBaseExpirience() {
        return baseExpirience;
    }

    public void setBaseExpirience(int baseExpirience) {
        this.baseExpirience = baseExpirience;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getIdGeneration() {
        return idGeneration;
    }

    public void setIdGeneration(int idGeneration) {
        this.idGeneration = idGeneration;
    }

    public String getSpriteUrl() {
        return spriteUrl;
    }

    public void setSpriteUrl(String spriteUrl) {
        this.spriteUrl = spriteUrl;
    }

    
}
