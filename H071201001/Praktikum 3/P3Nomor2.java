import java.util.Scanner;
	
public class P3Nomor2 {
		public static void main(String[] args) {
			Scanner asd = new Scanner(System.in);
			System.out.println("Masukkan dua angka, misal 4 (enter) 100 ");
			int x = 0;
			int y = 0;
			do {
				x = asd.nextInt();
				y = asd.nextInt();
				if (x >= y) {
					System.out.println("Invalid input! first input must be smaller than second!");
				}
			} while (x >= y);
			
			for (int i = 1; i <= y; i++) {
				if (i % x == 0) {
					System.out.println(i); // println = print(.. + "\n")
				} else {
					System.out.print(i + " ");
				}
			}
	}
}
