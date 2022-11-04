package Chapter2Program2;

public class MultiTable {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++){
            	int m = i * j;
    	    //右揃え  
        		System.out.print(" ");
           //半角スペースを追加して10の位をそろえる
        		if(10 > m) {
                            System.out.print( " " );
        		}
          //掛け算の結果
        		System.out.print(m);
        	    }
          // 改行
        	    System.out.println();
                }
		
	// TODO Auto-generated method stub

}
}
