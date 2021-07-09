public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		if((square/8)%2==0) {
			if(square%2==0)
				return false;
		}
		else{
			if(square%2==1)
				return false;
		}
		
		return true;
	}
}
