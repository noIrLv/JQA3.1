public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 50;
        double height = 160;

        double bmi = service.calculate(weight,height);
        System.out.println(bmi);
    }
}