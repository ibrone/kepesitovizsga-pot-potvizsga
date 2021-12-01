package hu.nive.ujratervezes.kepesitovizsga_pot_potvizsga.uppercase;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;


public class UpperCaseLetters {
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        ArrayList<String> characters = new ArrayList<String>();

        try {
            raf = new RandomAccessFile("characters.txt", "r");

            for (sor = raf.readLine(); sor != null; sor = raf.readLine()) {
                

            }

            raf.close();
        } catch (IOException e) {
            System.out.println("HIBA");
        }
    }

    public void getNumberOfUppercase(){

        for (int i = 0; i < sor.lenght(); i++){

        }
    }


}
