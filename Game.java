import java.util.*;

public class Game {
    public static void main(String[] args) {
        int flag = 1;
        char arr[][] = { { ' ', '|', ' ', '|', ' ' }, { '-', ' ', '-', ' ', '-' }, { ' ', '|', ' ', '|', ' ' },
                { '-', ' ', '-', ' ', '-' }, { ' ', '|', ' ', '|', ' ' } };
        show(arr, flag);
    }

    public static void show(char arr[][], int flag) {
        int win = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        if (flag % 2 != 0) {
            win = Win(arr, win);
            switch (win) {
                case 0:
                    player1(arr, flag);
                    break;
                case 1:
                    System.out.println("Player 'O' won!");
                    break;
            }
        } else if (flag % 2 == 0) {
            win = Win(arr, win);
            switch (win) {
                case 0:
                    player2(arr, flag);
                    break;
                case 1:
                    System.out.println("Player 'X' won!");
                    break;
            }
        }
    }

    public static void player1(char arr[][], int flag) {
        System.out.println("Enter input Player 1");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if (num1 > 0 && num1 < 10) {
            switch (num1) {
                case 1:
                    arr[0][0] = 'X';
                    break;
                case 2:
                    arr[0][2] = 'X';
                    break;
                case 3:
                    arr[0][4] = 'X';
                    break;
                case 4:
                    arr[2][0] = 'X';
                    break;
                case 5:
                    arr[2][2] = 'X';
                    break;
                case 6:
                    arr[2][4] = 'X';
                    break;
                case 7:
                    arr[4][0] = 'X';
                    break;
                case 8:
                    arr[4][2] = 'X';
                    break;
                case 9:
                    arr[4][4] = 'X';
                    break;
            }
            flag++;
            show(arr, flag);
        } else {
            System.out.println("Invalid input!");
        }

        sc.close();
    }

    public static void player2(char arr[][], int flag) {
        System.out.println("Enter input Player 2");
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        if (num2 > 0 && num2 < 10) {
            switch (num2) {
                case 1:
                    arr[0][0] = 'O';
                    break;
                case 2:
                    arr[0][2] = 'O';
                    break;
                case 3:
                    arr[0][4] = 'O';
                    break;
                case 4:
                    arr[2][0] = 'O';
                    break;
                case 5:
                    arr[2][2] = 'O';
                    break;
                case 6:
                    arr[2][4] = 'O';
                    break;
                case 7:
                    arr[4][0] = 'O';
                    break;
                case 8:
                    arr[4][2] = 'O';
                    break;
                case 9:
                    arr[4][4] = 'O';
                    break;
            }
            flag++;

            show(arr, flag);

        } else
            System.out.println("Invalid input!");
        sc.close();
    }

    public static int Win(char arr[][], int win) {
        if (arr[0][0] == 'X' && arr[0][2] == 'X' && arr[0][4] == 'X'
                || arr[2][0] == 'X' && arr[2][2] == 'X' && arr[2][4] == 'X'
                || arr[4][0] == 'X' && arr[4][2] == 'X' && arr[4][4] == 'X'
                || arr[0][0] == 'X' && arr[2][2] == 'X' && arr[4][4] == 'X'
                || arr[0][4] == 'X' && arr[2][2] == 'X' && arr[4][0] == 'X'
                || arr[0][0] == 'X' && arr[2][0] == 'X' && arr[4][0] == 'X'
                || arr[0][2] == 'X' && arr[2][2] == 'X' && arr[4][2] == 'X'
                || arr[0][4] == 'X' && arr[2][4] == 'X' && arr[4][4] == 'X') {
            win++;
            return win;
        } else if (arr[0][0] == 'O' && arr[0][2] == 'O' && arr[0][4] == 'O'
                || arr[2][0] == 'O' && arr[2][2] == 'O' && arr[2][4] == 'O'
                || arr[4][0] == 'O' && arr[4][2] == 'O' && arr[4][4] == 'O'
                || arr[0][0] == 'O' && arr[2][2] == 'O' && arr[4][4] == 'O'
                || arr[0][4] == 'O' && arr[2][2] == 'O' && arr[4][0] == 'O'
                || arr[0][0] == 'O' && arr[2][0] == 'O' && arr[4][0] == 'O'
                || arr[0][2] == 'O' && arr[2][2] == 'O' && arr[4][2] == 'o'
                || arr[0][4] == 'O' && arr[2][4] == 'O' && arr[4][4] == 'O') {
            win++;
            return win;
        } else
            return 0;
    }
}
