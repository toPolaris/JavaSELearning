package FightTheLandlord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * 斗地主综合案例：准备牌 -> 洗牌 -> 发牌 -> 看牌
 * */
public class FTLMain {
    public static void main(String[] args) {
        /*
         * First Step:
         *   a.Prepare an ArrayList with generic "String" to store pokes, named pokers.
         *   b.Prepare two arrays to store colors and numbers of pokers, named colors and numbers.
         *   c.Assemble each poker with number and color, and put it in ArrayList--"pokers".
         * */
        ArrayList<String> pokers = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        pokers.add("Joker");//Store big joker.
        pokers.add("joker");//Store small joker.

        for (String c : colors) {
            for (String num : numbers) {
                pokers.add(c + num);
            }
        }

        /*
         * Second Step:
         *   Use method shuffle in Tool Class -- Collections to replace the "pokers".
         *   shuffle: Randomly permutes the specified list using a default source of randomness.
         *            All permutations occur with approximately equal likelihood.
         * */
        Collections.shuffle(pokers);

        /*
         * Third Step:
         *   a.Prepare three ArrayList<String> to store three players' pokers.
         *   b.Get an random number, named flag, to decide who will get the final cards.
         *   c.Hand out all the pokers except the final cards to each players equally.
         *   d.The player who received the "flag" will get the final cards additionally.
         * */
        ArrayList<String>[] player = new ArrayList[3];
        for (int i = 0; i < player.length; i++) {//Allocate space for each player
            player[i] = new ArrayList<>();
        }

        //get a random number to decide who will get another more three cards
        //the last three cards should be rule out --> pokers.size() - 3
        //index is encoded from 0, subtract 1 in addition --> pokers.size() - 3 - 1
        int flag = new Random().nextInt(pokers.size() - 3 - 1) % 3;

        for (int i = 0; i < pokers.size(); i++) {
            if (i > 50) {
                player[flag].add(pokers.get(i));
            } else {
                int num = i % 3;
                player[num].add(pokers.get(i));
            }
        }

        /*
         * The Forth Step:
         *   Show every player's cards
         * */
        for (int i = 0; i < 3; i++) {
            System.out.println("Player " + (i + 1) + ": " + player[i] + player[i].size());
        }
    }
}
