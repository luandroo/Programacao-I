import java.util.Scanner;
  class Exercicio{
    public static void main(String[] args) {
      int vetor1[]=new int[5];
      int vetor2[]=new int[5];
      int vetor3[]=new int[10];
      int i,cont;
      Scanner scanner=new Scanner(System.in);
      System.out.print("Digite o valor do vetor 1\n");//primeiro vetor
      for(i=0 ;i<5; i++){
        vetor1[i]=scanner.nextInt();
        }
      System.out.print("Digite o valor do vetor2\n");// segundo vetor
      for(i=0 ;i<5;i++){
        vetor2[i]=scanner.nextInt();
        }
        System.out.print("O vetor 1 tem.......:");//mostrar 1 vetor
        for(i=0;i<5;i++){
          System.out.print("" +vetor1[i]);
        }
        System.out.print("\nO Vetor 2 tem ......:");//mostrar 2 vetor
        for(i=0;i<5;i++){
          System.out.print("" +vetor2[i]);
        }
        for (i=0;i<5;i++){//colocar o vetor em concatena
          vetor3[i*2]=vetor1[i];
          vetor3[i*2+1]=vetor2[i];
        }
        System.out.print("\nO vetor concatenado.:");//mostrar vetor3
        for (i=0;i<10;i++){
            System.out.print("" +vetor3[i]);
          }
          int tem=0;//para verificar se tem 0 digitado para não colocar ele no fim
        for(i=0;i<10;i++){
          if(vetor3[i]==0)
            tem=1;
        }
        for(i=0;i<10;i++){//trocar os numeros iguais por 0
          for(int j=0;j<10;j++){
            if(vetor3[j]==vetor3[i] &&  i!=j){
                vetor3[j]=0;
            }
          }
        }
        System.out.print("\nValores sem iguais..:");
        for(i=0;i<10;i++){
          System.out.print(""+vetor3[i]);
        }


        for(i=0;i<10;i++){//ordenação do vetor
          for(int j=0 ;j<9;j++){
              if(vetor3[j]>vetor3[j+1]){
                cont=vetor3[j];
                vetor3[j]=vetor3[j+1];
                vetor3[j+1]=cont;
              }
          }
        }
        System.out.print("\nO vetor ordenado....:");
        for(i=0;i<10;i++){
          System.out.print("" +vetor3[i]);
      }
      for(i=0;i<10;i++){
        for(int j=0 ;j<9;j++){
          if(tem==1 && j==0){// nao fazer nada se o meu tem for um que significa que tem um zero digitado
            }else if(vetor3[j]==0){//colocar os 0 no final
              cont=vetor3[j+1];
              vetor3[j+1]=vetor3[j];
              vetor3[j]=cont;
            }
          }
      }
      System.out.print("\nO vetor zeros fim...:");
      for(i=0;i<10;i++){
        System.out.print("" +vetor3[i]);
      }
    }
  }
