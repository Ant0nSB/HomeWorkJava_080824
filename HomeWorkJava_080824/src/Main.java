public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5}; // Пример массива 1
        int missingNumber1 = findMissingNumber(arr1);
        System.out.println("Недостающий элемент: " + missingNumber1);

        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5}; // Пример массива 2
        int missingNumber2 = findMissingNumber(arr2);
        System.out.println("Недостающий элемент: " + missingNumber2);
    }

    // Метод для нахождения недостающего элемента
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Размер полного массива
        int totalSum = n * (n + 1) / 2; // Сумма всех чисел от 1 до n
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

        return totalSum - arraySum; // Недостающий элемент
    }
}
