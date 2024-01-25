public class App {
    public static void main(String[] args) throws Exception {
        // Создаем объект круга с радиусом 5
        TwoDimensionalShape circle = new Circle(5);

        // Выводим площадь круга
        System.out.println("Площадь круга: " + circle.area());

        // Создаем объект куба с длиной ребра 3
        TwoDimensionalShape cube = new Cube(3);

        // Выводим площадь куба
        System.out.println("Площадь куба: " + cube.area());

        // Создаем объект куба с длиной ребра 3
        ThreeDimensionalShape сube2 = new Cube(3);

        // Выводим объем куба
        System.out.println("Объем куба: " + сube2.volume());
    }    
}