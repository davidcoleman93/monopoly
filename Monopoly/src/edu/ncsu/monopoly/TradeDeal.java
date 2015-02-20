package edu.ncsu.monopoly;

public class TradeDeal {
    private int amount;
    private int playerIndex;
    private String propertyName;

    public int getAmount() {
        return amount;
    }
    
    public int getPlayerIndex() {
        return playerIndex;
    }
    
    public String getPropertyName() {
        return propertyName;
    }
    
    public String makeMessage() {
        GameMaster gmInstance = GameMaster.instance();
		String message = gmInstance.getCurrentPlayer() + 
        	" wishes to purchase " +
        	propertyName + " from " + 
        	gmInstance.getPlayer(playerIndex) +
        	" for " + amount + ".  " + 
        	gmInstance.getPlayer(playerIndex) +
        	", do you wish to trade your property?";
        return message;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
    
    public void setSellerIndex(int playerIndex) {
        this.playerIndex = playerIndex;
    }
}
