package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Wpochas implements Worker{
    int ID;
    String name;
    double zarplata;
    @Override
    public void raschet() {
        System.out.println("Введите почасовую ставку");
        Scanner in = new Scanner(System.in);
        double stavka = in.nextInt();
        zarplata = 20.8 * 8 * stavka;
        System.out.println("Заработная плата: " + zarplata);
    }
    double pay= zarplata;
}
