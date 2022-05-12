public class Knight extends ChessPiece {
	/* This piece can jump in an L-shaped pattern.  */
	public String name; 

	public Knight() {

        super("-h-");
        name = "-h-";
	}

	public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public boolean move(int initposX, int initposY, int finalposX, int finalposY) {
    	if(finalposX == (initposX+2) || finalposX == (initposX-2)) {
    		if(finalposY == (initposY+1) || finalposY == (initposY-1)) {
    			return true;
    		}
    		else {
    			return false;

    		}
    	}
    }

}
