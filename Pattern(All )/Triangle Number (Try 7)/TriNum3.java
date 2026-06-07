class TriNum3 {
    public static void main(String args[]) {

        int n = 5;
	int cnt=1;

        for (int i = 1; i <= n; i++) {

	int c=cnt;
            for (int j = i; j >= 1; j--) {
                System.out.print(c+ "\t");
                c--;   // decrease value
            }
	cnt=cnt+(i+1);
            System.out.println();
        }
    }
}
/*
1
3       2
6       5       4
10      9       8       7
15      14      13      12      11

*/