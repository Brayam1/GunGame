/* Edgar */
import java.util.Random;

public class CPU {
	int score = 0;
	GunStance gun = new GunStance();
	Random rand = new Random();
	
	//reason for p1 bullets is so we can make it smarter
	int getAction(int p1_bullets) {
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
