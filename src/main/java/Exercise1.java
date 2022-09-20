public class Exercise1 {
    public static void main(String[] args) {
        double number1 = 5;
        double number2 = 10;

        Algorithms algorithms = new Algorithms();
        System.out.println(algorithms.addTwoNumber(number1, number2));
        boolean check = algorithms.thePrimeNumberIsGreaterThanTheSecond(number1, number2);
        System.out.println(check);

    }

    public static class Algorithms {

        public double addTwoNumber(double number1, double number2) {
            double sum = number1 + number2;
            return sum;
        }

        public boolean thePrimeNumberIsGreaterThanTheSecond(double number1, double number2) {
            return number1 > number2;
        }
    }

}
