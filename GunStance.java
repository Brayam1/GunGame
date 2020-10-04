
public class GunStance {

	private int bullet = 1;

	public int setAction(int act){
		
		switch(act) {
		case 0:
			System.out.println("chose block");
			return block();
		case 1:
			System.out.println("chose shoot");
			return shoot();
		case 2:
			System.out.println("chose reload");
			return reload();
		}
		return -1;
		
	}
	
	public int getBullet() {return bullet;}
	
	private int shoot() {
		bullet--;
		return 1;
	}
	
	private int block() {
		return 0;
	}
	
	private int reload(){
		bullet++;
		return 2;
	}
}
