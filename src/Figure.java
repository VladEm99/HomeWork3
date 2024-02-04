public class Figure {
    double height;
    double width;
    double length;

    public Figure() {
        this.height = 10.5;
        this.width = 15.3;
        this.length = 55.6;
    }

    public Figure(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
    public double calculateVolume() {
        return this.length * this.width * this.height;
    }
    public double calculateFigureArea() {
        return 2 * (this.height * this.width + this.height * this.length + this.width * this.length);
    }
}
