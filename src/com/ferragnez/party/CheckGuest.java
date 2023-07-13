package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] guestList = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
        String guestName;

        System.out.println("inserisci il tuo nome:");
        guestName = scan.nextLine();

        boolean test=false;


        for (int i = 0; i < guestList.length; i++) {

            if (guestList[i].equals(guestName)) {
                test=true;

                break;

            }
        }

        if (test){
            System.out.println("il tuo nome è in lista  puoi entrare");

        } else {
            System.out.println("il tuo nome non è in lista non puoi entrare");

        }
    }
}
