
package exercicio01;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Exercicio01{

    
    public static void main(String[] args) {
        int op = 0;
        ArrayList<String> nomes = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("\n( 1 ) - Cadastrar Nome");
            System.out.println("\n( 2 ) - Consultar Nomes");
        
            op = scanner.nextInt();
            
            switch (op){

                case 1:
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    try{
                        String nome = br.readLine().trim();
                        nomes.add(nome);
                        System.out.println("Nome gravado");

                        }catch (Exception ex){
                        }
                    break;

                case 2:
                    System.out.println("Nomes: \n");
                    Iterator it = nomes.iterator();
                    while (it.hasNext()) {
                        System.out.println(it.next());
        }
                    break;
            }
       
        }
       
        
    }
    
}
