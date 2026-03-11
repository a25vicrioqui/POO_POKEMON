package POKE;

public class Pokemon {
    private String pokemonDesc;
    private String pokedexNum;
    private String pokemonTipo;


    public Pokemon(String pokemonDesc, String pokedexNum, String pokemonTipo) {
        this.pokemonDesc = pokemonDesc;
        this.pokedexNum = pokedexNum;
        this.pokemonTipo = pokemonTipo;
    }

    public String getPokemonDesc(){
        return this.pokemonDesc;
    }

    public String getPokedexNum(){
        return this.pokedexNum;
    }

    public String getPokemonTipo(){
        return this.pokemonTipo;
    }

    public String getNombre() {
        return pokemonDesc;
    }
}
