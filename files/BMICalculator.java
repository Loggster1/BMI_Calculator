/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Loggster
 */
public class BMICalculator{ 
    public static double calculateBMI(double iFeet, double iInches, double dPounds) {
        double heightInInches = (iFeet * 12) + iInches;
        double calc = ((dPounds * 703)/(heightInInches * heightInInches)); 
        return Math.round(calc*10.0) /10.0;
    }
}
