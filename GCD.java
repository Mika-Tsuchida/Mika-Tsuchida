package Chapter2Program3;
import java.util.Scanner;


public class GCD {
	

	private static int GCD(int figure1, int figure2) {
		   
	  	  while(figure1!=figure2) {
				if(figure1>figure2) {
					figure1 -= figure2;
				}else {
					figure2 -= figure1;
				}
				return figure1;
			}
		return figure2;
	}
	
	public static void main(String[] args) { 
		  //値を２つ入力してください
	  	    System.out.println("値を２つ入力してください:"); 
	  	  
	  	  Scanner sc1 =new Scanner(System.in);
	    	Scanner sc2=new Scanner(System.in);
	  	  int figure1=sc1.nextInt();
	  	  int figure2=sc2.nextInt();
	  	   
	  	 
	  	System.out.println("入力値"+figure1+","+figure2+"の時");
	  	System.out.println(GCD(figure1, figure2));
		
		

		// TODO Auto-generated method stub

	}

}
