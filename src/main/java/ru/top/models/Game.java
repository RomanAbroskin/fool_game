package ru.top.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static ru.top.models.Suit.*;

public class Game {
   private final List<Card> cardDeck;
   private final Player firstPlayer;
   private final Player secondPLayer;
   private final Suit trumpSuit;
   private int curMove;    //0, если ходит первый игрок и 1 если второй

   public Game(List<Card> cardDeck, Player firstPlayer, Player secondPLayer) {
      this.cardDeck = cardDeck;
      this.firstPlayer = firstPlayer;
      this.secondPLayer = secondPLayer;
      this.curMove = new Random().nextInt(2);
      this.trumpSuit = randomSuit();
   }

   /**
    *
    * @return initial state of the deck
    * Нужно вернуть стандартный список из 36 карт всех мастей (размешанный)
    */
   private void  initDeck() {
      List<Card>cards=new ArrayList<>();
      for (int i=6;i<=14;i++){
         cards.add(new Card(i,HEARTS));
         cards.add(new Card(i,DIAMONDS));
         cards.add(new Card(i,SPADES));
         cards.add(new Card(i,CLUBS));
      }

      randomShuffle();
      //Здесь после создания колоды будет вызываться метод "размешать"
   }

   /**
    * Размешивает случайным образом колоду. Можно использовать Collections.shuffle
    */
   private void randomShuffle() {

   }


   /**
    *
    * @return random suit
    */
   private Suit randomSuit() {
      return null;
   }
}
