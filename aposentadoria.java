import java.util.Scanner;

public class aposentadoria {

     public static void main(String[] args) {
    	
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.print("qual sua idade:");
    	 Double idade = sc.nextDouble();
    	 
    	 System.out.print("tempo de contribuicao com governo:");
    	 Double  tempocontribuicao   = sc.nextDouble();
    	 
         if(idade >= 55 && tempocontribuicao >= 25){
         System.out.println("ja pode aposentar!");
         } else {
         System.out.println("voce ainda nao pode aposentar!");
         }
         
         sc.close();
         
     }
     
}