package edu.ncsu.monopoly;


public class JailCard extends Card {
    int type;
    
    public JailCard(int cardType) {
        type = cardType;
    }

    public void applyAction() {
        GameMaster gmInstance = GameMaster.instance();
		Player currentPlayer = gmInstance.getCurrentPlayer();
		JailCell jail = (JailCell)(gmInstance.getGameBoard().queryCell("Jail"));
		gmInstance.sendToJail(currentPlayer);
    }

    public int getCardType() {
        return type;
    }

    public String getLabel() {
        return "Go to Jail immediately without collecting" +
        		" $200 when passing the GO cell";
    }
}
