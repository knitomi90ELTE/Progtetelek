/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progtetelek;

/**
 *
 * @author knitomi90
 */
public class Tetelek {
    
    public static int countFunction(double[] t, Condition c){
        if(t.length == 0) throw new RuntimeException("Array is empty.");
        int count = 0;
        for(int i = 0; i < t.length; i++){
            if(c.condition(t[i])){
                count++;
            }
        }
        return count;
    }
    
    public static void countFunctionConsole(double[] t, Condition c){
        if(t.length == 0) throw new RuntimeException("Array is empty.");
        int count = 0;
        for(int i = 0; i < t.length; i++){
            if(c.condition(t[i])){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
    
    public static double selectMax(double[] t){
        if(t.length == 0) throw new RuntimeException("Array is empty.");
        double max = t[0];
        for(int i = 1; i < t.length; i++){
            if(t[i] > max){
                max = t[i];
            }
        }
        return max;
    }
    
    public static void selectMaxConsole(double[] t){
        if(t.length == 0) throw new RuntimeException("Array is empty.");
        int ind = 0;
        double max = t[ind];
        for(int i = 1; i < t.length; i++){
            if(t[i] > max){
                max = t[i];
                ind = i;
            }
        }
        System.out.println("max = " + max + " at index " + ind);
    }
    
    public static double sumArray(double[] t){
        if(t.length == 0) throw new RuntimeException("Array is empty.");
        double sum = 0.0;
        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }
        return sum;
    }
    
    public static void sumArrayConsole(double[] t){
        if(t.length == 0) throw new RuntimeException("Array is empty.");
        double sum = 0.0;
        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }
        System.out.println("sum = " + sum);
    }
    
    
}
