import java.util.Arrays;
import java.util.Scanner;

public class ConstanteDeKaprekar {
   public static void main(String[] args) {
      
      Scanner entrada = new Scanner(System.in);
      // La primera línea indica el número de casos
      Integer numeroCasos = Integer.parseInt(entrada.nextLine());
      
      while (numeroCasos != 0) {
         String str1;
         String str2;
         
         // Los numeros a tratar están a partir de la segunda línea
         str1 = entrada.nextLine();
         
         Integer n;
         
         for (n = 0; ! str1.equals("6174"); n++) {
            // Rellenamos con ceros si es necesario
            while (str1.length() != 4) {
               str1 = new StringBuffer(str1).insert(0, "0").toString();
            }
            
            char[] arrayTemporal = str1.toCharArray();
            Arrays.sort(arrayTemporal);
            str1 = String.valueOf(arrayTemporal);
            str2 = str1;
            
            str2 = invertirCadena(str2);
            
            Integer diferencia = Integer.parseInt(str2) - Integer.parseInt(str1);
            // Comprobamos que no sea un número "repdigits", en cuyo caso la diferencia sería cero
            if (diferencia == 0) {
               n = 8;
               break;
            }
            // Copiamos la cadena para repetir el proceso
            str1 = Integer.toString(diferencia);
         }
         System.out.println(n);
         numeroCasos--;
      }
      
      
   }
   
   private static String invertirCadena(String cadena) {
      String cadenaInvertida = "";
      
      // Recorremos la cadena y la vamos guardando en cadenaInvertida
      for (int i = cadena.length() - 1; i >= 0; i--) {
         cadenaInvertida += cadena.charAt(i);
      }
      return cadenaInvertida;
   }
}
