package org.example.Collection;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, phone, email, group;
        int choice;
        PhoneBook pb = new PhoneBook();
        Iterator<Contact> iterator;

        do {
            System.out.println("\nМеню для пользователя:\n1) Добавить контакт\n2) Удалить контакт\n" +
                    "3) Посмотреть все контакты\n4) Найти контакт\n5) Посмотреть контакты по группе\n0) Выход");
            System.out.print("Выберите: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("\nВведите имя - ");
                    name = sc.nextLine();
                    System.out.print("Введите телефон - ");
                    phone = sc.nextLine();
                    System.out.print("Введите email - ");
                    email = sc.nextLine();
                    System.out.print("Введите группу - ");
                    group = sc.nextLine();
                    System.out.println(pb.addContact(name, phone, email, group));
                    break;
                case 2:
                    System.out.print("\nВведите телефон - ");
                    phone = sc.nextLine();
                    System.out.println(pb.removeContact(phone));
                    break;
                case 3:
                    iterator = pb.getContactsList().iterator();
                    System.out.println("\nСписок всех контактов:");
                    while (iterator.hasNext()) {
                        Contact c = iterator.next();
                        System.out.println(c.toString());
                    }
                    break;
                case 4:
                    System.out.print("\nВведите имя - ");
                    name = sc.nextLine();
                    System.out.println("\nКонтакты с именем '" + name + "':");
                    pb.getContact(name);
                    break;
                case 5:
                    System.out.print("\nВведите группу - ");
                    group = sc.nextLine();
                    try {
                        iterator = pb.getContactsByGroup(group).iterator();
                        System.out.println("\n--- Контакты в группе '" + group + "': ---");
                        while (iterator.hasNext()) {
                            Contact c = iterator.next();
                            System.out.println(c.toString());
                        }
                    } catch (NullPointerException e) {
                        System.out.println("\nТакой группы не существует!");
                    }
                    break;
                case 0:
                    System.out.println("\nДо свидания!");
                    break;
                default:
                    System.out.println("\nНеверный выбор!");
                    break;
            }

        } while (choice != 0);
    }

}