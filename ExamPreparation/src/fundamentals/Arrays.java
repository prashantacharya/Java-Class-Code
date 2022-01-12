package fundamentals;

public class Arrays {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println("Array before sorting: ");
        for (int item : arr) {
            System.out.println(item);
        }

        int[] sortedArray = sort(arr);
        System.out.println("Array before sorting: ");
        for (int item : sortedArray) {
            System.out.println(item);
        }
    }
}
