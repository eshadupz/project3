public class Queen extends ChessPiece {
	private String name; 

	public Queen() {
		super("-Q-");
		name = "-Q-";
	}

	public String getName() {
		return name;
	}
	public String toString() {
		return this.name;
	}

	@Override 
	public boolean move(int initposX, int initposY, int finalposX, int finalposY) {
		if (initposX == finalposX) {
			return true;
		}

		else if (initposY == finalposY) {
			return true;
		}

		for (int i =0; i <8; i++){
			if (finalposX == (initposX - i) && ((finalposY ==(initposY +i)) || (finalposY == (initposY - i)))) {
				return true;
			}
			else if (finalposX == (initposX - i) && ((finalposY == initposY + i)) || (finalposY == (initposY - i))) {
				return true;
			}
			else if (finalposX == initposX || finalposY == initposY) {
				return false;
			}
		}
		return false;
	}
}
