package definingClassesEx.pokemonTrainer;

import java.net.PortUnreachableException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input  = sc.nextLine();
        Set<Trainer> totalTrainers = new LinkedHashSet<>();
        Map<String, Trainer> names = new LinkedHashMap<>();
        while(!input.equals("Tournament")){
            String[] data = input.split(" ");
            names.putIfAbsent(data[0], new Trainer(data[0]));
            Pokemon pokemon = new Pokemon(data[1], data[2], Integer.parseInt(data[3]));
            names.get(data[0]).getPokemons().add(pokemon);
            input = sc.nextLine();
        }
        input = sc.nextLine();
        while(!input.equals("End")){
            for (Map.Entry<String, Trainer> stringTrainerEntry : names.entrySet()) {
                Trainer trainer = stringTrainerEntry.getValue();
                if(checkIfElementExists(input, trainer.getPokemons())){
                    trainer.addOneBadge();
                } else{
                    lose10Health(trainer.getPokemons());
                }
                removeDeathPokemons(trainer.getPokemons());
                totalTrainers.add(trainer);
            }
            input = sc.nextLine();
        }
        Consumer<Trainer> consumer = t -> System.out.printf("%s %d %d%n", t.getName(), t.getBadges(), t.getPokemons().size());
        totalTrainers.stream()
                .sorted((t1, t2) -> Integer.compare(t2.getBadges(), t1.getBadges()))
                .forEach(consumer);
    }
    public static boolean checkIfElementExists(String element, ArrayList<Pokemon> pokemons){
        for(Pokemon pokemon: pokemons){
            if(element.equals(pokemon.getElement())){
                return true;
            }
        }
        return false;
    }
    public static void lose10Health (ArrayList<Pokemon> pokemons){
        Consumer<Pokemon> consumer = c -> c.setHealth(c.getHealth() - 10);
        pokemons.forEach(consumer);
    }
    public static void removeDeathPokemons(ArrayList<Pokemon> pokemons){
        pokemons.removeIf(pokemon -> pokemon.getHealth() <= 0);
    }
}
