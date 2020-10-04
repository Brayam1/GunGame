import java.io.*;

public class Main {

	public static void main(String[] args) {		
		
		Player p1 = new Player();
		CPU p2 = new CPU();
		GameEngine gunGame = new GameEngine(1,p1,p2);
		gunGame.startGame();
			
	}
	
}
