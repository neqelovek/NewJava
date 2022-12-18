import java.util.Scanner;

public class Les1 {
    public static void main(String[] args) {

        sumTwoNumbers(1,2);
        sumTwoNumbers(11,2);
        sumTwoNumbers(11,22);

        rationalNumbers();
    }


    //  Task 1: Написать метод, принимающий на вход два целых числа и проверяющий,
    //  что их сумма лежит в пределах от 10 до 20 (включительно),
    //  если да – вернуть true, в противном случае – false.
    private static void sumTwoNumbers (int a, int b){
        System.out.println(10 <= (a+b) && (a+b) <= 20 );
    }

    //    Task 2:Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    //    положительное ли число передали или отрицательное.
    //    Замечание: ноль считаем положительным числом.
    private static void rationalNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите рациональное число");
        int num = input.nextInt();
        if (num >= 0){
            System.out.println("Ваше число " + num + " положительное!");
        }else
            System.out.println("Ваше число " + num + " отрицательное!");
    }
}
