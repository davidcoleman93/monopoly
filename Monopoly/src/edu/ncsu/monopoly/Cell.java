package edu.ncsu.monopoly;

public abstract class Cell implements IOwnable {
	protected boolean available = true;
	private String name;
	protected Player theOwner;

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#getTheOwner()
	 */
	@Override
	public Player getTheOwner() {
		return theOwner;
	}
	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#getPrice()
	 */
	@Override
	public int getPrice() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#playAction()
	 */
	@Override
	public abstract boolean playAction(String msg);

	void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#setTheOwner(edu.ncsu.monopoly.Player)
	 */
	@Override
	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    public String toString() {
        return name;
    }

	@Override
	public boolean isAvailable() {
		return available;
	}

	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
