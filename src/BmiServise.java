public class BmiServise {
    public int calculate(int weightInKilos, double heightInMeters) {

        double index = weightInKilos / (heightInMeters * heightInMeters);
        return (int) index;

    }
}
