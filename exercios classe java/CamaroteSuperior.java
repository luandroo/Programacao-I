public class CamaroteSuperior extends IngressoVip{
 private double valorAdic;
 private double  valortotal;
  public double getValorAdico(){
  	return valorAdic;
  }
  public void setValorAdico(double i){
  	this.valorAdic =i;
  }
  public double MostrarValor(){	
  	valortotal=vlrIngressoVip()+this.valorAdic;
  	return this.valortotal;
  }	
}