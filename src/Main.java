import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int totalnmbr;
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.print("TOTAL NUMBER :  ");
        totalnmbr = scanner.nextInt();
        for (int i = 1; i <= totalnmbr; i++) {
            System.out.print("ENTER " + i + ". NUMBER:  ");
            int number = scanner.nextInt();
            if(number > max){
                max = number;
            }else if(number < min){
                min = number;
            }
        }
        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);
    }
}