public class IngressoVip extends Ingresso{
    private double valorAdicional;
    private double total;

  public double getValorAdiconal(){
    return valorAdicional;
  }
  public void setValorAdiconal(double n){
    this.valorAdicional= n;
  }
  public double vlrIngressoVip(){
    total=this.valorAdicional+Mostrarvalor();
    return total;
  }
}

