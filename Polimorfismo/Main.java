//Luandro Marcos Inseschi
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main{
	public static void main(String []args){
		Scanner scan =new Scanner(System.in);
		int opc;
		Blog b =new Blog();
	
	do{
		String opcoes = JOptionPane.showInputDialog("BEM-VINDO AO BLOG\n O QUE DESEJA FAZER? \n1 - Novo post de noticia \n2 - Nova resenha de produto \n3 - Novo post de outros assuntos \n4 - Listar todas as postagens \n5 - Curtir uma postagem \n6 - Nao curtir uma postagem \n10 - Sair ");
		opc = Integer.parseInt(opcoes);
		switch(opc){
		case 1:
			News noticia = new News();
			b.readData(noticia);
			break;
		case 2:
			ProductReview produto = new ProductReview();
			b.readData(produto);
			break;
		case 3:
			Posts post = new Posts();
			b.readData(post);
			break;
		case 4:
			b.showAll();
			break;
		case 5:
			System.out.println("\n Informe o indice do post que desaja dar like");
			int k = scan.nextInt() - 1;
			Posts p1 = b.posts.get(k);
			p1.like();
			break;
			case 6:
			System.out.println("\n Informe o indice do post em que deseja dar dislike");
			int y = scan.nextInt() - 1;
			Posts p = b.posts.get(y);
			p.dislike();
			break;
		}
	}while(opc!=10);	

	}	
}
