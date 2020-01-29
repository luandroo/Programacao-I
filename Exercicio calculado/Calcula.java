//Nome do aluno: Luandro Marcos Inseschi
import java.util.Scanner;
class Calcula{
	double valor, valorjuros, prestacao, valorpres,
	juro, valortotal, valorent,desc, valordesc;
	int numprest;
	Scanner ler = new Scanner(System.in);
	void valorcompra(double valor, double juros){
		System.out.println("Quantidade de Prestações");
		numprest = ler.nextInt();
		valorpres = valor / numprest;
		valorjuros = (valor * juros) / 100;
		double tudojunto = valorjuros / numprest;
		System.out.println("\nTotal de Juros R$ " + valorjuros);
		System.out.println("Valor das Prestações R$ " + (valorpres + tudojunto));
		System.out.println("Valor total da operação R$ " + (valor + valorjuros) + "\n");
	}
	void entrada(double valorent){
		System.out.println("Desconto");
		desc = ler.nextDouble();
		valordesc = (valorent * desc) / 100;
		this.valorent = valorent - valordesc;
		System.out.println("Valor Desconto R$ " + valordesc);
		System.out.println("\nValor da parcela com Desconto R$ " + this.valorent + "\n");
	}
	void pagatraso(double valor){
		System.out.println("% de juros");
		juro = ler.nextDouble();
		double valorjuro = (valor * juro) / 100;
		double valormulta = valor * 0.02;
		this.valor = valor + valorjuro + valormulta;
		System.out.println("Juros R$ " + valorjuro);
		System.out.println("Multa R$ " + valormulta);
		System.out.println("Total a ser Pago R$ " + this.valor + "\n");
	}
}
