package conta;

import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args) 
	{
		int checar, cpf;
		String titular, senha;
		Scanner sc = new Scanner(System.in);
		Acount conta = new Acount();
		System.out.println("você já tem um cadastro? digite 1 para sim e 2 para não\n");
		checar = sc.nextInt();
		if(checar == 2) 
		{
			conta.cadastro();
			checar = 1;
		}else 
		{
			System.out.println("digite seu nome: ");
			titular = sc.nextLine();
			System.out.println("digite seu cpf: ");
			cpf = sc.nextInt();
			System.out.println("digite sua senha: ");
			senha = sc.nextLine();
			conta.login(titular, senha, cpf);
		}
	}
	
}
