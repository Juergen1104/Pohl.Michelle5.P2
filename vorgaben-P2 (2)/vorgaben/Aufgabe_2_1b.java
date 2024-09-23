public class Aufgabe_2_1b {
    public static void main(String[] args){
	/* *** Aufgabenteil (b)  *** */
	/* 
	   // TODO
	 */
	int n = IOTools.readInteger("n = ");
	int a = n;
	int b = 1;
	int r2 = 0;
	
	while (a > b){
	    r2 += (a + b);
	    a--;
	    b++;
	}
	if (a == b){
	    r2 += a;
	}
	System.out.println("r2 = " +  r2);
    }
}
