// Name: Nilansh Gupta | Roll Number: BCS2025416 | Assignment: 7, Question: 3

class Main {
    public static void main(String[] args) {
        int n = 1024;
        int steps = 0;

        // Time Complexity: O(log n)
        while (n > 1) {
            n = n / 2;
            steps++;
        }

        System.out.println("Halving steps: " + steps);
    }
}