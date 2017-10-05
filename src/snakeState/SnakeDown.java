package snakeState;

public class SnakeDown implements SnakeState{

	@Override
	public SnakeState turnUp() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public SnakeState turnRight() {
		// TODO Auto-generated method stub
		return new SnakeRight();
	}

	@Override
	public SnakeState turnDown() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public SnakeState turnLeft() {
		// TODO Auto-generated method stub
		return new SnakeLeft();
	}

	@Override
	public char getState() {
		// TODO Auto-generated method stub
		return 'd';
	}

}
