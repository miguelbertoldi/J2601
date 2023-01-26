package exerc;

import java.util.Scanner;

public class exdata {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia, mes, ano;
		
		System.out.println("Digite o dia: ");
		dia = ler.nextInt();
		System.out.println("Digite o mês: ");
		mes = ler.nextInt();
		System.out.println("Digite o ano: ");
		ano = ler.nextInt();
		
		if(dia>31 | dia<1 | mes>12 | mes<1 | mes==2 & dia>29 | mes==4 | mes==6 | mes==9 | mes==11 & dia>30) {
			System.out.println("Data inválida!");
		}else {		
		resultado(dia, mes, ano);
		}
	}
	
	static void resultado(int dia, int mes, int ano) {
		String mesE="";
		
		switch(mes) {
		case 1:
			mesE="Janeiro";
			break;
		case 2:
			mesE="Fevereiro";
			break;
		case 3:
			mesE="Março";
			break;
		case 4:
			mesE="Abril";
			break;
		case 5:
			mesE="Maio";
			break;
		case 6:
			mesE="Junho";
			break;
		case 7:
			mesE="Julho";
			break;
		case 8:
			mesE="Agosto";
			break;
		case 9:
			mesE="Setembro";
			break;
		case 10:
			mesE="Outubro";
			break;
		case 11:
			mesE="Novembro";
			break;
		case 12:
			mesE="Dezembro";
			break;
		}
		
		System.out.println("Data: " +dia +"/" +mes +"/" +ano +"\nExtenso: " +dia +" de " +mesE +" de " +ano);
	}
}
