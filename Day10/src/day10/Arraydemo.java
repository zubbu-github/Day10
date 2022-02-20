package day10;

public class Arraydemo {

	char c[] = new char[7];
	
	public static void main(String[] args) {
		int[] a = new int[4];
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 8;

		for(int i : a) {
			try {
			System.out.println("The array : " + a[i]);
			}
			catch (Exception e) {

			 System.out.println("Out of bounds");
			}
		}
	}

}
