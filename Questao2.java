import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//Declaração das variaveis
		
				String senha;
				int qtC;
						
				//Para ler a entrada de dados
				Scanner leia = new Scanner(System.in);
						
				//Lógica
				System.out.println("Digite sua senha: ");
				senha = leia.next();
				
				String regex = "^(?=.*[0-9])"
		                + "(?=.*[a-z])(?=.*[A-Z])"
		                + "(?=.*[!@#$%^&*()-+])"
		                + "(?=\\S+$).{6}$";
				
				//Combinar a senha fornecida com o regex
				Pattern p = Pattern.compile(regex);
				Matcher m = p.matcher(senha);
				
				
				//Verifica a quantidade de caracteres da senha
				if(senha.length()<6) {
					   qtC = 6 - senha.length();
					   System.out.println("Deve ser adicionados " + qtC + " caracters para a senha ser segura");
				   }
				
			}

	}


