import java.util.ArrayList;

public class Les3 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(24);
        numbers.add(3);
        numbers.add(9);
        numbers.add(5);
        numbers.add(4);
        numbers.add(61);

        oddNumbers(numbers);
        System.out.println();
        arithmeticNumber(numbers);
    }

    //     Task 1. Пусть дан произвольный список целых чисел,
    //    удалить из него четные числа (в языке уже есть что-то готовое для этого)

    public static void oddNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> odd = new ArrayList<>();
        for (Integer n : numbers) {
            if (n % 2 != 0)
                odd.add(n);
        }
        System.out.println(odd);
    }

    //    Task 2.Задан целочисленный список ArrayList.
    //    Найти минимальное, максимальное и среднее арифметическое из этого списка.

    public static void arithmeticNumber(ArrayList<Integer> numbers){
        int sum = 0;
        int max = 0;
        int min = numbers.size();
        for (int num : numbers) {
            sum = sum + num;
            if (max <= num)
                max = num;
            if (min >= num)
                min = num;
        }
        sum = sum / numbers.size();
        System.out.println("Среднее арифметическое число: " + sum);
        System.out.println();
        System.out.println("Максимальное число: " + max);
        System.out.println();
        System.out.println("Минимальное число: " + min);
    }
}