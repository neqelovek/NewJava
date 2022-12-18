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
}
