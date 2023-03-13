import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.junit.validator.ValidateWith;
class Main {
  public static String gerando_valores(int tamanho){
    ArrayList lista = new ArrayList <Integer> ();
    Random gerador = new Random();
    for (int i=0;i<tamanho;i++){
      lista.add(gerador.nextInt(10));  
    }
    
  }
     
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Digite um número:");
    int tamanho = scanner.nextInt();
    var b=gerando_valores(tamanho);
    for (var valores : b ){
      if (valores % 2 == 0) {
        System.out.println(valores+"é um número par.");
      }
      else if (valores % 2 ==1){
        System.out.println(valores+"é um número impar.");  
      }
      else if (valores % 3 == 0){
        System.out.println(valores+"esse número é mútiplo de 3.");  
      }
    }
    
  }
}
    
 