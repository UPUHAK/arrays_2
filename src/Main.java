public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // task 1
        System.out.println("task 1");

        int[] expenses = {25_000, 15_000, 10_000, 20_000, 5_000};
        int sumMonthExpenses = 0;

        for (int current : expenses) {
            sumMonthExpenses += current;
        }

        System.out.println("Сумма трат за месяц составила " + sumMonthExpenses + " рублей.");


        // task 2
        System.out.println("task 2");

        int minExpenses = sumMonthExpenses;
        int maxExpenses = 0;

        for (int current : expenses) {
            if (current < minExpenses) {
                minExpenses = current;
            }
        }

        for (int current : expenses) {
            if (current > maxExpenses) {
                maxExpenses = current;
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей." +
                " Максимальная сумма трат за неделю составила " + maxExpenses + " рублей.");


        // task 3
        System.out.println("task 3");

        double averageExpenses = (double) sumMonthExpenses / expenses.length;

        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");


        // task 4
        System.out.println("task 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}