public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Задание 2
        System.out.println("Задание 2");
        for ( int i = 10; i > 0; i--){
            System.out.println(i);
        }

        // Задание 3
        System.out.println("Задание 3");
        for (int i = 2; i < 17; i +=2){
            System.out.println(i);
        }
        // Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }

        // Задание 2.1
        System.out.println("Задание 2.1");
        for (int i = 1904; i <= 2096; i += 4){
            if (i % 4 ==0 && i % 100 !=0 || i % 400 ==0)
            System.out.println(i+ " год является високосным");
        }

        // Задание 2.2
        System.out.println("Задание 2.2");
        for (int i = 7; i<=98; i += 7){
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание 2.3
        System.out.println("Задание 2.3");
        for (int i = 1; i <= 512; i *= 2){
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание 3.1
        System.out.println("Задание 3.1");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + salary;
            System.out.println("Месяц " + i +" сумма накоплений равна " + total + " рублей");
        }

        // Задание 3.2
        System.out.println("Задание 3.2");
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 1; i < 13; i++) {
            total1 = total1 + total1/100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i +" сумма накоплений равна " + total1 + " рублей");
        }
    }
}