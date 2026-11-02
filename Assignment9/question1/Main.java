// Name: Nilansh Gupta | Roll Number: BCS2025416 | Assignment: 9, Question: 1

class Main {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.print("First row: ");
        for (int j = 0; j < m[0].length; j++) {
            System.out.print(m[0][j] + " ");
        }

        System.out.println();

        System.out.print("Last row: ");
        int last = m.length - 1;

        for (int j = 0; j < m[last].length; j++) {
            System.out.print(m[last][j] + " ");
        }

        System.out.println();
    }
}