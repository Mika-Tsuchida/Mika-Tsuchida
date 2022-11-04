package Chapter1Program2;
import java.util.Scanner;
import java.util.Random;
public class Janken {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Random rnd = new Random();	
  		
  	    System.out.println("じゃんけんの手を選んでください"); 
  	    int janken=sc.nextInt();
  	    
  	   
  	     int rand=rnd.nextInt(3);
  	    
  	    if(janken==rand){System.out.println("あいこです"); }
  	       else if(janken==0&&rand==2){
  	    	System.out.println("あなたの勝ちです") ;}
              else if(janken==1&&rand==0) {
             	System.out.println("あなたの勝ちです"); }
                  else if(janken==2&&rand==1) {
	               System.out.println("あなたの勝ちです"); }
                      else if(janken==0&&rand==１) {
	                   System.out.println("あなたの負けです"); }
                          else if(janken==１&&rand==0) {
                           System.out.println("あなたの負けです"); }
                              else {
	                            System.out.println("あなたの負けです"); }
	}
	
}
