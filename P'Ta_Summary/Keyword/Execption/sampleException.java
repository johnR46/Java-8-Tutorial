import java.util.InputMismatchException;
import java.util.Scanner;

class sampleException {
    public static void main(String[] args) {

        /*
         * Scanner in = new Scanner(System.in); System.out.print("Enter Number :");
         * 
         * try { int r = in.nextInt();
         * 
         * } catch (InputMismatchException e) { System.out.println("เกิด Exception !");
         * } finally { System.out.println("Finally"); } System.out.println("จบ ! ");
         */

        Scanner in = new Scanner(System.in);
        Exception exc = new Exception("error !");
        System.out.print("Enter Number :");
        int x;
        try {
            x = in.nextInt();
            if (x < 0) {
                throw exc;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}