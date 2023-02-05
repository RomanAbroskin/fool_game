package ru.top.models;

import ru.top.models.Card;
import ru.top.models.Player;
import ru.top.models.Suit;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Game {
   private final List<Card> cardDeck;
   private final Player firstPlayer;
   private final Player secondPLayer;
   private final Suit trumpSuit;
   private int curMove;    //0, если ходит первый игрок и 1 если второй

   public Game(Player firstPlayer, Player secondPLayer) {
      this.firstPlayer = firstPlayer;
      this.secondPLayer = secondPLayer;
      this.cardDeck = initDeck();
      this.curMove = new Random().nextInt(2);
      this.trumpSuit = randomSuit();
   }

   /**
    *
    * @return initial state of the deck
    * Нужно вернуть стандартный список из 36 карт всех мастей (размешанный)
    */
   private List<Card> initDeck() {
      //Здесь после создания колоды будет вызываться метод "размешать"
      return null;
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
