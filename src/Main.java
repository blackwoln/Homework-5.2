public class Main {
    public static void main(String[] args) {
        task1();// Задача 1
        task2();// Задача 2
        task3();// Задача 3
        task4();// Задача 4
        task5();// Задача 5
        task6();// Задача 6
        task7();// Задача 7
        task8();// Задача 8
    }

    public static void task1 () {
        System.out.println("Задача 1");
        /*
        Задача 1
        Продолжите работать с кодом, который вы написали в предыдущем уроке — в задачах с накоплениями.

        С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей
        при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.

        Результат программы должен быть выведен в консоль с тем количеством месяцев, которое необходимо
        для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей».
         */
        int accumulation = 15000;
        int i = 0;
        int total = 0;
        while ( total <= 2_459_000 ) {
            i++;
            total = total + total/100;
            total = total + accumulation;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }

    public static void task2 () {
        System.out.println("Задача 2");
        /*
        Задача 2
        Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        Не забудьте выполнить переход на новую строку между двумя циклами.
        В результате программы вывод должен получиться следующий:
        1 2 3 4 5 6 7 8 9 10
        10 9 8 7 6 5 4 3 2 1
         */
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i+ " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        /*
        Задача 3
        В стране Y население равно 12 миллионов человек.
        Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
        Рассчитайте, какая численность населения будет через 10 лет, если показатели
        рождаемости и смертности постоянны.
        В консоль выведите результат операции на каждый год в формате:
        «Год …, численность населения составляет …».
         */
        int population = 12_000_000;
        double brithRate = 0.017;// Рождаемость на 1000
        double deathRate = 0.008;// Смертность на 100

        for (int i = 1; i <= 10; i++) {
            int britYear = (int) (population * brithRate);
            int deathYear = (int) (population * deathRate);
            int delta = britYear - deathYear;
            population += delta;

            System.out.println("Год " + i + " , численность населения составляет " + population);
        }



    }

    public static void task4 () {

    }

    public static void task5 () {

    }

    public static void task6 () {

    }

    public static void task7 () {

    }

    public static void task8 () {
    }

}