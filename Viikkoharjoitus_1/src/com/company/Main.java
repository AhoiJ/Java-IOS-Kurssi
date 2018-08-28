package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

     double keskiarvo = 0;
     int[] luvut = new int[5];

 for(int i = 0; i< luvut.length; i++)
        {
            luvut[i] = Integer.parseInt(JOptionPane.showInputDialog("Anna kokonaisluku: " + (i + 1)));
            keskiarvo += luvut[i];
        }

        keskiarvo = (double)keskiarvo/5;

        System.out.println("Average is: " + keskiarvo);

    }
}
