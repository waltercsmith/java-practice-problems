package java_2_review;

import java.util.ArrayList;

import java.util.HashMap;

public class Collections {


    public static void main(String[] args) {
//        Create an array of anime character names using the ArrayList class

        ArrayList<String> animeNames = new ArrayList<String>();

//        Now I'm going to add the elements

        animeNames.add("Ohma Tokita");
        animeNames.add("Levi Ackerman");
        animeNames.add("Guts");
        System.out.println(animeNames);
        System.out.println();
        System.out.println("This is the first element within the array called animeNames: \n" + animeNames.get(0) + "\n \n");

//        Create a HashMap to store items

        HashMap<String, String> attackNames = new HashMap<String, String>();

//        Adding keys and values (Title, Attack Name)

        attackNames.put("Street Fighter", "Hadoken");
        attackNames.put("Tekken", "Dragon Uppercut");
        attackNames.put("King of Fighters", "100 Shiki: Oniyaki");

        System.out.println();
        System.out.println(attackNames);
        System.out.println();
//        Accessing an item from the HashMap

        System.out.println("A famous move in the videogame Street Fighter is: " + attackNames.get("Street Fighter"));

    }




}
