package snakeState;

public class SnakeLeft implements SnakeState{

	@Override
	public SnakeState turnUp() {
		// TODO Auto-generated method stub
		return new SnakeUp();
	}

	@Override
	public SnakeState turnRight() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public SnakeState turnDown() {
		// TODO Auto-generated method stub
		return new SnakeDown();
	}

	@Override
	public SnakeState turnLeft() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public char getState() {
		// TODO Auto-generated method stub
		return 'l';
	}

}
