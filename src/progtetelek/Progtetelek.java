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
public class Progtetelek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tesztesetek
        
        double[] t = {-5.2, -2.0, 0.0, 1.1, 2.0, 3.3, 4.0};
        
        double arraySum = Tetelek.sumArray(t);
        System.out.println("sum = " + arraySum);
        Tetelek.sumArrayConsole(t);
        
        double arrayMax = Tetelek.selectMax(t);
        System.out.println("max = " + arrayMax);
        Tetelek.selectMaxConsole(t);
        
        int evenCount = Tetelek.countFunction(t, (double x) -> x % 2 == 0.0);
        System.out.println("count = " + evenCount);
        Tetelek.countFunctionConsole(t, (double x) -> x % 2 == 0.0);
    }
    
}
