package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Studentas {
    String vardas;
    String pavarde;
    List<Integer> pazymiai1;


    public Studentas(String vardas, String pavarde, List<Integer> pazymiai) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.pazymiai1 = pazymiai;
    }

    public double vidurkis(List<Integer> pazymiai){
        int suma = 0;
        for (Integer i : pazymiai){
            suma = suma + i;
        }
        return (double) suma / pazymiai.size();
    }
    public static List<Integer> randomPazymiai(){
        Random random = new Random();
        List<Integer> pazymiai = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            pazymiai.add(random.nextInt(1,10));
        }
        return pazymiai;
    }
}
