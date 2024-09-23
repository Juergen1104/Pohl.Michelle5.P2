public class Aufgabe_2_1a {
    /* *** Aufgabenteil (a)  *** */
	/*
	   // TODO
	 */


    public static void main(String[] args) {

        int a = IOTools.readInteger("a = ");
        int b = IOTools.readInteger("b = ");
        int r1 = 0;

        for (int i = a; i <= b; i++) {
            switch (i % 4) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    r1++;
                    break;
            }
        }
        System.out.println("r1 = " + r1);
    }
}
