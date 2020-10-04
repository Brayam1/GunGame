/* Edgar */
import java.util.Random;

public class CPU {
	private int score = 0;
	public GunStance gun = new GunStance();
	private Random rand = new Random();
	
	//reason for p1 bullets is so we can make it smarter
	
	public int getScore() {return score;}
	
	public void incrementScore() {score++;}
	
	
	public int getAction(int p1_bullets) {
		if(gun.bullet > 0) {
			return gun.setAction(rand.nextInt(3));
		}
		if(gun.bullet == 0) {
			if(p1_bullets == 0)
				return gun.setAction(2);
			return gun.setAction(rand.nextBoolean() ? 0 : 2);
		}
		
		return 0;
	}
		
}
