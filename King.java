public class King extends ChessPiece {
	private String name; 

	public King() {
		super(name: "-K-");
		name = "-K-";
	}

	public String getName() {
		return name;
	}
	public String toString() {
		return this.name;
	}

	@Override 
	public boolean move(int initposX, int initposY, int finalposX, int finalposY) {
		if (finalposX ==(initposX-1) || finalposX == (initposX+1)) {
			if (finalposY == initposY) {
				return true;
			}

			else if (finalposY == (initposY-1) || finalposY == (initposY+1)) {
				return true;
			}
			else {
				return false;
			}
		}

		else if(finalposY ==(initposY-1) || finalposY == (initposY+1)) {
			if(finalposX==initposX) {
				return true;
			}

			else if(finalposX = (initposX-1) || finalposX == (initposX+1)) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
}