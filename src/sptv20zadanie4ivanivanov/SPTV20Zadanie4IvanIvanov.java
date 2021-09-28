/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20zadanie4ivanivanov;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author User
 */
public class SPTV20Zadanie4IvanIvanov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int[] numss = new int[100];
int max=100,min=0;
int num=0;
for (int i = 0; i < 100; i++){
    Random random = new Random();
        if(max % 4 == 1)
        max = max + 1;
        int range = (max - min + 1) / 2;
        numss[i] = random.nextInt(range) * 2 + min;      
    }
    int k=0;
    Arrays.sort(numss);
    for (int i = 0; i < numss.length; i++) {
        System.out.printf("%7d",numss[i]);
        k++;
        if (k==10){
            System.out.println();
            k=0;
        }           
        }
    int sum = 0;
    for (int i = 0; i < numss.length; i++) {
        sum = sum + numss[i];
}
    int numGotov=sum/10;
    System.out.println("|среднее арифметическое:"+numGotov);
}
}
