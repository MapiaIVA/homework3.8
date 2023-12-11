import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координату начала отрезка: ");
        int startCoord = scanner.nextInt();
        System.out.print("Введите координату конца отрезка: ");
        int endCoord = scanner.nextInt();

        if (startCoord < endCoord) {
            System.out.println("Подъем");
        } else if (startCoord > endCoord) {
            System.out.println("Спуск");
        } else {
            System.out.println("Ровная дорога");
        }
    }
}