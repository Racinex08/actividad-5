import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de área y perímetro de figuras geométricas");
        System.out.println("-------------------------------------------------------");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        System.out.print("Seleccione la figura (1-5): ");
        int figura = scanner.nextInt();

        switch (figura) {
            case 1:
                calcularCirculo(scanner);
                break;
            case 2:
                calcularCuadrado(scanner);
                break;
            case 3:
                calcularTriangulo(scanner);
                break;
            case 4:
                calcularRectangulo(scanner);
                break;
            case 5:
                calcularPentagono(scanner);
                break;
            default:
                System.out.println("Figura no válida.");
                break;
        }
    }

    private static void calcularCirculo(Scanner scanner) {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;

        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);
    }

    private static void calcularCuadrado(Scanner scanner) {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;
        double perimetro = 4 * lado;

        System.out.println("Área del cuadrado: " + area);
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }

    private static void calcularTriangulo(Scanner scanner) {
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        // En este ejemplo, el perímetro de un triángulo no se calcula, ya que no está claramente definido sin más información.
        System.out.println("Área del triángulo: " + area);
    }

    private static void calcularRectangulo(Scanner scanner) {
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Área del rectángulo: " + area);
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }

    private static void calcularPentagono(Scanner scanner) {
        System.out.print("Ingrese la longitud del lado del pentágono: ");
        double lado = scanner.nextDouble();

        // Se asumirá que el pentágono es regular, de modo que todos sus lados son iguales.
        double apotema = lado / (2 * Math.tan(Math.toRadians(36))); // Apotema para un pentágono regular
        double area = (5 * lado * apotema) / 2;

        System.out.println("Área del pentágono: " + area);
        // En este ejemplo, el perímetro de un pentágono no se calcula, ya que no está claramente definido sin más información.
    }
}
