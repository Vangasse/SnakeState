package snakeState;

public interface SnakeState {
	SnakeState turnUp();
	
	SnakeState turnRight();
	
	SnakeState turnDown();
	
	SnakeState turnLeft();
	
	char getState();
}
