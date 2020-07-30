package info_retrieval;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class NazwyLudzi {
    static String Imie() throws FileNotFoundException {
        Scanner odczyt = new Scanner(new File("E:\\bot\\imie.txt"));
        Random r = new Random();
        String imie[] = new String[153];
        int indeks = r.nextInt(153);
        for (int i=0;i<imie.length;i++)
            imie[i] = odczyt.nextLine();

        return imie[indeks];
    }

    public static String Nazwisko() throws FileNotFoundException {
        Scanner odczyt = new Scanner(new File("C:\\Users\\Artur\\Desktop\\last.txt"));
        Random r = new Random();
        String nazwisko[] = new String[93];
        int indeks = r.nextInt(93);
        for (int i=0;i<93;i++)
            nazwisko[i] = odczyt.nextLine();

        return nazwisko[indeks];
    }
}
