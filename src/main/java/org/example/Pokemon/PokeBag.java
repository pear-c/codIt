package org.example.Pokemon;

import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
    private final HashMap<String, ArrayList<Integer>> pokemons = new HashMap<>();

    // 특정 이름 포켓몬 전부 리턴
    public ArrayList<Pokemon> getPokemons(String name) {
        ArrayList<Pokemon> list = new ArrayList<>();
        for(String s : pokemons.keySet()) {
            if(s.equals(name)) {
                for(int i=0; i<pokemons.get(s).size(); i++)
                    list.add(new Pokemon(s, pokemons.get(s).get(i)));
            }
        }
        return list;
    }

    // 가방에 포켓몬 추가
    public void add(Pokemon pokemon) {
        // 저장된 포켓몬 없다면 새로 ArrayList 생성
        if(!pokemons.containsKey(pokemon.name)) {
            pokemons.put(pokemon.name, new ArrayList<>());
            pokemons.get(pokemon.name).add(pokemon.cp);
        }
        // 있다면 cp 만 추가
        else {
            pokemons.get(pokemon.name).add(pokemon.cp);
        }
    }

    public Pokemon getStrongest(String name) {
        ArrayList<Pokemon> pokemons = getPokemons(name);
        if(pokemons.size() == 0) {
            return null;
        }
        else {
            Pokemon strongest = pokemons.get(0);
            for(Pokemon pokemon : pokemons) {
                if(pokemon.cp > strongest.cp) {
                    strongest = pokemon;
                }
            }
            return strongest;
        }
    }

    public Pokemon getStrongest() {
        ArrayList<Pokemon> allPokemons = new ArrayList<>();
        for(String s : pokemons.keySet()) {
            allPokemons.addAll(getPokemons(s));
        }
        Pokemon strongest = allPokemons.get(0);
        for(Pokemon pokemon : allPokemons) {
            if(pokemon.cp > strongest.cp) {
                strongest = pokemon;
            }
        }
        return strongest;
    }
}
