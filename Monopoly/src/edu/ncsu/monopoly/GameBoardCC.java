package edu.ncsu.monopoly;

public class GameBoardCC extends GameBoard{
	PropertyCell blue1 = new PropertyCell();
	PropertyCell blue2 = new PropertyCell();
    IOwnable cc1 = new CardCell(Card.TYPE_CC, "Community Chest 1");
    JailCell jail = new JailCell();
    IOwnable chance1 = new CardCell(Card.TYPE_CHANCE, "Chance 1");
    
    
}
