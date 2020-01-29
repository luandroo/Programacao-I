import java.util.Scanner;
public class ProductReview extends Posts implements Evaluable{
	private String brand;
	private int stars;
	public String getBrand(){
		return this.brand;
	}
	public void setBrand(String marca){
		this.brand=marca;
	}
	public int getStars(){
		return this.stars;
	}
	public void evaluate(int estrelas){
		this.stars =estrelas;
	}
	@Override
	public void show(){
		System.out.println("\n\t\tRESENHA DE PRODUTO");
			super.show();
			System.out.println("Marca: "+ this.getBrand());
			System.out.println("Estrelas: "+ this.getStars());
	}
}