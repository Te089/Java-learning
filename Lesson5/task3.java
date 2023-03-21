// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000

public class task3 {
    public static void main(String[] args) {
        queens(8);
    }

    public static void queens(int n) {
        int[] result = queens(new int[n], 0);
        if (result != null) {
            printPosition(result);
        } else {
            System.out.println("Расстановка невозможна");
        }
    }

    public static int[] queens(int[] board, int fixed) {
        int n = board.length;
        if (fixed == n) {
            return board;
        }
        for (int i = 0; i < n; ++i) {
            if (valid(board, fixed, i)) {
                board[fixed] = i;
                int[] result = queens(board, fixed + 1);
                if (result != null)
                    return result;
            }
        }
        return null;
    }

    public static boolean valid(int[] board, int fixed, int pos) {
        for (int i = 0; i < fixed; ++i) {
            if (pos == board[i] || fixed - i == Math.abs(pos - board[i])) {
                return false;
            }
        }
        return true;
    }

    public static void printPosition(int[] pos) {
        int n = pos.length;
        for (int row : pos) {
            for (int i = 0; i < row; ++i)
                System.out.print(" 0");
            System.out.print(" 1");
            for (int i = row + 1; i < n; ++i)
                System.out.print(" 0");
            System.out.println();
        }
    }
}