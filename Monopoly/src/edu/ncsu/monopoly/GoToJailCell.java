package edu.ncsu.monopoly;

public class GoToJailCell extends Cell {
	
	public GoToJailCell() {
		setName("Go to Jail");
	}

	public boolean playAction(String msg) {
		GameMaster gmInstance = GameMaster.instance();
		Player currentPlayer = gmInstance.getCurrentPlayer();
		JailCell jail = (JailCell)(gmInstance.getGameBoard().queryCell("Jail"));
		gmInstance.sendToJail(currentPlayer);
		return true;
	}
}
