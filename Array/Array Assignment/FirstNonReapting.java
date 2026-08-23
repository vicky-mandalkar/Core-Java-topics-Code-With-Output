//Write a Java program to find the first non-repeating element in an array.
class FirstNonReapting{

    static void firstNonRepeating(int arr[]) {

        int count;

        for (int i = 0; i < arr.length; i++) {

            count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First Non-Repeating Element = " + arr[i]);
                return;
            }
        }

        System.out.println("No Non-Repeating Element Found");
    }

    public static void main(String[] args) {

        int arr[] = {4, 5, 1, 2, 0, 4, 1, 2};

        firstNonRepeating(arr);
    }
}