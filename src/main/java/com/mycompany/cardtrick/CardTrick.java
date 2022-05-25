/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cardtrick;

/**
 *
 * @author simmi
 */
public class CardTrick {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         
    {
        Card[] magicHand = new Card[7];
        Scanner play = new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Random ran = new Random();
            int number = ran.nextInt(13) + 1;
            Card cr = new Card();
            cr.setValue(number);
            int newNumber = ran.nextInt(4);
            cr.setSuit(Card.SUITS[newNumber]);
            magicHand[i] = cr;
        }
        System.out.print("Enter the card suit: ");
        String cardSuit = play.nextLine();
        System.out.print("Enter the card number: ");
        int cardNumber = play.nextInt();
        boolean cardIsFound = false;
        for(int i = 0; i < magicHand.length; i++) {
            if(magicHand[i].getValue() == cardNumber && magicHand[i].getSuit().equals(cardSuit)) {
                System.out.println("Card is found!");
                System.out.println("Suit card: "+ magicHand[i].getSuit());
                System.out.println("Value of the card: "+ magicHand[i].getValue());
                cardIsFound = true;
            }
        }
        if(!cardIsFound) {
            System.out.println("Card did not found!");
        }
