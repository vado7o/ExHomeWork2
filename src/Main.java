import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Задача 1 - Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
//        введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо
//        повторно запросить у пользователя ввод данных.
        task1();

//        Задача 2 - Если необходимо, исправьте данный код
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        task2(intArray);

//        Задача 3 - Дан следующий код, исправьте его там, где требуется
//            task3();

//        Задача 4 - Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
//        task4();
    }

    public static void task1() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите дробное число: ");
            String input = scanner.nextLine();
            try {
                float number = Float.parseFloat(input);
                System.out.println(number);
                break;
            } catch (Exception e) {
                System.out.println("Вы неправильно ввели число!!!");
            }
        }
    }

    public static void task2(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.err.println("На ноль делить нельзя!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Числа с индексом 8 нет в заданном массиве!");
        } catch (NullPointerException e) {
            System.err.println("Задан нулевой массив null!");
        }
    }

    public static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.err.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.err.println("Что-то пошло не так...");
        }
        System.out.println("Программа успешно выполнила все свои задачи");
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void task4() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите что-нибудь: ");
        String input = scanner.nextLine();
        if (Objects.equals(input, "")) {
            throw new Exception("Вы ничего не ввели!");
        }
        System.out.println("Спасибо за ввод данных!");
    }
}
