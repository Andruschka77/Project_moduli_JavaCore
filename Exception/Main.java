package Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nМеню для пользователя:\n1) Вывести каталог\n2) Добавить объект в каталог\n" +
                    "3) Выдать объект\n4) Вернуть объект\n5) Выход");
            System.out.print("Выберите: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("\nДо свидания!");
                    break;
                default:
                    System.out.println("\nНеверный выбор!");
                    break;
            }

        } while (choice != 5);
    }
}
