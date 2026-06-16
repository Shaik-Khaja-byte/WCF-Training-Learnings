import java.util.Scanner;

public class Day1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        int num = sc.nextInt();

        int sum = 0;

        while(num > 0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }

        System.out.print("Output : " + sum);
        sc.close();
    }
}
