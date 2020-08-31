package spring.code.autowired;

public class Human {
	private Heart heart;

	public Human(Heart heart)
	{
		this.heart=heart;
	}
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		heart.pump();
	}
}
