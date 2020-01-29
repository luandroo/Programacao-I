//Luandro Marcos Inseschi
import java.util.Scanner;
public class Main{
  public static void main(String[]args){
  	int opc;
    Ingresso ing=new Ingresso();
    IngressoVip vip=new IngressoVip();
    IngressoNormal normal=new IngressoNormal();
    CamaroteInferior ci= new CamaroteInferior();
    CamaroteSuperior cs= new CamaroteSuperior();
    Scanner entrada = new Scanner(System.in);
    do{
    	System.out.println("\t\tOpções");
    	System.out.println("1 - Ingresso Normal");
    	System.out.println("2 - Ingresso Vip");
    	System.out.println("0 - Sair");
    	opc = entrada.nextInt();
        switch(opc)
    	{
            case 1:
            System.out.println("Digite a quantidade de ingreço que vai ser comprada");
            normal.quantidade(entrada.nextDouble());
            normal.CalcValor();
            break;
            case 2:
            System.out.println("Digite o quando vai somar no preco normal do ingresso para virar vip.");
            vip.setValorAdiconal(entrada.nextDouble());
            System.out.println("Valor vip R$:"+vip.vlrIngressoVip());
            do{
               
                System.out.println("\t\tCamarotes");
                System.out.println("1 - Camarote Inferior:");
                System.out.println("2 - Camarote Superiro:");
                System.out.println("4 - Voltar:");
                opc=entrada.nextInt();
                switch(opc){
                    case 1:
                    System.out.println("Digite o Valor Total Consumo:");
                    ci.setTotalconsumo(entrada.nextDouble());
                    System.out.println("Desconto ");
                    ci.setDescontoconsumo(entrada.nextDouble());
                    System.out.println("Local " + ci.MostraLocal());
                    System.out.println("Valor Total sem Desconto R$ " + ci.getTotalconsumo());
                    System.out.println("Valor Total com Desconto R$ " + ci.MostrarValorConsumo());
                    opc=0;
                    break;
                    case 2:
                    System.out.println("Valor Adicional do Camarote Superior fora o dos ingressos:");
                    cs.setValorAdico(entrada.nextDouble());
                    System.out.println("TOTAL R$:" + (cs.MostrarValor()+vip.getValorAdiconal()));
                    opc=0;
                    break; 
                    case 4:
                    break;
                    default:
                        System.out.println("Valor invalido");
                        break;
                }

        }while(opc!=4);
    	opc=1;
        break;
        case 0:
            break;
        default:
            System.out.println("opcao invalido");
            break;
            }
    }while(opc!=0);	
  }
}

