import java.util.ArrayList;
import java.util.Scanner;

class MazeSolver {
    int row, col;
    int[][] maze;

    public void input(int row, int col) {
        Scanner sc = new Scanner(System.in);
        this.row = row;
        this.col = col;
        maze = new int[row][col];
        System.out.println("Enter maze layout (0 for wall, 1 for path)");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

    boolean findPath(int srow, int scol, int erow, int ecol, ArrayList<int[]> path) {
        if (srow < 0 || scol < 0 || srow >= row || scol >= col) {
            System.out.println("Start Point is out of Array.");
            return false;
        }
        if (maze[srow][scol] == 0) {
            System.out.println("Start Point is a wall.");
            return false;
        }
        if (srow == erow && scol == ecol) {
            path.add(new int[]{srow, scol});
            return true;
        }
        if (maze[srow][scol] == 1) {
            maze[srow][scol] = 0;
            if (findPath(srow, scol - 1, erow, ecol, path) ||
                    findPath(srow - 1, scol, erow, ecol, path) ||
                    findPath(srow, scol + 1, erow, ecol, path) ||
                    findPath(srow + 1, scol, erow, ecol, path)) {
                path.add(new int[]{srow, scol});
                return true;
            }
            maze[srow][scol] = 1;
        }
        return false;
    }

}

class TheMazeProblem {
    public static void main(String[] args) {
        MazeSolver m = new MazeSolver();
        Scanner sc = new Scanner(System.in);
        int row, col, scol, srow, erow, ecol;
        System.out.println("Enter rows:");
        row = sc.nextInt();
        System.out.println("Enter col:");
        col = sc.nextInt();
        m.input(row, col);
        System.out.println("Enter starting position (row column)");
        srow = sc.nextInt();
        scol = sc.nextInt();
        System.out.println("Enter ending position (row column)");
        erow = sc.nextInt();
        ecol = sc.nextInt();
        ArrayList<int[]> path = new ArrayList<>();
        if (m.findPath(srow, scol, erow, ecol, path)) {
            System.out.println("Path found:");
            for (int i = path.size() - 1; i >= 0; i--) {
                int[] pos = path.get(i);
                System.out.println("(" + pos[0] + "," + pos[1] + ")");
            }
        } else {
            System.out.println("Path not found.");
        }
    }
}
