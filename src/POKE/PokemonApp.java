package POKE;

import java.util.ArrayList;
import java.util.Scanner;

public class PokemonApp {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Pokemon> pokedex = null;
    static ArrayList<Pokemon> equipo = new ArrayList<>();
    static ArrayList<Pokemon> pc = new ArrayList<>();


    static String[] pokemonDesc = {
            "Bulbasaur","Ivysaur","Venusaur","Charmander","Charmeleon","Charizard",
            "Squirtle","Wartortle","Blastoise","Caterpie","Metapod","Butterfree",
            "Weedle","Kakuna","Beedrill","Pidgey","Pidgeotto","Pidgeot",
            "Rattata","Raticate","Spearow","Fearow","Ekans","Arbok",
            "Pikachu","Raichu","Sandshrew","Sandslash","Nidoran♀","Nidorina",
            "Nidoqueen","Nidoran♂","Nidorino","Nidoking","Clefairy","Clefable",
            "Vulpix","Ninetales","Jigglypuff","Wigglytuff","Zubat","Golbat",
            "Oddish","Gloom","Vileplume","Paras","Parasect","Venonat",
            "Venomoth","Diglett","Dugtrio","Meowth","Persian","Psyduck",
            "Golduck","Mankey","Primeape","Growlithe","Arcanine","Poliwag",
            "Poliwhirl","Poliwrath","Abra","Kadabra","Alakazam","Machop",
            "Machoke","Machamp","Bellsprout","Weepinbell","Victreebel","Tentacool",
            "Tentacruel","Geodude","Graveler","Golem","Ponyta","Rapidash",
            "Slowpoke","Slowbro","Magnemite","Magneton","Farfetch'd","Doduo",
            "Dodrio","Seel","Dewgong","Grimer","Muk","Shellder",
            "Cloyster","Gastly","Haunter","Gengar","Onix","Drowzee",
            "Hypno","Krabby","Kingler","Voltorb","Electrode","Exeggcute",
            "Exeggutor","Cubone","Marowak","Hitmonlee","Hitmonchan","Lickitung",
            "Koffing","Weezing","Rhyhorn","Rhydon","Chansey","Tangela",
            "Kangaskhan","Horsea","Seadra","Goldeen","Seaking","Staryu",
            "Starmie","Mr. Mime","Scyther","Jeffrey Epstein","Electabuzz","Magmar",
            "Pinsir","Tauros","Magikarp","Gyarados","Lapras","Ditto",
            "Eevee","Vaporeon","Jolteon","Flareon","Porygon","Omanyte",
            "Omastar","Kabuto","Kabutops","Aerodactyl","Snorlax","Articuno",
            "Zapdos","Moltres","Dratini","Dragonair","Dragonite","Mewtwo","Mew"
    };

    static String[] pokedexNum = {
            "001","002","003","004","005","006","007","008","009","010",
            "011","012","013","014","015","016","017","018","019","020",
            "021","022","023","024","025","026","027","028","029","030",
            "031","032","033","034","035","036","037","038","039","040",
            "041","042","043","044","045","046","047","048","049","050",
            "051","052","053","054","055","056","057","058","059","060",
            "061","062","063","064","065","066","067","068","069","070",
            "071","072","073","074","075","076","077","078","079","080",
            "081","082","083","084","085","086","087","088","089","090",
            "091","092","093","094","095","096","097","098","099","100",
            "101","102","103","104","105","106","107","108","109","110",
            "111","112","113","114","115","116","117","118","119","120",
            "121","122","123","124","125","126","127","128","129","130",
            "131","132","133","134","135","136","137","138","139","140",
            "141","142","143","144","145","146","147","148","149","150",
            "151"
    };

    static String[] pokedexTipos = {
            "Planta, Veneno","Planta, Veneno","Planta, Veneno",
            "Fuego","Fuego","Fuego, Volador",
            "Agua","Agua","Agua",
            "Bicho","Bicho","Bicho, Volador",
            "Bicho, Veneno","Bicho, Veneno","Bicho, Veneno",
            "Normal, Volador","Normal, Volador","Normal, Volador",
            "Normal","Normal",
            "Normal, Volador","Normal, Volador",
            "Veneno","Veneno",
            "Eléctrico","Eléctrico",
            "Tierra","Tierra",
            "Veneno","Veneno","Veneno, Tierra",
            "Veneno","Veneno","Veneno, Tierra",
            "Hada","Hada",
            "Fuego","Fuego",
            "Normal, Hada","Normal, Hada",
            "Veneno, Volador","Veneno, Volador",
            "Planta, Veneno","Planta, Veneno","Planta, Veneno",
            "Bicho, Planta","Bicho, Planta",
            "Bicho, Veneno","Bicho, Veneno",
            "Tierra","Tierra",
            "Normal","Normal",
            "Agua","Agua",
            "Lucha","Lucha",
            "Fuego","Fuego",
            "Agua","Agua","Agua, Lucha",
            "Psíquico","Psíquico","Psíquico",
            "Lucha","Lucha","Lucha",
            "Planta, Veneno","Planta, Veneno","Planta, Veneno",
            "Agua, Veneno","Agua, Veneno",
            "Roca, Tierra","Roca, Tierra","Roca, Tierra",
            "Fuego","Fuego",
            "Agua, Psíquico","Agua, Psíquico",
            "Eléctrico, Acero","Eléctrico, Acero",
            "Normal, Volador","Normal, Volador","Normal, Volador",
            "Agua","Agua, Hielo",
            "Veneno","Veneno",
            "Agua","Agua, Hielo",
            "Fantasma, Veneno","Fantasma, Veneno","Fantasma, Veneno",
            "Roca, Tierra",
            "Psíquico","Psíquico",
            "Agua","Agua",
            "Eléctrico","Eléctrico",
            "Planta, Psíquico","Planta, Psíquico",
            "Tierra","Tierra",
            "Lucha","Lucha",
            "Normal",
            "Veneno","Veneno",
            "Tierra, Roca","Tierra, Roca",
            "Normal",
            "Planta",
            "Normal",
            "Agua","Agua",
            "Agua","Agua",
            "Agua","Agua, Psíquico",
            "Psíquico, Hada",
            "Bicho, Volador",
            "Siniestro, Agua",
            "Eléctrico",
            "Fuego",
            "Bicho",
            "Normal",
            "Agua","Agua, Volador",
            "Agua, Hielo",
            "Normal",
            "Normal",
            "Agua",
            "Eléctrico",
            "Fuego",
            "Normal",
            "Roca, Agua","Roca, Agua",
            "Roca, Agua","Roca, Agua",
            "Roca, Volador",
            "Normal",
            "Hielo, Volador",
            "Eléctrico, Volador",
            "Fuego, Volador",
            "Dragón","Dragón","Dragón, Volador",
            "Psíquico","Psíquico"
    };

    static String[] rutas = {
            "Ruta 101",
            "Ruta 102",
            "Ruta 103",
            "Ruta 104",
            "Ruta 105",
            "Ruta 106",
            "Ruta 107",
            "Ruta 108",
            "Ruta 109",
            "Ruta 110",
            "Ciudad Verdeja",
            "Ciudad Brisamar",
            "Ciudad Rocanegra",
            "Ciudad Luminaria",
            "Pueblo Hojaverde",
            "Pueblo Arenasol",
            "Cueva Eco",
            "Cueva Cristal",
            "Cueva Umbría",
            "Cueva Magma",
            "Bosque Verde",
            "Bosque Encantado",
            "Bosque Niebla",
            "Monte Trueno",
            "Monte Fuego",
            "Monte Lunar",
            "Lago Espejo",
            "Lago Sereno",
            "Lago Tormenta",
            "Desierto Dorado",
            "Desierto Abrasador",
            "Isla Coral",
            "Isla Bruma",
            "Isla Dragón",
            "Túnel Roca",
            "Túnel Hierro",
            "Pantano Sombrío",
            "Pantano Esmeralda",
            "Torre Antigua",
            "Torre Batalla",
            "Torre Celeste",
            "Pradera Azul",
            "Pradera Dorada",
            "Pradera Ventisca",
            "Puerto Marea",
            "Puerto Estrella",
            "Valle Rocoso",
            "Valle Ventoso",
            "Valle Oculto",
            "Ruta 111",
            "Ruta 112",
            "Ruta 113",
            "Ruta 114",
            "Ruta 115",
            "Ruta 116",
            "Ruta 117",
            "Ruta 118",
            "Ruta 119",
            "Ruta 120",
            "Ruta 121",
            "Ruta 122",
            "Ruta 123",
            "Ruta 124",
            "Ruta 125",
            "Ruta 126",
            "Ruta 127",
            "Ruta 128",
            "Ruta 129",
            "Ruta 130"
    };

    private static ArrayList<Pokemon> iniciarPokedex(){
        ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
        for (int i = 0; i< pokedexNum.length; i++){
            Pokemon pokemon = new Pokemon(pokemonDesc[i], pokedexNum[i], pokedexTipos[i]);
            pokedex.add(pokemon);
        }
        return pokedex;
    }

    private static void iniciarAventura(ArrayList<Pokemon> pokedex){
        Pokemon miInicial = escogerInicial(pokedex);
        equipo.add(miInicial);
        System.out.println("Tu aventura comienza con " + miInicial.getNombre());
        if (miInicial.getNombre().equalsIgnoreCase("Charmander")){
                    System.out.println("              _.--\"\"`-..");
                    System.out.println("            ,'          `.");
                    System.out.println("          ,'          __  `.");
                    System.out.println("         /|          \" __   \\");
                    System.out.println("        , |           / |.   .");
                    System.out.println("        |,'          !_.'|   |");
                    System.out.println("      ,'             '   |   |");
                    System.out.println("     /              |`--'|   |");
                    System.out.println("    |                `---'|   |");
                    System.out.println("     .   ,                   |                       ,\".");
                    System.out.println("      ._     '           _'  |                    , ' \\ `");
                    System.out.println("  `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|");
                    System.out.println("  |, `- .`._        _,-,.'   .    _.-'_.-\"        |   ,    \\");
                    System.out.println("-:..     `. `-..--_.,.<       `..-'  _.-\"          |  ,'      \\");
                    System.out.println("  `,         \"\"\"\"'     `.              ,'         /  /        |");
                    System.out.println("    `.      '            '            ,'          /  /         |");
                    System.out.println("      `.   |              \\       _,-'           /  /          |");
                    System.out.println("        `._'               \\   '\"\\                /            |");
                    System.out.println("           |                '     \\              /              |");
                    System.out.println("           |                 '     \\           _/               |");
                    System.out.println("           |                 |      \\         / |               |");
                    System.out.println("           |                 |       \\       /   |               |");
                    System.out.println("           |                 |        \\     /    |               |");
                    System.out.println("           |                 |         \\   /     |               |");
                    System.out.println("           |                 |          \\_/      |               |");
                    System.out.println("             🔥");


        }
        if(miInicial.getNombre().equalsIgnoreCase("Bulbasaur")){
            System.out.println("                                           /");
            System.out.println("                        _,.------....___,.' ',.-.");
            System.out.println("                     ,-'          _,.--\"        |");
            System.out.println("                   ,'         _.-'              .");
            System.out.println("                  /   ,     ,'                   `");
            System.out.println("                 .   /     /                     ``.");
            System.out.println("                 |  |     .                       \\\\.");
            System.out.println("       ____      |___._.  |       __               \\ `.");
            System.out.println("     .'    `---\"\"       ``\"-.--\"'`  \\               .  \\");
            System.out.println("    .  ,            __               `              |   .");
            System.out.println("    `,'         ,-\"'  .               \\             |    L");
            System.out.println("   ,'          '    _.'                -._          /    |");
            System.out.println("  ,`-.    ,\".   `--'                      >.      ,'     |");
            System.out.println(" . .'\\'   `-'       __    ,  ,-.         /  `.__.-      ,'");
            System.out.println(" ||:, .           ,'  ;  /  / \\ `        `.    .      .'/");
            System.out.println(" j|:D  \\          `--'  ' ,'_  . .         `.__, \\   , /");
            System.out.println("/ L:_  |                 .  \"' :_;                `.'.'");
            System.out.println(".    \"\"'                  \"\"\"\"\"'                    V");
            System.out.println(" `.                                 .    `.   _,..  `");
            System.out.println("   `,_   .    .                _,-'/    .. `,'   __  `");
            System.out.println("    ) \\`._        ___....----\"'  ,'   .'  \\ |   '  \\  .");
            System.out.println("   /   `. \"`-.--\"'         _,' ,'     `---' |    `./  |");
            System.out.println("  .   _  `\"\"'--.._____..--\"   ,             '         |");
            System.out.println("  | .\" `. `-.                /-.           /          ,");
            System.out.println("  | `._.'    `,_            ;  /         ,'          .");
            System.out.println(" .'          /| `-.        . ,'         ,           ,");
            System.out.println(" '-.__ __ _,','    '`-..___;-...__   ,.'\\ ____.___.'");
            System.out.println(" `\"^--'..'   '-`-^-\"'--    `-^-'`.''\"\"\"\"\"`.,^.`.--' mh");
        }
        if(miInicial.getNombre().equalsIgnoreCase("Squirtle")){
                    System.out.println("               _,........__");
                    System.out.println("            ,-'            \"`-.");
                    System.out.println("          ,'                   `-.");
                    System.out.println("        ,'                        \\");
                    System.out.println("      ,'                           .");
                    System.out.println("      .'\\               ,\"\".       `");
                    System.out.println("     ._.'|             / |  `       \\");
                    System.out.println("     |   |            `-.'  ||       `.");
                    System.out.println("     |   |            '-._,'||       | \\");
                    System.out.println("     .`.,'             `..,'.'       , |`-.");
                    System.out.println("     l                       .'`.  _/  |   `.");
                    System.out.println("     `-.._'-   ,          _ _'   -\" \\  .     `");
                    System.out.println(" `.\"\"\"\"'-.`-...,---------','         `. `....__.");
                    System.out.println(" .'        `\"-..___      __,'\\          \\  \\     \\");
                    System.out.println(" \\_ .          |   `\"\"\"\"'    `.           . \\     \\");
                    System.out.println("   `.          |              `.          |  .     L");
                    System.out.println("     `.        |`--...________.'.        j   |     |");
                    System.out.println("       `._    .'      |          `.     .|   ,     |");
                    System.out.println("          `--,\\       .            `7\"\"' |  ,      |");
                    System.out.println("             ` `      `            /     |  |      |    _,-'\"\"\"`-.");
                    System.out.println("              \\ `.     .          /      |  '      |  ,'          `.");
                    System.out.println("               \\  v.__  .        '       .   \\    /| /              \\");
                    System.out.println("                \\/    `\"\"\\\"\"\"\"\"\"`.       \\   \\  /.''                |");
                    System.out.println("                 `        .        `._ ___,j.  `/ .-       ,---.     |");
                    System.out.println("                 ,`-.      \\         .\"     `.  |/        j     `    |");
                    System.out.println("                /    `.     \\       /         \\ /         |     /    j");
                    System.out.println("               |       `-.   7-.._ .          |\"          '         /");
                    System.out.println("               |          `./_    `|          |            .     _,'");
                    System.out.println("               `.           / `----|          |-............`---'");
                    System.out.println("                 \\          \\      |          |");
                    System.out.println("                ,'           )     `.         |");
                    System.out.println("                 7____,,..--'      /          |");
                    System.out.println("                                   `---.__,--.'mh");

        }
        //avanzarRuta();
    }

    private static Pokemon escogerInicial(ArrayList<Pokemon> pokedex){
        System.out.println("ADELANTE, ESCOGE A TU INICIAL PARA INICIAR LA AVENTURA:");
        System.out.println(("1") + " - " + pokemonDesc[0] + " Tipo: (" + pokedexTipos[0] + ") Numero de la Pokedex: " + pokedexNum[0]);
        System.out.println(("2") + " - " + pokemonDesc[3] + " Tipo: (" + pokedexTipos[3] + ") Numero de la Pokedex: " + pokedexNum[3]);
        System.out.println(("3") + " - " + pokemonDesc[6] + " Tipo: (" + pokedexTipos[6] + ") Numero de la Pokedex: " + pokedexNum[6]);

        int eleccion = llegirInt(scan, "INTRODUCE EL NUMERO DEL INICIAL QUE QUIERAS");

        Pokemon inicial = null;

        if (eleccion == 1){
            System.out.println("HAS ESCOGIDO A " + pokemonDesc[0]);
            inicial = pokedex.get(0);

            return inicial;
        }else if(eleccion == 2){
            System.out.println("HAS ESCOGIDO A " + pokemonDesc[3]);
            inicial = pokedex.get(3);

            return inicial;
        }else{
            System.out.println("HAS ESCOGIDO A " + pokemonDesc[6]);
            inicial = pokedex.get(6);

            return inicial;
        }
    }

    private static void avanzarRuta() {
        int contadorRuta = 0;
        int contadorCapturados = 0;

        while (true) {
            boolean interactuarPokemon = false;
            boolean noInteractuaPokemon = true;

            rutaAct();
            Pokemon pokemonSalvaje = pokemonRandom();

            while (noInteractuaPokemon) {
                int opcion = menu(scan, "¿QUÉ QUIERES HACER?");

                switch (opcion) {
                    case 1: // Atrapar Pokémon
                        contadorCapturados++;
                        interactuarPokemon = true;
                        noInteractuaPokemon = false;
                        atraparPokemon(pokemonSalvaje);
                        break;
                    case 2: // Huir
                        interactuarPokemon = true;
                        noInteractuaPokemon = false;
                        huirCombate();
                        break;
                    case 3: // Ver equipo
                        verEquipo();
                        break;
                    case 4: // Ver PC
                        verPc();
                        break;
                    case 5: // Ver Pokédex
                        verPokedex();
                        break;
                    case 6: // Terminar aventura
                        terminarAventura(contadorRuta, contadorCapturados);
                        return; // rompe tot el métode, no solo el segon bucle
                }
            }

            if (interactuarPokemon) {
                contadorRuta++;
            }
        }
    }

    private static String rutaAct(){

        String rutaActual = "";
        rutaActual = rutas[(int)(Math.random() * rutas.length)];

        System.out.println("La Ruta Actual es: " + rutaActual);

        return rutaActual;

    }

    private static Pokemon pokemonRandom(){
        Pokemon pokRandom = pokedex.get((int)(Math.random() * pokedexNum.length));
        System.out.println();
        System.out.println("----------------------------");
        System.out.println(pokRandom.getNombre());
        System.out.println("----------------------------");
        System.out.println();
        return pokRandom;
    }


    private static int llegirInt(Scanner scanner, String s) {
        while(true){
            System.out.println(s);

            if(!scanner.hasNextInt()){
                scanner.nextLine();
                System.out.println("ERROR: ¡EH, ESO NO VALE!");
                continue;
            }

            int numero = scanner.nextInt();
            scanner.nextLine();

            if(numero == 1 || numero == 2 || numero == 3){
                return numero;
            }else{
                System.out.println("ERROR: ¡EH, ESO NO VALE!");
            }
        }
    }

    private static int menu(Scanner scanner, String s){

        while(true){
            System.out.println(s);
            System.out.println("1) - Atrapar Pokemon");
            System.out.println("2) - Huir del Combate");
            System.out.println("3) - Ver Equipo");
            System.out.println("4) - Ver Pc");
            System.out.println("5) - Ver Pokedex");
            System.out.println("6) - Terminar Aventura");

            if(!scanner.hasNextInt()){
                scanner.nextLine();
                System.out.println("ERROR: ¡EH, ESO NO VALE!");
                continue;
            }

            int numero = scanner.nextInt();
            scanner.nextLine();

            if(numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5 || numero == 6){
                return numero;
            }else{
                System.out.println("ERROR: ¡EH, ESO NO VALE!");
            }
        }

    }

    private static void atraparPokemon(Pokemon pokemonSalvaje) {
        String pokemonAtrapado = pokemonSalvaje.getNombre();
        System.out.println("Pokemon " + pokemonAtrapado + " atrapado con éxito");
        if (Equipo.EquipoCompleto(equipo.size())) {
            pc.add(pokemonSalvaje);
        } else {
            equipo.add(pokemonSalvaje);
        }
    }

    private static void huirCombate() { //OPCION 2
        System.out.println("¡HAS HUIDO DEL COMBATE CON EXITO!");
    }

    private static void verEquipo  () { //OPCION 3
        System.out.println("--------------");
        System.out.println("MOSTRANDO EQUIPO:");
        System.out.println();
        for (int i = 0; i < equipo.size(); i++) {
            System.out.println(i+1 + ") " + equipo.get(i).getNombre());
        }
        System.out.println("--------------");

    }

    private static void verPc() { //OPCION 4
        System.out.println("--------------");
        System.out.println("MOSTRANDO PC:");
        System.out.println();
        for (int i = 0; i < pc.size(); i++) {
            System.out.println(i+1 + ") " + pc.get(i).getNombre());
        }
        System.out.println("--------------");

    }

    private static void verPokedex() {
        System.out.println("--------------");

        for (int i = 0; i < pokedex.size(); i++) {

            boolean registrado = false;

            // COMPRUEBO QUE ESTE en el equipo
            for (int j = 0; j < equipo.size(); j++) {
                if (pokedex.get(i).getNombre().equalsIgnoreCase(equipo.get(j).getNombre())) {
                    registrado = true;
                    break;
                }
            }

            // BUSCO en el PC si no estaba capturado/Ya lo tenia en el equipo
            if (!registrado) {
                for (int k = 0; k < pc.size(); k++) {
                    if (pokedex.get(i).getNombre().equalsIgnoreCase(pc.get(k).getNombre())) {
                        registrado = true;
                        break;
                    }
                }
            }
            System.out.print("#" + pokedexNum[i] + " ");

            if (registrado) {
                System.out.println(pokedex.get(i).getNombre());
            } else {
                System.out.println("???");
            }
        }
        System.out.println("--------------");
    }

    private static void terminarAventura(int contadorRuta, int contadorCapturados) { //OPCION 6
        System.out.println("FIN.");
        System.out.println();
        System.out.println("--------------");
        System.out.println();
        System.out.println("RESUMEN:");
        System.out.println();
        System.out.println("- Has pasado por " + contadorRuta + " Rutas");
        System.out.println();
        System.out.println("- Has capturado a " + contadorCapturados + " Pokemon");
        System.out.println();
        System.out.println("--------------");

    }



    public static void main(String[] args) {
        pokedex = iniciarPokedex();
        iniciarAventura(pokedex);
        avanzarRuta();
    }


}
