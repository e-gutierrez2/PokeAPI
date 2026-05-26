package model;

public class PokemonType {
    private int idPokemon;
    private int idType;
    private int slot;

    public PokemonType(int idPokemon, int idType, int slot) {
        this.idPokemon = idPokemon;
        this.idType = idType;
        this.slot = slot;
    }

    public int getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public int getSlot() {
        return slot;
    }
    
    public void setSlot(int slot) {
        this.slot = slot;
    }

    
}