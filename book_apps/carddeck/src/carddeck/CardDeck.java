/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carddeck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author zvibock
 */
public class CardDeck {
 List<String> cards = new ArrayList<String>();
 List <String> player = new ArrayList<String>();
 List <String> computer = new ArrayList<String>();
public void war()
{
    System.out.println();
player.addAll(cards.subList(0, cards.size()/2));
computer.addAll(cards.subList(cards.size()/2,cards.size()));
for(String play :player)
  System.out.print(play);
for(String comput:computer)
   System.out.print(comput);   
}
 public void create()
 {
    // List<String> cards = new ArrayList<String>();
     String tp =("hearts clubs spades diamonds");
     List<String> types = Arrays.asList(tp.split(" "));
     String wc =("jack queen king");
     List<String> wordCards = Arrays.asList(wc.split(" "));
     for(String type:types ){
         for(int i=1;i<=10;i++)
             cards.add(i+" of "+type);
         for(String wordCard:wordCards)
             cards.add(wordCard+" of "+type);
      } 
     Collections.shuffle(cards);
     for(String card:cards)
         System.out.print(" "+card+",");
     
     
     } 
 
     
    public static void main(String[] args) {
     CardDeck cd = new CardDeck();
     cd.create();
     cd.war();
     
    }
}
