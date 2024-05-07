package com.engeto.bioCarrot;

import java.math.BigDecimal;

public class Main {
        public static void ukol1() {
        System.out.println("Hello world!");
    }
    public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10;
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0;
        System.out.println(cena);
    }

    public static void ukol5() {
        double cena = 0; // Nastavíme do proměnné hodnotu 0
        // Desetkrát přičteme hodnotu jedna desetina (0,1):
        for (int i = 0; i < 10; i++) {
            cena += 0.1;
               // operátor "+=" znamená: přičti ke stávající
               // hodnotě navíc 0.1
        }
        BigDecimal cena2 = BigDecimal.ZERO;
        for (int i = 0; i <10; i++){
            cena2 = cena2.add(BigDecimal.valueOf(0.1));
        }
        System.out.println(cena);
        System.out.println(cena2);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }

    public static void ukol6() {
        BigDecimal cena = new BigDecimal(0);
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 120;
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: "+velikostKosile+".");
    }

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }



        public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                +"zkratkou <Ctrl>+</> - použij lomítko "
                +"na numerické klávesnici.");
        System.out.println("ukol1:");
        ukol1();
        System.out.println("ukol2:");
        ukol2();
        System.out.println("ukol3:");
        ukol3();
        System.out.println("ukol4:");
        ukol4();
        System.out.println("ukol5:");
        ukol5();
        System.out.println("ukol6:");
        ukol6();
        System.out.println("ukol7:");
        ukol7();
        System.out.println("ukol8:");
        ukol8();
        System.out.println("ukol9:");
        ukol9();
        System.out.println("Mrkve:");
        ListOfCustomers.prumernyProdejMrkve();

    }
}