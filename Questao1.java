package academiacapgemini;
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
       
        Scanner dados = new Scanner(System.in);
        
        System.out.print("Informe o valor de N: ");
        int n = dados.nextInt();
        
        int repetidor = n;
        String asterisco = "*";
        String espacamento = " ";

        
        for (int i = 0; i <= n; i++) {
            System.out.print(espacamento.repeat(repetidor));
            System.out.print(asterisco.repeat(i));
            System.out.println();
            repetidor--;
        }
    }
}
