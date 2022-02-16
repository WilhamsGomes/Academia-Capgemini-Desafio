package academiacapgemini;
import java.util.Scanner;

public class Questao2 {
    
    public static void main(String[] args) {
         
        Scanner dados = new Scanner(System.in);
         
        boolean temDigito = false;
         
        System.out.println("Informe sua senha: ");
        String senha = dados.next();
         
        int num = senha.length();
         
        while (senha.length() < 6) {
             System.out.println((6-num));
             System.out.println("Senha pequena. Adicione mais caract");
             String add = dados.next();
             senha = senha+add;
             System.out.println("Nova senha:" +senha);
        }
         
        String[] split = senha.split("");
         
        for (int i=0; i <= split.length; i++ ){
            if (temDigito == false){
                if("1".equals(split[i]) 
                    || "2".equals(split[i])
                    || "3".equals(split[i])
                    || "4".equals(split[i])
                    || "5".equals(split[i])
                    || "6".equals(split[i])
                    || "7".equals(split[i])
                    || "8".equals(split[i])
                    || "9".equals(split[i])
                    || "0".equals(split[i]))
                {
                temDigito = true;
                } 
            }   
        }
        
        while (temDigito == false
                || !senha.matches("(.*)[A-Z](.*)")
                || !senha.matches("(.*)[a-z](.*)") 
                || !senha.matches("(.*)[!@#$%^&*()-+](.*)"))
        {
            System.out.println("Senha não segura. Adicione letra minúscula, maiúscula ou um caracter especial !@#$%^&*()-+ ");
            String add = dados.next();
            senha = senha+add;
            System.out.println("Nova senha:" +senha);
        }
         
        if (temDigito == true 
                 && senha.matches("(.*)[A-Z](.*)") 
                 && senha.matches("(.*)[a-z](.*)") 
                 && senha.matches("(.*)[!@#$%^&*()-+](.*)"))
            {
            System.out.println("Senha segura!");
        }      
 
     }
}
