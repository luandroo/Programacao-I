//Nome aluno :Luandro Marcos Inseschi
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao;
		double valor, juro, total, numprest, valorentrada, valorprest;
		int resp;
		Calcula compra = new Calcula();
		do{
			System.out.printf("\tMENU OPÇÕES\n");
			System.out.printf("1 - Valor com Juros Simples\n");
			System.out.printf("2 - Valor pago com Antecipação\n");
			System.out.printf("3 - Valor pago com Atraso\n");
			System.out.printf("0 - Sair\n");
			opcao = ler.nextInt();
			switch(opcao){
				case 1:
				System.out.println("Digite o valor da compra e depois a quantidade de juros");
				compra.valorcompra(ler.nextDouble(), ler.nextDouble());
				break;
				case 2:
				System.out.println("Valor a pagar com antecipação ");
				compra.entrada(ler.nextDouble());
				break;
				case 3:
				System.out.println("Valor da prestação ");
				compra.pagatraso(ler.nextDouble());
				break;
			}
		} while(opcao != 0);
	}
}
