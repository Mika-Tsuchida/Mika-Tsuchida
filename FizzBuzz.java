package Chapter1Program3;

public class FizzBuzz {
 Scanner sc=new Scanner(System.in);
			//数値を半角で入力
		    System.out.println("数値を半角で入力してください:"); 
		    int figure=sc.nextInt();
		    
		    //入力値の結果
		      if(figure%3==0){
		    	  System.out.println(+figure+"は3の倍数です");}
		      else if(figure%5==0) {
		  	 System.out.println(+figure+"は5の倍数です");}
		      else (figure%3==0||figure%5==0){System.out.println(+figure+"は15の倍数です");
		  	}

                                          }
                       }
}
