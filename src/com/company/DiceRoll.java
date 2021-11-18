package com.company;
import java.util.*;

public class DiceRoll {
    private static int count1 = 0;
    private static int count2 = 0;
    private static int count3 = 0;
    private static int count4 = 0;
    private static int count5 = 0;
    private static int count6 = 0;

    public DiceRoll() {
    }

    private void function1() {
        for(int var1 = 0; var1 < 1000; ++var1) {
            double var2 = Math.random();
            double var4 = 0.16666666666666666D;
            if (var2 >= 0.0D && var2 < var4) {
                ++count1;
            } else if (var2 >= var4 && var2 < 2.0D * var4) {
                ++count2;
            } else if (var2 >= 2.0D * var4 && var2 < 3.0D * var4) {
                ++count3;
            } else if (var2 >= 3.0D * var4 && var2 < 4.0D * var4) {
                ++count4;
            } else if (var2 >= 4.0D * var4 && var2 < 5.0D * var4) {
                ++count5;
            } else if (var2 >= 5.0D * var4 && var2 < 1.0D) {
                ++count6;
            }
        }

    }

    private void display() {
        Formatter var1 = new Formatter();
        var1.format("%3s %15s %30s\n", "Dice Face", "Frequency", "Percentage Frequency (%)");
        double var2 = (double)count1 * 0.1D;
        double var4 = (double)count2 * 0.1D;
        double var6 = (double)count3 * 0.1D;
        double var8 = (double)count4 * 0.1D;
        double var10 = (double)count5 * 0.1D;
        double var12 = (double)count6 * 0.1D;
        int rolls = count1 + count2 + count3 + count4 + count5 + count6;
        double freq = var2 + var4 + var6 + var8 + var10 + var12;
        var1.format("%3s %12d %20.2f\n", "1", count1, var2);
        var1.format("%3s %12d %20.2f\n", "2", count2, var4);
        var1.format("%3s %12d %20.2f\n", "3", count3, var6);
        var1.format("%3s %12d %20.2f\n", "4", count4, var8);
        var1.format("%3s %12d %20.2f\n", "5", count5, var10);
        var1.format("%3s %12d %20.2f\n", "6", count6, var12);
        System.out.println(var1);
        System.out.printf("The dice was rolled %d%s\n", rolls, " times.");
        System.out.printf("The cumulative percentage frequency is %.2f%s\n", freq, "%.");
    }

    public static void main(String[] var0) {
        DiceRoll var1 = new DiceRoll();
        var1.function1();
        var1.display();
    }

}
