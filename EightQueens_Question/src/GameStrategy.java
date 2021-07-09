public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		return cellId%8;
	}
	
	private int getRow(int cellId) {
		return cellId/8;
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		//Check for queen in row and columns
		for(int i=0; i<8; i++) {
			if(placedQueens[i][col] || placedQueens[row][i])
				return false;
		}
		
		//Check for queen in upper left diagonal
		for(int i=row,j=col; i>=0 && j>=0;i--, j--){
			if(placedQueens[i][j])
				return false;
		}
		
		//Check for queen in upper right diagonal
		for(int i=row,j=col; i>=0 && j<8;i--, j++){
			if(placedQueens[i][j])
				return false;
		}
		
		//Check for queen in lower left diagonal
		for(int i=row,j=col; i<8 && j>=0;i++, j--){
			if(placedQueens[i][j])
				return false;
		}
		
		//Check for queen in lower right diagonal
		for(int i=row,j=col; i<8 && j<8;i++, j++){
			if(placedQueens[i][j])
				return false;
		}
		
		
		placedQueens[row][col] = true;
		numQueens++;
		return true;
	}
}














