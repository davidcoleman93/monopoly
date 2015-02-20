package edu.ncsu.monopoly;


public class MovePlayerCard extends Card {
    
    private String destination;
    private int type;

    public MovePlayerCard(String destination, int cardType) {
        this.destination = destination;
        this.type = cardType;
    }

    public void applyAction() {
        GameMaster gmInstance = GameMaster.instance();
		Player currentPlayer = gmInstance.getCurrentPlayer();
        IOwnable currentPosition = currentPlayer.getPosition();
        GameBoard gameBoardInstance = gmInstance.getGameBoard();
		int newCell = gameBoardInstance.queryCellIndex(destination);
        int currentCell = gameBoardInstance.queryCellIndex(currentPosition.getName());
        int diceValue = 0;
        if(currentCell > newCell) {
            diceValue = (gameBoardInstance.getCellNumber() + 
                    (newCell - currentCell));
        }
        else if(currentCell <= newCell) {
            diceValue = newCell - currentCell;
        }
        System.out.println(diceValue);
        gmInstance.movePlayer(currentPlayer, diceValue);
    }

    public int getCardType() {
        return type;
    }

    public String getLabel() {
        return "Go to " + destination;
    }

}
