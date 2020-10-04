
public class GunStance {

	/* edgar */
	int bullet = 1;

	int setAction(int act){
		
		switch(act) {
		case 0:
			return block();
		case 1:
			return shoot();
		case 2:
			return reload();
		}
		return -1;
		
	}
	
	int shoot() {
		bullet--;
		return 1;
	}
	
	int block() {
		return 0;
	}
	
	int reload(){
		bullet++;
		return 2;
	}
}
