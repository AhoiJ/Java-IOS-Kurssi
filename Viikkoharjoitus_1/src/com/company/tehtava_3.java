package com.company;

public class tehtava_3 {

    public static void main(String[] args)
    {
        String star = "*";
        String singleStar = "*";

        for (int i = 0; i < 5; i++)
        {
            System.out.println(star);
            star += singleStar;

        }
        for (int i = 0; i < 5; i++)
        {
            star = star.substring(0, star.length() -1);
            System.out.println(star);

        }
        System.exit(0);

    }
}
