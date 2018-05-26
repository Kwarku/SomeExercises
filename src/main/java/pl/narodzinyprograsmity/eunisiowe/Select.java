package pl.narodzinyprograsmity.eunisiowe;

import java.io.Console;

public class Select {

    private static int tablica[];
    private static int ile_liczb;

    private static void selectionsort(int tablica[], int ile_liczb) {
        int min, i, j, temp;

        for (i = 0; i < ile_liczb - 1; i++) {
            min = i;
            for (j = i + 1; j < ile_liczb; j++)
                if (tablica[j] < tablica[min]){
                    min = j;
                }
            temp = tablica[min];
            tablica[min] = tablica[i];
            tablica[i] = temp;
        }
    }

    public static void main(String[] args) {

        int i, liczba;

        System.out.println("Ile liczb chesz posortowac.");
        ile_liczb = 10;
        tablica = new int[]{5, 1, 6, 8, 2, 8, 4, 6, 2, 9};
//        for (i = 0; i < ile_liczb; i++) {
//            tablica[i] = Console.readInt("Wprowadz liczbe #" + (i + 1));
//        }

        System.out.println("Tablica przed posortowaniem:");
        for (i = 0; i < ile_liczb; i++)
            System.out.println(tablica[i]);
        selectionsort(tablica, ile_liczb);
        System.out.println("Tablica po posortowaniu:");
        for (i = 0; i < ile_liczb; i++)
            System.out.println(tablica[i]);
    }
}