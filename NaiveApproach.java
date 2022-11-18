import java.util.Arrays;

public class NaiveApproach {
    public static void main(String args[]) {
        int n = 26;
        char[][] mat = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(mat[i], '?');
        }
        for (int i = 0; i < n; i++) {
            char currentLetter = (char) ((char) 'A' + i);
            int row = 0, col = i;
            while (row < n && col >= 0) {
                mat[row][col] = currentLetter;
                row++;
                col--;
            }
        }
        for (int i = 0; i < n; i++) {
            char currentLetter = 'A';
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == '?') {
                    mat[i][j] = currentLetter;
                    currentLetter = (char) ((char) currentLetter + 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
