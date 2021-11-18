package com.company;
import java.util.*;

public class Main {
    int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
    double q = 1.00/6;
    double r = Math.random();


    //default constructor
    public Main(){

    }

    private void counting(){
        for (int i=0; i<1000; i++)
        {

            if ((r>=0) && (r<(q)))
            {
                count1 = count1 + 1;
            }

            else if ((r>=(q)) && (r<(2*(q))))
            {
                count2 = count2 + 1;
            }

            else if ((r>=(2*(q))) && (r<(3*(q))))
            {
                count3 = count3 + 1;
            }

            else if ((r>=(3*(q))) && (r<(4*(q))))
            {
                count4 = count4 + 1;
            }

            else if ((r>=(4*(q))) && (r<(5*(q))))
            {
                count5 = count5 + 1;
            }

            else if ((r>=(5*(q))) && (r<1))
            {
                count6 = count6 + 1;
            }
        }

    }
    private void display(){
        Formatter fmt = new Formatter();

        fmt.format("%3s %15s %30s\n", "dice Face", "Frequency", "Percentage Frequency (%)");

        double freq1 = ((double)count1*.1);
        double freq2 = ((double)count2*.1);
        double freq3 = ((double)count3*.1);
        double freq4 = ((double)count4*.1);
        double freq5 = ((double)count5*.1);
        double freq6 = ((double)count6*.1);

        int total_frequency = count1+count2+count3+count4+count5+count6;

        double total_percentage = freq1+freq2+freq3+freq4+freq5+freq6;

        fmt.format("%3s %12d %20.2f\n", "1", count1, freq1);
        fmt.format("%3s %12d %20.2f\n", "2", count2, freq2);
        fmt.format("%3s %12d %20.2f\n", "3", count3, freq3);
        fmt.format("%3s %12d %20.2f\n", "4", count4, freq4);
        fmt.format("%3s %12d %20.2f\n", "5", count5, freq5);
        fmt.format("%3s %12d %20.2f\n", "6", count6, freq6);

        //Simulation output
        System.out.println(fmt);
        System.out.printf("The dice was rolled %d%s\n", total_frequency, " times.");
        System.out.printf("The cumulative percentage frequency is %.2f%s\n", total_percentage, "%.");

    }


    public static void main(String[] args) {
        Main obj = new Main();
        obj.counting();
        obj.display();
	// write your code here

    }
}
