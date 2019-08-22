package testGit;

import java.util.Scanner;

public class WhatsThis {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		if(in.nextInt() < 10)
			System.out.println("You are too small");
		in.close();
	}
}
