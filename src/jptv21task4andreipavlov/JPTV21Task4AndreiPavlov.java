/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21task4andreipavlov;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JPTV21Task4AndreiPavlov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int mid = 0;
        int numsum = 0;
        int count = 0;
        int[] ar = new int[100];
        for(int i = 0; i <ar.length; i++){
            while(true){
            
            int randn = random.nextInt(100) +1;
            if (randn%2 != 0){
            
            ar[i] = randn;
            numsum = ar[i] + numsum;
            mid = numsum/ar.length;
            break;

            }

        }
            
        }
                for(int i = 0; i <ar.length; i++){
                    Arrays.sort(ar);
            System.out.printf("%3d",ar[i]);
            if (i == 9 || i == 19 || i == 29 || i == 39 || i == 49 || i == 59 || i == 69 || i == 79 || i == 89){
                System.out.println("");
                
            }
                
    }
                System.out.println("");
                System.out.println("-------------------");
                System.out.println(mid);
    }    
}
