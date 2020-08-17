package FightTheLandlord;

import java.util.*;

/**
 * learning.FightTheLandlord
 * Created by Protein on 2020/7/23 20:55
 * Description:After learning interface-Map, use better method to optimise practice--FightTheLandlord
 */
public class FTLOptimised {
    public static void main(String[] args) {
        //201 --> big joker, 200 --> small joker
        List<String> colors = List.of("♦", "♣", "♥", "♠");
        List<String> numbers = List.of("3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2");

        //<2,101> --> the 2nd cards is "Q""♣"
        //101 --> colors.get(1) = "♣", numbers.get(10) = "Q"
        HashMap<Integer, Integer> allPokers = new HashMap<>();
        int count = 1;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < colors.size(); j++) {
                allPokers.put(count++, i * 10 + j);
            }
        }
        allPokers.put(count++, 200);
        allPokers.put(count, 201);
        //System.out.println(allPokers);

        ArrayList<Integer> pokerNum = new ArrayList<>();
        pokerNum.addAll(allPokers.keySet());
        //System.out.println(pokerNum);

        Collections.shuffle(pokerNum);

        ArrayList<Integer>[] player = new ArrayList[3];
        for (int i = 0; i < player.length; i++) {//Allocate space for each player
            player[i] = new ArrayList<>();
        }

        //get a random number to decide who will get another more three cards
        //the last three cards should be rule out --> pokerNum.size() - 3
        //index is encoded from 0, subtract 1 in addition --> pokerNum.size() - 3 - 1
        int flag = new Random().nextInt(pokerNum.size() - 3 - 1) % 3;

        for (int i = 0; i < pokerNum.size(); i++) {
            if (i > 50) {
                player[flag].add(pokerNum.get(i));//hand out additional three cards
            } else {
                player[i % 3].add(pokerNum.get(i));
            }
        }

        /*
        //Verify the integrity of pokers
        ArrayList<Integer> all = new ArrayList<>();
        for (int i = 0; i < player.length; i++) {
            all.addAll(player[i]);
        }
        Collections.sort(all);
        System.out.println(all);
        */

        for (int i = 0; i < player.length; i++) {
            Collections.sort(player[i]);
            System.out.println("Player " + (i + 1) + ", the number of pokers: " + player[i].size());
            for (int j = 0; j < player[i].size(); j++) {
                int poker = allPokers.get(player[i].get(j));
                if (poker == 200) {
                    System.out.print("🃏joker ");
                } else if (poker == 201) {
                    System.out.print("🃏Joker ");
                } else {
                    System.out.print(colors.get(poker % 10) + numbers.get(poker / 10) + " ");
                }
            }
            System.out.println();
        }
    }
}
