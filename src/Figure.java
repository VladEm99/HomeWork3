public class Figure {
    double height;
    double width;
    double length;

    //а. Пустой (по умолчанию) - без входных параметров и без
    //инициализации полей.
    public Figure() {}

    //б. С передачей входных значений: Высота , Ширина, Длина
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
