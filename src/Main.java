public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 185;
        double growth = 83;
        double bmi = service.calculate(growth, weight);
        System.out.println(bmi);

    }
}
