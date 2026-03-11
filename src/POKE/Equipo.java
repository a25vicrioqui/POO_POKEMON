package POKE;

public class Equipo {
    private String pokemonDesc;
    private String pokemonTipo;
    private int numMaximo;


    public Equipo(String pokemonDesc, String pokemonTipo, int numMaximo) {
        this.pokemonDesc = pokemonDesc;
        this.pokemonTipo = pokemonTipo;
        this.numMaximo = 6;
    }

    public static Boolean EquipoCompleto(int miembrosEquipo){
        if (miembrosEquipo >= 6){
            System.out.println("El equipo esta completo, enviando Pokemon al Pc...");
            return true;
        }else {
            System.out.println("¡Pokemon Añadido al equipo!");
            return false;
        }
    }


}
