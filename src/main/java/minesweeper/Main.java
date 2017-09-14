package minesweeper;

/**
 * Created by insomnia on 14.09.17.
 */
public class Main {

    public static void main(String[] args) {

            int M = 3;
            int N = 12;
            double p = 0.5;

            // game grid is [1..m][1..n], border is used to handle boundary cases
            boolean[][] mines = new boolean[M + 2][N + 2];
            for (int i = 1; i <= M; i++)
                for (int j = 1; j <= N; j++)
                    mines[i][j] = (Math.random() < p);

            // print game
            for (int i = 1; i <= M; i++) {
                for (int j = 1; j <= N; j++)
                    if (mines[i][j]) System.out.print("* ");
                    else System.out.print(". ");
                System.out.println();
            }

            // sol[i][j] = # bombs adjacent to cell (i, j)
            int[][] sol = new int[N + 2][N + 2];
            for (int i = 1; i <= M; i++)
                for (int j = 1; j <= N; j++)
                    // (ii, jj) indexes neighboring cells
                    for (int ii = i - 1; ii <= i + 1; ii++)
                        for (int jj = j - 1; jj <= j + 1; jj++)
                            if (mines[ii][jj]) sol[i][j]++;

            // print solution
            System.out.println();
            for (int i = 1; i <= M; i++) {
                for (int j = 1; j <= N; j++) {
                    if (mines[i][j]) System.out.print("* ");
                    else System.out.print(sol[i][j] + " ");
                }
                System.out.println();
            }

        }


    }


