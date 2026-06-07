class RanTri6 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = n; i >= 1; i--) {

            int c = i;

            // spaces
            for (int j = n; j > i; j--) {
                System.out.print("\t");
            }

            // numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(c + "\t");
                c = c + (k - 1);
            }

            System.out.println();
        }
    }
}