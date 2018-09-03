package com.company;
import java.util.Random;

class Tilasto{

    public static double add(double[] data) {
        double sum = 0;
        for (double d : data){
            sum += d;
        }
        return sum;
    }
    public static double min(double[] data){
        double min = data[0]; // tai mahd iso
        for (double d: data){
            if (d < min){
                min = d;
            }
        }
        return min;
    }
    public static double max(double[] data){
        double max = data[0];
        for (double d : data){
            if (d > max){
                max = d;
            }
        }
        return max;
    }
    public static double average(double[] data){

        double avg = 0.0;
        int arrayLength = data.length;
        // Loopissa lisätään kaikki arrayssa olevat luvut yhteen
        for (int i = 0; i < data.length; i++){
            avg += data[i];
        }
        avg = avg / arrayLength; // lasketaan keskiarvo

        return avg;
    }
    public static void randomArray(double[] newdata, double min, double max){
        Random rand = new Random();
        for (int i = 0; i < newdata.length; i++){
            newdata[i] = min + (rand.nextDouble() * (max - min));
        }
    }
}


public class tehtava_1_2 {

    public static void main(String[] args) {
        double data[] = new double[] {1,2,3,4,5};
        double newdata[] = new double [7];

        Tilasto.randomArray(newdata, 10, 20);
        for (double d : newdata){
            System.out.println(d);
        }


        System.out.println(Tilasto.add(data));
        try {
            System.out.println(Tilasto.min(data));
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        try {
            System.out.println(Tilasto.max(data));
        }
        catch (Exception ex2){
            System.out.println(ex2);
        }
        System.out.println(Tilasto.average(data));
    }

}
