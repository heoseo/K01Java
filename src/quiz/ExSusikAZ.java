package quiz;

public class ExSusikAZ {

	public static void main(String[] args) {

		for(int i = 0; i <= 9; i++) {
			int j = 9-i;
			System.out.printf("%d%d + %d%d = %d\n", i, j, j, i, i*10 + j + j*10 + i);
		}
		
	}

}
