package Chapter1Program3;

public class FizzBuzz {
 Scanner sc=new Scanner(System.in);
			//”’l‚ğ”¼Šp‚Å“ü—Í
		    System.out.println("”’l‚ğ”¼Šp‚Å“ü—Í‚µ‚Ä‚­‚¾‚³‚¢:"); 
		    int figure=sc.nextInt();
		    
		    //“ü—Í’l‚ÌŒ‹‰Ê
		      if(figure%3==0){
		    	  System.out.println(+figure+"‚Í3‚Ì”{”‚Å‚·");}
		      else if(figure%5==0) {
		  	 System.out.println(+figure+"‚Í5‚Ì”{”‚Å‚·");}
		      else (figure%3==0||figure%5==0){System.out.println(+figure+"‚Í15‚Ì”{”‚Å‚·");
		  	}

                                          }
                       }
}
