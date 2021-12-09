package prac16;

import java.util.HashMap;
import java.util.Scanner;

public class UI {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x, choose, table;
        double temp;
        String temp1, temp2, address;
        OrderManager orderManager = new OrderManager();
        RestaurantOrder restaurantOrder = new RestaurantOrder();
        InternetOrder internetOrder = new InternetOrder();
        while (true) {
            System.out.println("1) Создать offline заказ на столик");
            System.out.println("2) Создать online заказ на адрес");
            System.out.println("3) Сумма денег с заказов ресторана");
            System.out.println("4) Сумма денег с заказов по интернету");
            System.out.println("5) Количество заказов с ресторана");
            System.out.println("6) Количество заказов с интернета");
            System.out.println("7) Получить все заказы");
            System.out.println("8) Выход");
            System.out.print("Ваш выбор: ");
            x = scanner.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Стол?");
                    table = scanner.nextInt();
                    System.out.println("Напиток (введите 1)/ Блюдо (введите 2)");
                    choose = scanner.nextInt();
                    System.out.println("Цена?");
                    temp = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Название?");
                    temp1 = scanner.nextLine();
                    System.out.println("Описание?");
                    temp2 = scanner.nextLine();
                    switch (choose) {
                        case 1:
                            restaurantOrder.add(new Drink(temp1, temp2, temp));
                            orderManager.add(table, restaurantOrder);
                            break;
                        case 2:
                            restaurantOrder.add(new Dish(temp1, temp2, temp));
                            orderManager.add(table, restaurantOrder);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Адресс?");
                    Scanner ad = new Scanner(System.in);
                    address = ad.nextLine();
                    System.out.println("Напиток (введите 1)/ Блюдо (введите 2)");
                    choose = scanner.nextInt();
                    System.out.println("Цена?");
                    temp = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Название?");
                    temp1 = scanner.nextLine();
                    System.out.println("Описание?");
                    temp2 = scanner.nextLine();
                    switch (choose) {
                        case 1:
                            internetOrder.add(new Drink(temp1, temp2, temp));
                            orderManager.add(address, internetOrder);
                            break;
                        case 2:
                            internetOrder.add(new Dish(temp1, temp2, temp));
                            orderManager.add(address, internetOrder);
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println(restaurantOrder.priceTotal());
                case 4:
                    System.out.println(internetOrder.priceTotal());
                    break;
                case 5:
                    System.out.println(restaurantOrder.getCount());
                    break;
                case 6:
                    System.out.println(internetOrder.getCount());
                    break;
                case 7:
                    System.out.println(orderManager.getAllOrders());
                    break;
                case 8:
                    return;
            }
        }
    }
}
