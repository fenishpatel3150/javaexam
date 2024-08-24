public class pattern {

        public static void main(String[] args) {
            int a = 4;

            for (int i = 1; i <= a; i++)
            {
                for (int j = a; j > i; j--)
                {
                    System.out.print(" ");
                }
                for (int b = 1; b <= i; b++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
