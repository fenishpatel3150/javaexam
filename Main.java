import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num[] = {1,6,3,10,15};
        int largest=num[0];
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        for(int i=1;i<num.length;i++)
        {
            if(num[i]>largest)
            {
                largest=num[i];
                System.out.println(largest);
            }
        }

    }
}
