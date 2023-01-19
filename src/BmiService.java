public class BmiService {

    public double calculate(double weight, double height) {

        double height2 = height/100;


        double bmi = weight / (height2*height2)  ;
        return bmi;
    }
}
