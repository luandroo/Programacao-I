import java.util.Scanner;
 public class IngressoNormal extends Ingresso{
  private int quantidade;
  private double desconto;
  private double total;
  public int setQuantidade(){
    return quantidade;
  }
  public void getQuantidade(int i){
    this.quantidade =i;
    }
  public int quantidade(double quantidade){// depois que ele dar o contrato ele ja vai dar o desconto altomadico
      if(quantidade>=5 && quantidade <=10){
        desconto =0.05;
        total=this.Mostrarvalor()-(this.Mostrarvalor()*desconto);
        total*=quantidade;
        System.out.println("Total ja com desconto 5% R$:"+total);

      }else if(quantidade>=11 && quantidade<=15){
        desconto =0.1;
        total=this.Mostrarvalor()-(this.Mostrarvalor()*desconto);
        total*=quantidade;
        System.out.println("Total ja com desconto 10% R$:"+total);
      }else if(quantidade >15){
        desconto =0.15;
        total=this.Mostrarvalor()-(this.Mostrarvalor()*desconto);
        total*=quantidade;
        System.out.println("Total ja com desconto de 15% R$:"+total);
      }else{ 
        total=this.Mostrarvalor()*quantidade;
        System.out.println("Não tera desconto R$:"+total);
      }
      return 0;
    }
  public void CalcValor(){
    desconto=this.Mostrarvalor()-(this.Mostrarvalor()*desconto);
    System.out.println("O valor de cada ingresso é R$:"+desconto+"\nAntes do desconto era  R$: "+this.Mostrarvalor());
  }
}
 