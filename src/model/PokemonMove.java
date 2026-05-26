package model;

public class PokemonMove {
    private int idPokemon;
    private int idMove;
    private String learnMethod;
    private int levelLearned;
    
    public PokemonMove(int idPokemon, int idMove, String learnMethod, int levelLearned) {
        this.idPokemon = idPokemon;
        this.idMove = idMove;
        this.learnMethod = learnMethod;
        this.levelLearned = levelLearned;
    }

    public int getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public int getIdMove() {
        return idMove;
    }

    public void setIdMove(int idMove) {
        this.idMove = idMove;
    }

    public String getLearnMethod() {
        return learnMethod;
    }

    public void setLearnMethod(String learnMethod) {
        this.learnMethod = learnMethod;
    }

    public int getLevelLearned() {
        return levelLearned;
    }

    public void setLevelLearned(int levelLearned) {
        this.levelLearned = levelLearned;
    }
    
}
