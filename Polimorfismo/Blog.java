import java.util.*;
import javax.swing.*;
public class Blog{
	List <Posts> posts = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	News noticia = new News();
	ProductReview produto = new ProductReview();
	int numero = 1;
	
	public void showAll(){
		Iterator<Posts> i = posts.iterator();
		while(i.hasNext()){
			Posts p1 = i.next();
			p1.show();
		}
	}
	
	public void readData(Posts p){
		if(p instanceof News){
			News n = (News)p;
			System.out.println("\n\t\tPOST DE NOTICIA");
			System.out.println("Indice: " + this.numero);
			p.Data();
			System.out.println("Data: "+ p.getDate());
			p.indice = this.numero;
			this.numero++;
			System.out.println("Titulo do post: ");
			String titulo = scan.next();
			p.setTitle(titulo);
			System.out.println("Conteudo: ");
			String conteudo = scan.next();
			p.setContent(conteudo);
			System.out.println("Fonte: ");
			String fonte = scan.next();
			n.setSource(fonte);
			posts.add(p);
		}
		else if(p instanceof ProductReview){
			ProductReview f = (ProductReview)p;
			System.out.println("\n\t\tRESENHA DE PRODUTO");
			System.out.println("Indice: " + this.numero);
			p.Data();
			System.out.println("Data: "+ p.getDate());
			p.indice = this.numero;
			this.numero++;
			System.out.println("Marca do produto: ");
			String marca = scan.next();
			f.setBrand(marca);
			System.out.println("Titulo do post: ");
			String titulo = scan.next();
			p.setTitle(titulo);
			System.out.println("Conteudo: ");
			String conteudo = scan.next();
			p.setContent(conteudo);
			System.out.println("Numero de estrelas: ");
			int estrelas = scan.nextInt();
			f.evaluate(estrelas);
			posts.add(p);
		}
		else if(p instanceof Posts){
			System.out.println("\n\t\tPOST SOBRE OUTRO ASSUNTO");
			System.out.println("Indice: " + this.numero);
			p.Data();
			System.out.println("Data: "+ p.getDate());
			p.indice = this.numero;
			this.numero++;
			System.out.println("Titulo do post: ");
			String titulo = scan.next();
			p.setTitle(titulo);
			System.out.println("Conteudo: ");
			String conteudo = scan.next();
			p.setContent(conteudo);
			posts.add(p);
		}
		
	}
}