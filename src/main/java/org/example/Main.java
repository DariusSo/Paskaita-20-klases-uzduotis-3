package org.example;

import java.util.Random;

public class Main {
    public static String[] vardai = {"Darius", "Mantas", "Benas", "Lukas", "Tomas", "Giedrius", "Rimas", "Vilius"};
    public static String[] pavardes = {"Malasauskas", "Kazlauskas", "Kleiza", "Kondrotas", "Kontrimas", "Paskevicius", "Nauseda", "Vaitkus"};
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i < 8; i++){
            Studentas studentas = new Studentas(vardai[random.nextInt(0,8)], pavardes[random.nextInt(0,8)], Studentas.randomPazymiai());
            System.out.println("Vardas Pavarde: " + studentas.vardas + " " + studentas.pavarde + " | Vidurkis: " + studentas.vidurkis(studentas.pazymiai1));
        }

    }

}