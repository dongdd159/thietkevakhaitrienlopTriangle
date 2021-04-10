import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color:" );
        String color = scanner.nextLine();
        System.out.println("Enter side 1:" );
        double side1 = scanner.nextDouble();
        System.out.println("Enter side 2:" );
        double side2 = scanner.nextDouble();
        System.out.println("Enter side 3:" );
        double side3 = scanner.nextDouble();

        Shape triangle = new Shape(side1, side2, side3, color);
        System.out.println(triangle.toString());
    }
}
