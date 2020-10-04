
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
		
	 
	
		
		
		while(CPU.getScore() != winningScore || p1.getScore() != winningScore ) {
			cpuAction = p2.getAction(p1.GunStance.bullets);
			playerAction = p1.getAction();
			if ( gameStates[cpuAction][playerAction] == 1){
				p2.incrementScore;
				}
			
			else if (gameStates[cpuAction][playerAction] == -1) { 
				p1.incrementScore;
				}
		}
		if p2.getScore()>p1.getScore(){
			System.out.println("LOSER!!!");
		}
		else {
			System.out.println("WINNER!!!");
		}
	
	
	
	}
	
	
}
