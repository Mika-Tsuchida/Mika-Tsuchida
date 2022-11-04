package Chapter1Program4;
import java.util.Scanner;
public class Change {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			//所持金を入力
		System.out.println("あなたは何円所持していますか？:"); 
		int money=sc.nextInt();
		    
		     //購入代金を入力
		System.out.println("購入商品の代金はいくらですか？:"); 
		int total=sc.nextInt();

		     //入力された値に対するお釣りの結果
	    System.out.println("お釣りの金額は"+(money-total)+"円です"); 
		    
	        //お釣りのお札と硬貨の枚数
	    System.out.println("10000円:"+(money-total)/10000+"枚");
	    int a=(money-total)%10000;
		System.out.println("5000円:"+a/5000+"枚");
		int b=a%5000;
	    System.out.println("2000円:"+b/2000+"枚");
	    int c=b%2000;
		System.out.println("1000円:"+c/1000+"枚");
		int d=c%1000;
		System.out.println("500円:"+d/500+"枚");
		int e=d%500;
		System.out.println("100円:"+e/100+"枚");
		int f=e%100;
	    System.out.println("50円:"+f/50+"枚");
	    int g=f%50;
		System.out.println("10円:"+g/10+"枚");
		int h=g%10;
		System.out.println("5円:"+h/5+"枚");
		int i=h%5;
		System.out.println("1円:"+i/1+"枚");
		                                          }
		                       

	}


