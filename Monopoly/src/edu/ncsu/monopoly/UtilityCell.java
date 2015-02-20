package edu.ncsu.monopoly;

public class UtilityCell extends Cell {

	public static final String COLOR_GROUP = "UTILITY";
	private static int PRICE;

	public static void setPrice(int price) {
		UtilityCell.PRICE = price;
	}

	public int getPrice() {
		return UtilityCell.PRICE;
	}

	public int getRent(int diceRoll) {
		int ownersNumOfUtil = theOwner.numberOfUtil();
		if(ownersNumOfUtil == 1) {
			return diceRoll * 4;
		} else if (ownersNumOfUtil >= 2) {
			return diceRoll * 10;
		}
		return 0;
	}

	public boolean playAction(String msg) {
		Player currentPlayer = null;
		if(!isAvailable()) {
			GameMaster gmInstance = GameMaster.instance();
			currentPlayer = gmInstance.getCurrentPlayer();
			if(theOwner != currentPlayer) {
				gmInstance.utilRollDice();
				int diceRoll = gmInstance.getUtilDiceRoll();
				currentPlayer.payRentTo(theOwner, getRent(diceRoll));
			}
		}
		return true;
	}
}
