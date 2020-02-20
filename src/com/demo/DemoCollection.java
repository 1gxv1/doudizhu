package com.demo;
import java.util.*;
public class DemoCollection {
    public static void main(String[] args) {
        ArrayList<String> poke = new ArrayList<>();
        poke.add("大王");
        poke.add("小王");
        String[] color = {"黑桃", "爱心", "梅花", "方块"};
        String[] numbers = {"2", "1", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        for (String i : color) {
            for (String j : numbers) {
                poke.add(i + j);
            }
        }
        Collections.shuffle(poke);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dizhu = new ArrayList<>();
        for (int i = 0; i < poke.size(); i++) {
            if (i > 50) {
                dizhu.add(poke.get(i));
            } else {
                if (i % 3 == 1) {
                    player1.add(poke.get(i));
                }
                if (i % 3 == 2) {
                    player2.add(poke.get(i));
                }
                if (i % 3 == 0) {
                    player3.add(poke.get(i));
                }
            }
        }
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dizhu);
    }
}



