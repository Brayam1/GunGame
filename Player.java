import java.util.Scanner;

public class Player {

	private int input;
	private int score = 0;
	public GunStance gun = new GunStance();
	

	public int getAction(){
		
		String[] actions = {"shield", "shoot", "reload"};
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("Choose Action: " + "\n" + "0:" + actions[0] + " 1:" + actions[1] + " 2:" + actions[2] + "\n");
		input = scan.nextInt();
		
		while(input < 0 || input > 2) {
				System.out.print("Invalid action. \n");
				System.out.print("Choose Action: " + "\n" + "0:" + actions[0] + " 1:" + actions[1] + " 2:" + actions[2] + "\n");
				input = scan.nextInt();
		}
		
		System.out.println("you chose: " + actions[input]);
		
		scan.close();
		return gun.setAction(input);
     
	}
	
	public int getScore() {
		return score;
	}
	
	public void incrementScore() {
		score++;
	}	
}
