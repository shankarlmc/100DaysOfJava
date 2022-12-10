class DaphneArray {

    public static int isDaphneArray(int[] arr) {

        int countEvenNumbers = 0;
        int countOddNumbers = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEvenNumbers = countEvenNumbers + 1;
            } else {
                countOddNumbers = countOddNumbers + 1;
            }
        }

        if (countEvenNumbers == arr.length) {
            return 0;
        } else if (countOddNumbers == arr.length) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        // int[] arr = { 2, 4, 6, 8, 10 };
        // int[] arr = { 3, 5, 7 };
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(isDaphneArray(arr));
    }
}