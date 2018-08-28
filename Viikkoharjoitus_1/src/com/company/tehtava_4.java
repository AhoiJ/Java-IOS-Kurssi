package com.company;

import javax.swing.*;

public class tehtava_4 {
    public static void main(String[] args)
    {
        int number;
        double pi = 0;
        double i = 1;

        number = Integer.parseInt(JOptionPane.showInputDialog("Anna kokonaisluku: "));

        int counter = 0;
        while (counter != number)
        {
            if (counter % 2 == 0)
                pi = pi + (4 / i);
            if (counter % 2 != 0)
                pi = pi - (4 / i);

            i += 2;
            counter++;
        }


        String piValue = Double.toString(pi);

        System.out.print(piValue);
        System.exit(0);

    }
}
