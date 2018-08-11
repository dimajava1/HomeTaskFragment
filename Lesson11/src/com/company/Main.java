package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList WorkersTime = new ArrayList();

        Wpochas PoChasu1 = new Wpochas();
        PoChasu1.ID=1;
        PoChasu1.name = "Paul";
        PoChasu1.raschet();

        Wpochas PoChasu2 = new Wpochas();
        PoChasu2.ID=2;
        PoChasu2.name = "Max";
        PoChasu2.raschet();

        Wpochas PoChasu3 = new Wpochas();
        PoChasu3.ID=3;
        PoChasu3.name = "Harry";
        PoChasu3.raschet();

        Wpochas PoChasu4 = new Wpochas();
        PoChasu4.ID=4;
        PoChasu4.name = "Ron";
        PoChasu4.raschet();

        WorkersTime.add(PoChasu1);
        WorkersTime.add(PoChasu2);
        WorkersTime.add(PoChasu3);
        WorkersTime.add(PoChasu4);

    }
}