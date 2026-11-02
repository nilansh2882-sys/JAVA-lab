// Name: Nilansh Gupta | Roll Number: BCS2025416 | Assignment: 8, Question: 1

class Main {
    public static void main(String[] args) {
        int[][] m = new int[3][4];
        int value = 1;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = value++;
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}