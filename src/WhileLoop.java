
public class WhileLoop {

	public static void main(String[] args) {
		System.out.println(powXY(-3,0));
		
	}

	public static double powXY(double x, double y) {
		double res = 1;
		if (y >= 0) {
			while (0 < y) {
				res *= x;
				y--;
			}
		} else {
			while (y <= -1) {
				res *= x;
				y++;
			}
			res = 1 / res;
		}

		return res;
	}
}
