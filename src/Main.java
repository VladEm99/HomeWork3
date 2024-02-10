//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Figure fisrtFigure = new Figure();
        Figure secondFigure = new Figure(12.5, 45.5, 89.1);

        Car firstCar = new Car();

        Calculator calculator = new Calculator();

        NumberManipulator manipulator = new NumberManipulator();


        firstCar.brand = "Audi";
        firstCar.model = "RS7";
        firstCar.year = 2012;

        firstCar.startEngine();
        firstCar.stopEngine();

        System.out.println("Car brand: " + firstCar.brand + "\n" + "Model year: " + firstCar.year + "\n"
                + "Car model: " + firstCar.model);
        System.out.println(calculator.addition(5, 8));
        System.out.println(calculator.isGreater(5.8, 6.7));

        int number = 455;

        int incrementedNumber = manipulator.incrementByOne(number);
        System.out.println("initial number: " + number + "\n"
        + "Incremented number: " + incrementedNumber);

        int decrementedNumber = manipulator.decrementByOne(number);
        System.out.println("initial number: " + number + "\n"
        + "Decremented number: " + decrementedNumber);

        System.out.println("Volume of first figure: " + fisrtFigure.calculateVolume());
        System.out.println("Volume of second figure: " + secondFigure.calculateVolume());
        System.out.println("Area of first figure: " + fisrtFigure.calculateFigureArea());
        System.out.println("Area of second figure: " + secondFigure.calculateFigureArea());


    }
}