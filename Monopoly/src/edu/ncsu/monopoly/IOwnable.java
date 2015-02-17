package edu.ncsu.monopoly;

public interface IOwnable {

	public abstract String getName();

	public abstract Player getTheOwner();

	public abstract int getPrice();

	public abstract void playAction();

	public abstract void setTheOwner(Player owner);

	public abstract boolean isAvailable();

	public abstract void setAvailable(boolean available);

}