package model;

public class PokemonStat {
    private int idPokemon;
    private String statName;
    private int baseStat;
    private int effort;

    public PokemonStat(int idPokemon, String statName, int baseStat, int effort) {
        this.idPokemon = idPokemon;
        this.statName = statName;
        this.baseStat = baseStat;
        this.effort = effort;
    }

    public int getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }

    public int getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(int baseStat) {
        this.baseStat = baseStat;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

}
