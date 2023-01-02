import java.util.ArrayList;

public class Les3 {
    public static void main(String[] args) {

        oddNumbers();

    }

    //     Task 1. Пусть дан произвольный список целых чисел,
    //    удалить из него четные числа (в языке уже есть что-то готовое для этого)

    public static void oddNumbers(){
        int [] numb = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int j : numb) numbers.add(j);

        ArrayList<Integer> odd = new ArrayList<>();
        for (Integer n : numbers) {
            if (n % 2 != 0)
                odd.add(n);
        }
        System.out.println(odd);
    }
}