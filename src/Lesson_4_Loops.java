import java.util.Scanner;

class Lesson_4_Loops {
    public static void main(String[] args) {


//        1. При помощи цикла for вывести на экран нечетные числа от 1 до
//        99. При решении используйте операцию инкремента (++).
//        2. Необходимо вывести на экран числа от 5 до 1.
//        При решении используйте операцию декремента (--).
//        3. Напишите программу, где пользователь вводит любое
//        целое положительное число. А программа суммирует все
//        числа от 1 до введенного пользователем числа.
//        Для ввода числа воспользуйтесь классом Scanner.
//        4. Необходимо, чтоб программа выводила на экран вот
//        такую последовательность:
//        7 14 21 28 35 42 49 56 63 70 77 84 91 98.
//        В решении используйте цикл while. TeachMeSkills.by
//        5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
//        6. Составьте программу, выводящую на экран квадраты чисел от 10 до
//        20 включительно.


        getDigits1To99();
        getDigits5To1();
        sumDigits();
        getSequence();
        getNegativeSequence();
        getSequenceInPow2();

    }


    //1) Method for output only uneven numbers from 1 till 99
    public static void getDigits1To99() {
        System.out.println("\n" + 1 + ") " + "********************************" + "\n");

        for (int i = 1; i < 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }


    //2) Method for output numbers from 5 till 1
    public static void getDigits5To1() {
        System.out.println("\n" + 2 + ") " + "********************************" + "\n");

        for (int i = 5; i > 1; i--) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }


    //3) Method for calculation summarize digits from 1 till specified digit.
    public static void sumDigits() {
        System.out.println("\n" + 3 + ") " + "********************************" + "\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any positive integer number: ");
        int numb = scan.nextInt();
        int sum = 0;

        for (int i = 1; i < numb; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        scan.close();
    }


    //    4) Method for output sequence 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
    public static void getSequence() {
        System.out.println("\n" + 4 + ") " + "********************************" + "\n");

        int numb = 7;
        while (numb <= 98) {
            System.out.print((numb == 98) ? (numb + "\n") : (numb + " "));
            numb += 7;
        }
    }


    //    5) Method for output 10 first digits of such sequence  0, -5,-10,-15...
    public static void getNegativeSequence() {
        System.out.println("\n" + 5 + ") " + "********************************" + "\n");

        int numb = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print((i == 10) ? ((numb -= 5) + "\n") : ((numb -= 5) + ", "));
            numb -= 5;
        }
    }


    //    6) Method for output exponent of two for digits from 10 to 20 inclusive
    public static void getSequenceInPow2() {
        System.out.println("\n" + 6 + ") " + "********************************" + "\n");
        int numb = 10;
        for (int i = 0; i <= 10; i++) {
            System.out.print((int) Math.pow((numb++), 2) + "\t");
        }
    }


}
