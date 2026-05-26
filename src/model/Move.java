package model;

public class Move {
    private int id;
    private String name;
    private String damageClass;
    private int power;
    private int accuracy;
    private int pp;
    private int idType;
    private int idGeneration;

    public Move(int id, String name, String damageClass, int power, int accuracy, int pp, int idType,
            int idGeneration) {
        this.id = id;
        this.name = name;
        this.damageClass = damageClass;
        this.power = power;
        this.accuracy = accuracy;
        this.pp = pp;
        this.idType = idType;
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

    public String getDamageClass() {
        return damageClass;
    }

    public void setDamageClass(String damageClass) {
        this.damageClass = damageClass;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public int getIdGeneration() {
        return idGeneration;
    }

    public void setIdGeneration(int idGeneration) {
        this.idGeneration = idGeneration;
    }
}
