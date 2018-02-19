import java.util.Scanner;

public class HolaMundo {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int n = Integer.parseInt(entrada.nextLine());
      for (int i = 0; i < n; i++) {
         System.out.println("Hola mundo.");
      }
   }
}