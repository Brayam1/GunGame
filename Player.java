import java.util.Scanner;

public class Player {

	private int input = 0;
	private int score = 0;
	public GunStance gun = new GunStance();
	

	public int getAction(){
		//return 1;/*
		String[] actions = {"shield", "shoot", "reload"};
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("0:" + actions[0] + " 1:" + actions[1] + " 2:" + actions[2] + "\n" + "Choose Action: ");
		input = scan.nextInt();
		

		
		
		while(input < 0 || input > 2 || (gun.getBullet() == 0 && input == 1)) {
				
				System.out.print("Invalid action. \n");
				System.out.print("0:" + actions[0] + " 1:" + actions[1] + " 2:" + actions[2] + "\n" + "Choose Action: ");
				input = scan.nextInt();
		}
		
		System.out.print("You ");
		//scan.close();
		return gun.setAction(input);
     //*/
	}
	
	public int getScore() {
		return score;
	}
	
	public void incrementScore() {
		score++;
	}	
}
