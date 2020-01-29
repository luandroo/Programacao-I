import java.util.*;
import java.text.*;
public class Posts{
	public int indice = 0;
	private String title;
	private String content;
	private String date;
	private int likes;
	private int dislikes;
	
	public String getTitle(){
		return this.title;
	}
	public String getContent(){
		return this.content;
	}
	public String getDate(){
		return this.date;
	}
	public int getLikes(){
		return this.likes;
	}
	public int getDislikes(){
		return this.dislikes;
	}
	public void setTitle(String titulo){
		this.title = titulo;
	}
	public void setContent(String conteudo){
		this.content = conteudo;
	}
	public void setLikes(int li){
		this.likes = this.likes + li;
	}
	public void setDislikes(int dis){
		this.dislikes = this.dislikes + dis;
	}
	public void Data(){
		Date data = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyy");
		this.date = formatar.format(data);
	}
	
	public void show(){
		System.out.println("\n\n");
		System.out.println("Indice: " + this.indice);
		System.out.println("Titulo: " + this.title);
		System.out.println("Data: " + this.date);
		System.out.println("Conteudo: " + this.content);
		System.out.println("Likes: "+ this.likes + "\nDislikes: "+ this.dislikes);
	}
	
	public void like(){
		this.setLikes(1);
	}
	
	public void dislike(){
		this.setDislikes(1);
	}
}