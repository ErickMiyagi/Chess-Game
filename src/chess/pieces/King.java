package chess.pieces;

import boardGame.Board;
import boardGame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}
	@Override
	public String toString() {
		return "K";
	}
	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}
	@Override
	public boolean[][] possibleMoves() {	
		boolean[][] math = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0,0);
		
		//Move UP
		p.setValues(position.getRows() - 1, position.getColumns());
		if(getBoard().positionExists(p) && canMove(p)) {
			math[p.getRows()][p.getColumns()] = true;
		}
		
		//Move DOWN
		p.setValues(position.getRows() + 1, position.getColumns());
		if(getBoard().positionExists(p) && canMove(p)) {
			math[p.getRows()][p.getColumns()] = true;
		}
		
		//Move RIGHT
		p.setValues(position.getRows(), position.getColumns() + 1);
		if(getBoard().positionExists(p) && canMove(p)) {
			math[p.getRows()][p.getColumns()] = true;
		}
		
		//Move LEFT
		p.setValues(position.getRows(), position.getColumns() - 1);
		if(getBoard().positionExists(p) && canMove(p)) {
			math[p.getRows()][p.getColumns()] = true;
		}
		
		p.setValues(position.getRows() - 1, position.getColumns() - 1);
		if(getBoard().positionExists(p) && canMove(p)) {
			math[p.getRows()][p.getColumns()] = true;
		}
		
		p.setValues(position.getRows() + 1, position.getColumns() - 1);
		if(getBoard().positionExists(p) && canMove(p)) {
			math[p.getRows()][p.getColumns()] = true;
		}
		
		p.setValues(position.getRows() + 1, position.getColumns() + 1);
		if(getBoard().positionExists(p) && canMove(p)) {
			math[p.getRows()][p.getColumns()] = true;
		}
		p.setValues(position.getRows() - 1, position.getColumns() + 1);
		if(getBoard().positionExists(p) && canMove(p)) {
			math[p.getRows()][p.getColumns()] = true;
		}
		return math;
	}

}
