package hello_world;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useDelimiter("\n");
		String user_input = input.nextLine();
		System.out.println(user_input);
		switch (user_input){
		case "5":
			System.out.println("got 5");
		default:
			System.out.println("ran");
		input.close();
		}

	}

}
