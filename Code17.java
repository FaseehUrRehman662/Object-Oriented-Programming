public class Code17 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        int smallest = arr[0];
        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Smallest: " + smallest);
    }
}
