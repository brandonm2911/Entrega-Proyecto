package entregaproyecto;

/**
 *
 * @author hijos
 */
public class Ejercicio1 {
    
public static void main(String[] args) {
	int A = 5;
	int B = 3;
	int C = -12;
		
	System.out.println("A > 3 "  + (A > 3));
	System.out.println("A > C " + (A > C));
	System.out.println("A < C " + (A < C ));
	System.out.println("B < C " + (B < C ));
	System.out.println("B != C " + (B != C));
	System.out.println("A == 3 " + (A == 3));
	System.out.println("A * B == 15 " + (A * B == 15));
	System.out.println("A * B == -30 " + (A * B == -3));
	System.out.println("C / B < A " + (C / B < A));
	System.out.println("C / B == -10 " + (C / B == -10));
	System.out.println("C / B == -4 "+(C / B == -4));
	System.out.println("A + B + C == 5 "+(A + B + C == 5));
	System.out.println("(A + B == 8 )&&(A - B == 2) " + (A + B == 8 && A - B == 2));
	System.out.println("(A + B == 8 ) || (A - B == 2) " + (A + B == 8  || A - B == 2));
	System.out.println("(A > C) && (B > 3) && (C < 3) " + (A > C &&  B >= 3 && C < 3));
	System.out.println("(A > C) && (B >= 3) && (C <- 3) " + (A > C &&  B >= 3 && C <- 3));
}
}
