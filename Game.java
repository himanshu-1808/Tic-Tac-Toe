//import java.util.*;
class Game{
    public static void main(String[] args) {
        char arr[][] ={{' ','|',' ','|',' '},
                        {'-',' ','-',' ','-'},
                        {' ','|',' ','|',' '},
                        {'-',' ','-',' ','-'},
                        {' ','|',' ','|',' '}
                        
        };
        
        show(arr);
    }
    public static void show(char arr[][]){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}