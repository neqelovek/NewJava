public class Les2 {
    public static void main(String[] args) {

        isPalindrome("шалаш");
        System.out.println();
        isPalindrome("abcdedcba");
        System.out.println();
        isPalindrome("GeekBrains");

    }

    //    Task 1: Напишите метод, который принимает на вход строку (String) и
    //    определяет является ли строка палиндромом (возвращает boolean значение).
    //    шалаш
    //    abcdedcba

    public static void isPalindrome(String string) {
        StringBuilder reversStr = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; --i)
            reversStr.append(string.charAt(i));
        System.out.println(string.equals(reversStr.toString()));
    }
}

