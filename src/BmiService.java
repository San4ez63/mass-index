public class BmiService {
    public double calculate(double weight, double growth) {
        double bmi = weight / (growth / 100 * growth / 100);
        return bmi;


    }
}