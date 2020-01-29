public class CamaroteInferior extends IngressoVip{
	private String local = ":Rua Pau Amaral 246";
	private double vlrAdicional;
	private double descontoConsumo;
	private double totalconsumo;

		public String MostraLocal(){
			return this.local;
		}

		public double getDescontoconsmo(){
			return descontoConsumo;
		}
		public void setDescontoconsumo(double l){
			this.descontoConsumo =l;
		}
		public double getTotalconsumo(){
			return totalconsumo;
		}
		public void setTotalconsumo(double t){
			this.totalconsumo=t;
		}
		public double MostrarValorConsumo(){
			double desc;
			desc=(totalconsumo*descontoConsumo)/100;
			totalconsumo=totalconsumo-desc;
			return totalconsumo;
		}	
		
}