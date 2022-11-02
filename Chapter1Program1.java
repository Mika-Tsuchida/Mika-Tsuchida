package AgeAndGender;
import java.util.Scanner;

  	public class Chapter1Program1{
  		public static void main(String[]args){
  	   Scanner sc=new Scanner(System.in);
  		//性別を入力
  	    System.out.println("性別を入力してください:"); 
  	    int gender=sc.nextInt();
  	    Scanner scanner１=new Scanner(System.in);
  	    //年齢を入力
  	    System.out.println("年齢を入力してください:"); 
  	    int Age=sc.nextInt();
  	    //入力値の結果
  	      if(gender==0&&Age<20){
  	    	  System.out.println("未成年の男性です");}
  	      else if(gender==0&&Age>=20) {
  	  	 System.out.println("成人の男性です");}
  	      else if(gender==1&&Age>=20){System.out.println("成人の女性です");
  	  	 }else{System.out.println("未成年の女性です");}}}
  		  
  		