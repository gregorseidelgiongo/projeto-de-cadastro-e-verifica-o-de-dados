package conta;

import java.util.Scanner;

public class Acount
{
	String nome, senha;
	int cpf;
	float dinheiro;
	Scanner scanner = new Scanner(System.in);
	
	public void saldo() 
	{
		System.out.println(dinheiro);
	}
	
	
	public boolean saque(double quantia) 
	{
		if(quantia > dinheiro) 
		{
			System.out.println("saque negado");
			return false;
		}else 
		{
			this.dinheiro -= quantia;
			return true;
		}
	}
	
	
	public void deposito(double quantia) 
	{
		this.dinheiro += quantia;
	}
	
	public void cadastro()
	{
		
		System.out.println("digite seu nome: \n");
		nome = scanner.nextLine();
		System.out.println("digite sua senha: \n");
		senha = scanner.nextLine();
		System.out.println("digite seu cpf: \n");
		cpf = scanner.nextInt();
		System.out.println("digite o valor do seu primeiro deposito: \n");
		dinheiro = scanner.nextFloat();
		login(nome, senha, cpf);
	}
	
	public void login(String titular, String senha_ch, int cpf_ch) 
	{
		
		boolean acesso = false;
		
		while(acesso == false) 
		{
			
			if(titular == nome) 
			{
				if(cpf_ch == cpf) 
				{
					if(senha_ch == senha) 
					{
						System.out.println("acesso permitido");
						acesso = true;
						menu();
					}else 
					{
						System.out.println("acesso acesso negado");
					}
				}else 
				{
					System.out.println("acesso acesso negado");
				}
			}
		}
	}
	
	public void menu() 
	{
		int caso = 0;
		double quantia;
		System.out.println("para acessar o saldo digite 1 \n para saque digite 2 \n para deposito digite 3 \n digite 4 para encerar");
		caso = scanner.nextInt();
		switch(caso) 
		{
			case 1:
				saldo();
				menu();
				break;
			case 2:
				System.out.println("digite o valor do saque: ");
				quantia = scanner.nextDouble();
				saque(quantia);
				menu();
				break;
			case 3:
				System.out.println("digite o valor do deposito: ");
				quantia = scanner.nextDouble();
				deposito(quantia);
				menu();
				break;
			case 4:
				System.out.println("obrigado");
				break;
			default:
				menu();
		}
	}
}
