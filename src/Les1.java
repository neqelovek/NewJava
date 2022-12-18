public class Les1 {
    public static void main(String[] args) {

        sumTwoNumbers(1,2);
        sumTwoNumbers(11,2);
        sumTwoNumbers(11,22);
    }


    //  Task 1: Написать метод, принимающий на вход два целых числа и проверяющий,
    //  что их сумма лежит в пределах от 10 до 20 (включительно),
    //  если да – вернуть true, в противном случае – false.
    private static void sumTwoNumbers (int a, int b){
        System.out.println(10 <= (a+b) && (a+b) <= 20 );
    }
}
