package warmup;

import java.util.Scanner;

public class Suten {
	public static boolean win(char a, char b) {
		return (a=='e' && b=='h') || (a=='h' && b=='a') || (a=='a' && b=='e');
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] eko = s.nextLine().split(" ");
		String[] ganesh = s.nextLine().split(" ");
		int ekowin = 0, ganeshwin = 0;
		for(int i=0;i<eko.length;i++) {
			char ekoplay = eko[i].charAt(0);
			char ganeshplay = ganesh[i].charAt(0);
			if(win(ekoplay, ganeshplay)) {
				ekowin++;
			}else if(ekoplay!=ganeshplay) {
				ganeshwin++;
			}
		}
		s.close();
		if(ekowin>ganeshwin) {
			System.out.println("Eko wins");
		}else if(ekowin<ganeshwin) {
			System.out.println("Ganesh wins");
		}else {
			System.out.println("Draw");
		}
	}
}
