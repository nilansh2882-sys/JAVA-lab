// Name: Nilansh Gupta | Roll Number: BCS2025416 | Assignment: 8, Question: 3

class Main {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < m.length; i++) {
            int sum = 0;

            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }

            System.out.println("Row " + (i + 1) + " sum: " + sum);
        }
    }
}