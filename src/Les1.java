import java.util.Scanner;

public class Les1 {
    public static void main(String[] args) {

        sumTwoNumbers(1, 2);
        sumTwoNumbers(11, 2);
        sumTwoNumbers(11, 22);
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

        array();
        System.out.println();

        array100();
        System.out.println();

        arrayChange();
        System.out.println();

        arrays();
        System.out.println();

        variableArray();
        System.out.println();

        arrayMaxMin();
        System.out.println();

    }

    //  Task 1: Написать метод, принимающий на вход два целых числа и проверяющий,
    //  что их сумма лежит в пределах от 10 до 20 (включительно),
    //  если да – вернуть true, в противном случае – false.
    private static void sumTwoNumbers(int a, int b) {
        System.out.println(10 <= (a + b) && (a + b) <= 20);
    }

    //    Task 2:Написать метод, которому в качестве параметра передается целое число,
    //    метод должен напечатать в консоль,
    //    положительное ли число передали или отрицательное.
    //    Замечание: ноль считаем положительным числом.
    private static void rationalNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите рациональное число");
        int num = input.nextInt();
        if (num >= 0) {
            System.out.println("Ваше число " + num + " положительное!");
        } else
            System.out.println("Ваше число " + num + " отрицательное!");
    }

    //    Task 3:Написать метод, которому в качестве параметра передается целое число.
    //    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    private static void rationalNum(int a) {
        System.out.println(0 >= a);
    }

    //    Task 4:Написать метод, которому в качестве аргументов передается строка и число,
    //    метод должен отпечатать в консоль указанную строку, указанное количество раз;

    private static void numbersLine() {
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

    private static void leapYear(int a) {
        System.out.println(a % 4 == 0 && a % 100 != 0 || a % 400 == 0);
    }

    //    Task 6:Задать целочисленный массив, состоящий из элементов 0 и 1.
    //    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    private static void array() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else array[i] = 1;
            System.out.print(array[i] + " ");
        }
    }

    //    Task 7:Задать пустой целочисленный массив длиной 100.
    //    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    private static void array100() {
        int[] array = new int[101];
        for (int i = 1; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
    }

    //    Task 8:Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    //    пройти по нему циклом, и числа меньшие 6 умножить на 2;

    private static void arrayChange() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                var num = (array[i] * 2);
                array[i] = num;
            }
            System.out.print(array[i] + " ");
        }
    }

    //    Task 9:
    //    (можно только одну из диагоналей, если обе сложно).
    //    Определить элементы одной из диагоналей можно по следующему принципу:
    //    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    private static void arrays() {
        int[][] arrays = new int[5][5];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i][i] = 1;
            arrays[i][arrays.length - i - 1] = 1;
        }
        for (int[] array : arrays) {
            for (int j = 0; j < arrays.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }

    //    Task 10: Написать метод, принимающий на вход два аргумента: len и initialValue,
    //    и возвращающий одномерный массив типа int длиной len,
    //    каждая ячейка которого равна initialValue;

    private static void variableArray() {
        Scanner length = new Scanner(System.in);
        System.out.println("Введите длину массива ");
        int len = length.nextInt();
        Scanner value = new Scanner(System.in);
        System.out.println("Инициализируйте ячейки массива ");
        int initialValue = value.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
    }

//    Task 11: Задать одномерный массив и найти в нем минимальный и максимальный элементы;

    private static void arrayMaxMin() {
        int[] array = {1, 2, 3, -4, -5, 6, 7};
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                max = array[0];
                min = array[0];
            }
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Максимальное значение " + max);
        System.out.println("Минимальное значение " + min);
    }
}
