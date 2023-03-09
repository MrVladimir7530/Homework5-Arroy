public class Array {
    private int[] array = generateRandomArray();
    private final int daysOfMonth = 30;

    private int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[daysOfMonth];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public int sumOfMonth() {
        int sum = 0;
        for (int c : array) {
            sum += c;
        }
        return sum;
    }

    public void task1() {
        System.out.println("Задача 1\nСумма трат за месяц составила " + sumOfMonth() + "рублей\n");
    }

    public void task2() {
        System.out.println("Задача 2");
        int minExpense = array[0];
        int maxExpense = array[0];
        for (int c : array) {
            if (c >= maxExpense) {
                maxExpense = c;
            } else if (c <= minExpense) {
                minExpense = c;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей.\nМаксимальная сумма трат за день составила " + maxExpense + " рублей\n");
    }

    public void task3() {
        System.out.println("Задача 3");
        float middleExpense;
        middleExpense = (float) (sumOfMonth() / daysOfMonth);
        System.out.println("Средняя сумма трат за месяц составила " + middleExpense + " рублей\n");
    }

    public void task4Method1() {
        System.out.println("Задача 4 метод 1");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        ArrayReverse arrayReverse = new ArrayReverse(reverseFullName);
        reverseFullName = arrayReverse.reverse();
        for (char c : reverseFullName) {
            System.out.print(c + " ");
        }
        System.out.println("\n");
    }

    public void task4Method2() {
        System.out.println("Задача 4 метод 2");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i] + " ");
        }
        System.out.println();
    }
}
