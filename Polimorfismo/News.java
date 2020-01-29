public class News extends Posts{
	private String source;
	public String getSource(){
		return this.source;
	}
	public void setSource(String fonte){
		source=fonte;
	}
	public void show(){
		System.out.println("\n\t\tPost de Noticia");
		super.show();
		System.out.println("Fonte:"+this.getSource());
	}
}