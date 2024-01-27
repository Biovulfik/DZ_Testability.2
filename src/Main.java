public class Main {
    public static void main(String[] args) {
        BmiServise servise = new BmiServise();
        int index = servise.calculate(95, 1.78);
        System.out.println(index);


    }
}