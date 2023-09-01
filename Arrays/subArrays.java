public class subArrays {
    public static void printSubArrays(int[] numbers) {
        int totalCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");// subarray

                }
                totalCount++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("TotalCount is " + totalCount);
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        printSubArrays(numbers);
    }

}
