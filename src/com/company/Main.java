package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        ============================== TRECIA TEMA: CIKLAI ============================
//  --------------------------------  [1] -------------------------------------
//        int i = 0;
//        int count = 0;
//        double doubleRandomNumber = Math.random() * 300 + 1;
//        int randomNumber = (int) doubleRandomNumber;
//        String list;
//        if (randomNumber > 275){
//            list = "[" + Integer.toString(randomNumber) + "] ";
//        }else {
//            list = Integer.toString(randomNumber) + " ";
//        }
//        count = 1;
//        while (i <= 300) {
//            doubleRandomNumber = Math.random() * 300 + 1;
//            randomNumber = (int) doubleRandomNumber;
//            if (randomNumber > 150) {
//                count++;
//            }
//            if (randomNumber > 275){
//                list = list + "[" + randomNumber + "] ";
//            }else {
//                list = list + randomNumber + " ";
//            }
//            i++;
//        }
//        System.out.println(list);
//        System.out.println("Didesniu, nei 150 skaiciu: " + count);

//  --------------------------------  [2] -------------------------------------
//        int numbers;
//        double liekana;
//        String numbersList = "";
//            for (numbers=1; numbers <= 3000; numbers++){
//                liekana=numbers % 77;
//                if (liekana == 0){
//                        numbersList = numbersList + numbers + ",";
//                    }
//                }
//        System.out.println(numbersList.substring(0, numbersList.length()-1));

//  --------------------------------  [3] -------------------------------------
//        int ilgis1;
//        int plotis1;
//        for (ilgis1=1; ilgis1<=100; ilgis1++){
//            for (plotis1=1; plotis1<=100; plotis1++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        --------------------------------  [4] -------------------------------------

//        int ilgis;
//        int plotis;
//        int kaire = 1;
//        int desine = 100;
//        int aukstis = 1;
//
//        while (aukstis<=100) {
//            for (ilgis = 1; ilgis <= 100; ilgis++) {
//                if (ilgis != kaire && ilgis != desine) {
//                    System.out.print("*");
//                }
//                if (ilgis == kaire || ilgis == desine) {
//                    System.out.print("-");
//                }
//                if (ilgis == 100) {
//                    System.out.println();
//                    aukstis++;
//                    kaire++;
//                    desine--;
//                }
//
//            }
//        }
//  --------------------------------  [5] -------------------------------------

//    double doubleFlip;
//    int flip;
//    int i;
//
//    doubleFlip = Math.random() * 2 + 1;
//    flip = (int) doubleFlip;
//
//    if (flip==2){
//        System.out.println("Iskrito skaicius.");
//    }else {
//        System.out.println("Iskrito herbas.");
//    }
//
//        while(flip > 1){
//            doubleFlip = Math.random() * 2 + 1;
//            flip = (int) doubleFlip;
//
//            if (flip==2){
//                System.out.println("Iskrito skaicius.");
//            }
//            else {
//                System.out.println("Iskrito herbas.");
//            }
//        }

//  --------------------------------  [6] -------------------------------------
//        double doublePetras = 0;
//        int numberPetras;
//        int countPetras = 0;
//        int minPetras;
//
//        double doubleKazys = 0;
//        int numberKazys;
//        int countKazys = 0;
//        int minKazys;
//
//        while (countPetras<=222 && countKazys<=222) {
//
//            doublePetras = Math.random() * 20 + 1;
//            numberPetras = (int) doublePetras;
//            if(numberPetras < 10) {
//                while (numberPetras < 10) {
//                    doublePetras = Math.random() * 20 + 1;
//                    numberPetras = (int) doublePetras;
//                }
//            }
//            System.out.println("Petras: " + numberPetras);
//
//            doubleKazys = Math.random() * 25 + 1;
//            numberKazys = (int) doubleKazys;
//            if(numberKazys < 5) {
//                while (numberKazys < 5) {
//                    doubleKazys = Math.random() * 25 + 1;
//                    numberKazys = (int) doubleKazys;
//                }
//            }
//            System.out.println("Kazys: " + numberKazys);
//
//            countPetras = countPetras + numberPetras;
//            System.out.println("Visi Petro taskai: " + countPetras);
//
//            countKazys = countKazys + numberKazys;
//            System.out.println("Visi Kazio taskai: " + countKazys);
//
//            }
//        if (countPetras > countKazys) {
//            System.out.println("Laimejo Petras" + countPetras + " tsk.");
//        }
//        if (countPetras < countKazys) {
//            System.out.println("Laimejo Kazys:" + countKazys + " tsk.");
//        }
//        --------------------------------  [7] -------------------------------------

//        int ilgis;
//        int plotis;
//        int kaire = 11;
//        int desine = 11;
//        int aukstis = 1;
//
//        while (aukstis<=21) {
//            if (aukstis <= 11) {
//                for (ilgis = 1; ilgis <= 21; ilgis++) {
//                    if (ilgis > kaire || ilgis < desine) {
//                        System.out.print("-");
//                    }else {
//                        System.out.print("+");
//                    }
//                    if (ilgis == 21) {
//                        System.out.println();
//                        aukstis++;
//                        kaire++;
//                        desine--;
//                    }
//
//                }
//            }
//            if (aukstis >= 11) {
//                for (ilgis = 1; ilgis <= 21; ilgis++) {
//                    if (ilgis > kaire || ilgis < desine) {
//                        System.out.print("-");
//                    }else {
//                        System.out.print("+");
//                    }
//                    if (ilgis == 21) {
//                        System.out.println();
//                        aukstis++;
//                        kaire--;
//                        desine++;
//                    }
//
//                }
//            }
//        }

//  --------------------------------  [8] -------------------------------------

//    double hammer1 = 0;
//    double nailLenght1 = 8.5;
//    int count1 = 0;
//
//    double hammer2;
//    double nailLenght2 = 8.5;
//    int count2 = 0;
//
//    while (nailLenght1 > 0){
//        count1++;
//        System.out.println("Smugis Nr.:" + count1);
//
//        hammer1 = (Math.random() * 20 + 1) / 10;
//        if (hammer1 < 0.5) {
//            while (hammer1 < 0.5) {
//                hammer1 = (Math.random() * 20 + 1) / 10;
//            }
//        }
//        System.out.println("Ikalei: " + hammer1);
//        nailLenght1 = nailLenght1 - hammer1;
//        if (nailLenght1 > 0) {
//            System.out.println("Liko kalti: " + nailLenght1);
//        }else {
//            System.out.println("Vinis ikalta per " + count1 + " smugius.");
//        }
//        System.out.println("");
//    }
//        System.out.println("-----------------------------");
//
//        while (nailLenght2 > 0){
//            count2++;
//            System.out.println("Smugis Nr.:" + count2);
//
//            hammer2 = (Math.random() * 30 + 1) / 10;
//            if (hammer2 < 2) {
//                while (hammer2 < 2) {
//                    hammer2 = (Math.random() * 30 + 1) / 10;
//                }
//            }
//            System.out.println("Ikalei: " + hammer2);
//            nailLenght2 = nailLenght2 - hammer2;
//            if (nailLenght2 > 0) {
//                System.out.println("Liko kalti: " + nailLenght2);
//            }else {
//                System.out.println("Vinis ikalta per " + count2 + " smugius.");
//            }
//            System.out.println("");
//        }

//  --------------------------------  [9] -------------------------------------
//  ---------- generuojame sveiku skaiciu masyva -----------

        int i, j;
        int m = 50;
        int masyvas1[] = new int[m];
        String orgString = "";
        System.out.println("***** GENERUOJAM ATSITIKTINIU NEPASIKARTOJANCIU SKAICIU MASYVA *****");
            for (i = 0; i < m; i++) {
                masyvas1[i] = (int) (Math.random() * 200 + 1);
                System.out.print(masyvas1[i] + " ");
                for (j = 0; j < i-1; j++) {
                    if (masyvas1[i] == masyvas1[j]) {
                        System.out.print("-> ");
                        masyvas1[i] = (int) (200 * Math.random());
                        System.out.print(masyvas1[i]+" ");
                    }
                }
                orgString = orgString + masyvas1[i] + " "; // irasom masyvo skaicius i stringa
            }
        double liekana; // tikrina ar liko liekana
        int count; // skaiciuoja kiek kartu neliko liekanos
        String pirmSkString = "";
        System.out.println(" ");
        System.out.println("***** IESKOM PIRMINIU SKAICIU *****");
            for (i = 1; i < m; i++) {
                count = 0;
                for (j = 1; j <= masyvas1[i]; j++) {
                    liekana = masyvas1[i] % j;
                    if (liekana == 0) {
                        count = count + 1;
                    }
                }
                if (count <= 2 && masyvas1[i] != 1) {
                    pirmSkString = pirmSkString + masyvas1[i] + " ";
                }
            }
        System.out.println("Pirminiu skaiciu masyvas: ");
        String[] pirmSkString1 = pirmSkString.split(" ");
        int masyvas2[] = new int[pirmSkString1.length];
        for (i = 0; i < pirmSkString1.length; i++) {
            System.out.print(pirmSkString1[i] + " ");
            masyvas2[i]= Integer.parseInt(pirmSkString1[i]);
        }
        int temp;
        for(i = 0; i< masyvas2.length; i++) {
            for (j = i + 1; j < masyvas2.length; j++) {
                if (masyvas2[i] > masyvas2[j]) {
                    temp = masyvas2[i];
                    masyvas2[i] = masyvas2[j];
                    masyvas2[j] = temp;
                }
            }
        }
        System.out.println("");
        System.out.println("Isrusiuoti skaiciai: ");
        for (i = 0; i < masyvas2.length; i++) {
            System.out.print(masyvas2[i] + " ");
            pirmSkString1[i] = Integer.toString(masyvas2[i]); // sukeliu i stringa
        }

    }
}