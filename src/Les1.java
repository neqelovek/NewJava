import java.util.Scanner;

public class Les1 {
    public static void main(String[] args) {

        sumTwoNumbers(1,2);
        sumTwoNumbers(11,2);
        sumTwoNumbers(11,22);
        System.out.println();

        rationalNumber();
        System.out.println();

        rationalNum(12);
        rationalNum(-13);
        System.out.println();

        numbersLine();
        System.out.println();

        leapYear(2016);
        leapYear(2022);
        System.out.println();

        arrays();

    }

    //  Task 1: Написать метод, принимающий на вход два целых числа и проверяющий,
    //  что их сумма лежит в пределах от 10 до 20 (включительно),
    //  если да – вернуть true, в противном случае – false.
    private static void sumTwoNumbers (int a, int b){
        System.out.println(10 <= (a+b) && (a+b) <= 20 );
    }

    //    Task 2:Написать метод, которому в качестве параметра передается целое число,
    //    метод должен напечатать в консоль,
    //    положительное ли число передали или отрицательное.
    //    Замечание: ноль считаем положительным числом.
    private static void rationalNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите рациональное число");
        int num = input.nextInt();
        if (num >= 0){
            System.out.println("Ваше число " + num + " положительное!");
        }else
            System.out.println("Ваше число " + num + " отрицательное!");
    }

    //    Task 3:Написать метод, которому в качестве параметра передается целое число.
    //    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    private static void rationalNum(int a){
        System.out.println(0 >= a);
    }

    //    Task 4:Написать метод, которому в качестве аргументов передается строка и число,
    //    метод должен отпечатать в консоль указанную строку, указанное количество раз;

    private static void numbersLine(){
        Scanner lines = new Scanner(System.in);
        System.out.println("Введите строку ");
        String string = lines.nextLine();
        Scanner num = new Scanner(System.in);
        System.out.println("Введите количество нужных строк ");
        int number = num.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println(string);
        }
    }

    //    Task 5:Написать метод, который определяет, является ли год високосным,
    //    и возвращает boolean (високосный - true, не високосный - false).
    //    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    private static void leapYear(int a){
        System.out.println(a % 4 == 0 && a % 100 != 0 || a % 400 == 0);
    }

    //    Task 6:Задать целочисленный массив, состоящий из элементов 0 и 1.
    //    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    private static void arrays() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else array[i] = 1;
            System.out.print(array[i] + " ");
        }
    }
}
