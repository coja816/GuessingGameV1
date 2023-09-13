import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// 
		int attempts = 0;
		
		int number = (int)  (Math.random() * 10);
		
		int guess = 0;
		
		
		System.out.println("Welcome to the guessing game! You have seven attempts to guess the number! Good luck!" + number);
			
		for(int i=0; i <7; i++) {
			
	
			
			System.out.println("Enter a number:");
			
			guess = sc.nextInt();
			
			attempts ++;
			
			if(guess == number) {
				
				System.out.println("Congrats! You guess correctly!");
				break;
			}
			
			else if(guess > number) {
				
				System.out.println("Your guess was above the number!");
			}
			else if(guess < number) {
				System.out.println("Your guess was below the number!");
			}
			
		}
			
		
		if(attempts == 7 && guess != number) {
			System.out.println("Sorry you have used all seven guesses! The number was : " + number);
		}
		
		sc.close();
		

	}

}
//if(guess != number) {
//	
//	System.out.println("Sorry that was incorrect! Your guess of " + guess+ "was wrong. Please try again:");
//	
//	System.out.println("Enter a numberfor the first time:");
//	
//	guess = sc.nextInt();
//	
//}