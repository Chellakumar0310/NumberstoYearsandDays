/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecalculation;

import java.util.Scanner;

/**
 *
 * @author chellakumar
 */
public class TimeCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double minutesInYear = 60*24*365;
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the Number of Minutes: ");
     double min = in.nextDouble();
     long years = (long) (min/minutesInYear);
     int days = (int)(min/60/24) % 365;
     
     
     
     System.out.println((int) min + "\nMinutes is approximately " +years+ " years and " +days+ "days");
     
   
     
    }
    
}
