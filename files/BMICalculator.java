/**
 * Loggster1
 * www.loggster.dev
 */
public class BMICalculator{ 
    public static double calculateBMI(double iFeet, double iInches, double dPounds) {
        double heightInInches = (iFeet * 12) + iInches;
        double calc = ((dPounds * 703)/(heightInInches * heightInInches)); 
        return Math.round(calc*10.0) /10.0;
    }
}
