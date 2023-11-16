package primerosProgramas;

public class EjerciciosOperadores {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		final float PI = 3.141592F;
		final float E = 2.718281F;
		x=1;
		y=4;
		z=10;
		
		
		System.out.println(2 * x + 0.5 * y - 1 / 5D * z);
		System.out.println(PI * x * x > y || 2 * PI * x <= z);
		System.out.println(! ( 2 * x == y / 2 || ( PI - E ) * z > y ) ==( ! (y / 2 == 2 * x) && !( y <( PI - E ) * z)));
	
	
		System.out.println(5* Math.pow(x, 2) + 3*x - 6 >= 0);
		System.out.println( (x-y)/x + (z-y)/y > y/x );
		
		System.out.println( x + y <= z  &&   z < y + z );
		
	
		System.out.println( x + " " + y + "\t" + z);
		
	}

}







