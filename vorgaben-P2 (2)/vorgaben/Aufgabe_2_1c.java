public class Aufgabe_2_1c {
    public static void main(String[] args){
	/* *** Aufgabenteil (c)  *** */
	/* 
	   // TODO
	 */
	int a = IOTools.readInteger("a = ");
	int b = IOTools.readInteger("b = ");
	int r3 = 0;
	int x=0,y=0,z=0;

	for (int i=1;i<=a;i++){
	    y += b;
	    for (int j=1;j<=a;j++,x++){}
	}

	for (int i=1;i<=b;i++){
	    y += a;
	    for (int j=1;j<=b;j++,z++){}
	}	
	
	r3 = x + y + z;
	
	System.out.println("r3 = " +  r3);
    }
}
