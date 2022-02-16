package academiacapgemini;
import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {
    
    public static void main(String[] args) {
    
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe a palavra: ");
        String converter = dados.next();
        String palavra = converter.toLowerCase();
        
        String[] array = new String [256];
        int contador = 0;
        int anagramas = 0;
        
        for (int i = 0; i < palavra.length(); i++){
            for (int j = i; j < palavra.length(); j++){
                char[] c = palavra.substring(i, j + 1).toCharArray();
                Arrays.sort(c);
                array[contador] = String.valueOf(c);
                contador++;
            }
        }
        
        for (int i = 0; i < contador; i++) {
            for (int j = i; j < contador; j++) {
		if (array[i].equals(array[j + 1])) {
                    anagramas++;
		}
            }
	}
	System.out.println(anagramas);
        
    }
}
