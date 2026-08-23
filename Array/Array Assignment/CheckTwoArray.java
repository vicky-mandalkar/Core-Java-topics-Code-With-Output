class CheckTwoArray {

    static String CheckEqual(int arr1[], int arr2[]) {

        // Check length
        if (arr1.length != arr2.length) {
            return "Both arrays are not equal";
        }

        // Compare element by element
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] != arr2[i]) {
                return "Both arrays are not equal";
            }
        }

        return "Both arrays are equal";
    }

    public static void main(String ar[]) {

        int arr1[] = {1, 2, 3, 4, 1, 23, 3};
        int arr2[] = {1, 2, 3, 4, 1, 23, 3};

        System.out.println(CheckEqual(arr1, arr2));
    }
}