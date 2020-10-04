
public class GameEngine {
	private int winningScore = 1;
	private Player p1;
	private CPU p2;
	
	public GameEngine(int winningScore,Player p1, CPU p2) {
		this.winningScore = winningScore;
		this.p1 = p1;
		this.p2 = p2;
		
	}
	
	public void startGame(){
		
		
		int cpuAction = 0;
		int playerAction = 0;
		
		int [][] gameStates = new int[][] {{0, 0, 0}, 
											{0, 0, -1}, 
											{0, 1, 0}};
		
	 
	
		
				
		while(p2.getScore() != winningScore && p1.getScore() != winningScore ) {
			System.out.println("Player bullets = " + p1.gun.getBullet());
			System.out.println("CPU bullets    = " + p2.gun.getBullet());
			playerAction = p1.getAction();
			cpuAction = p2.getAction(p1.gun.getBullet());
			if ( gameStates[cpuAction][playerAction] == 1){
				p1.incrementScore();
				}
			
			else if (gameStates[cpuAction][playerAction] == -1) { 
				p2.incrementScore();
				}
			System.out.println("\n");
		}
		if (p2.getScore()>p1.getScore()){
			System.out.println("LOSER!!!");
		}
		else {
			System.out.println("WINNER!!!");
		}
	
	
	
	}
	
	
}
