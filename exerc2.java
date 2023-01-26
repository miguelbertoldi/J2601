package exerc;

import java.util.Scanner;

public class exerc2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double ultimoValor=0;
		int diasAtraso, contadorPrestacoes=0;
		boolean encerrar=false;
		
		for(double valorPrestacao=1; valorPrestacao!=0;valorPrestacao=valorPrestacao) {	
		System.out.println("Digite o valor da prestação: ");
		valorPrestacao = ler.nextInt();
		
		if(valorPrestacao!=0) {			
			ultimoValor=valorPrestacao;
			System.out.println("Digite a quantidade de dias de atraso: ");
			diasAtraso = ler.nextInt();
		
			valorPagamento(valorPrestacao, diasAtraso, encerrar, contadorPrestacoes);
		}else {
			encerrar=true;
			valorPagamento(ultimoValor, diasAtraso=0, encerrar, contadorPrestacoes);
		}
	}
	}
	
	static void valorPagamento(double valorPrestacao,double  diasAtraso, boolean encerrar, int contadorPrestacoes) {
		double valorFinal, valorPrestacao2, extra=0;
		
		valorPrestacao2=valorPrestacao;
			for(int i=0; i<diasAtraso; i++) {
				extra+=(valorPrestacao2*0.001)+(valorPrestacao2*0.03);
				valorPrestacao2+=extra;
			}
			valorFinal=valorPrestacao+extra;
			if(encerrar==false) {				
				System.out.println("\nValor a ser pago: R$" +valorFinal +"\nAtraso: " +diasAtraso +" dia(s)\n\n");
			}
			
			guardar(valorFinal, encerrar, contadorPrestacoes);
		}
	
	static void guardar(double valorFinal, boolean encerrar, int contadorPrestacoes) {
		
		contadorPrestacoes++;
		valorFinal+=valorFinal;
		
		if(encerrar==true) {
			System.out.println("Valor total do dia: " +valorFinal +"\nTotal de prestações pagas: " +contadorPrestacoes);
		}
		
		
	}
	
}

	

