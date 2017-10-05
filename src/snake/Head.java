/* File: Head.java
 * Author: Duncan Tilley
 * The Head class represents the head of the snake.
 */

package snake;

import java.awt.*;
import java.util.LinkedList;
import snakeState.*;

public class Head {

	public static final int NONE = 0;
	public static final int GROW = 1;
	public static final int CRASH = 2;

//	public static final SnakeRight RIGHT = new SnakeRight();
//	public static final SnakeUp UP = new SnakeUp();
//	public static final SnakeLeft LEFT = new SnakeLeft();
//	public static final SnakeDown DOWN = new SnakeDown();

	private int x, y;
	private SnakeState direction;
	private int width, height;
	private int hScale, vScale;

	public Head(int x, int y, int width, int height, int hScale, int vScale) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.hScale = hScale;
		this.vScale = vScale;
		this.direction = new SnakeRight();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public SnakeState getDirection() {
		return direction;
	}

	public void setDirection(SnakeState direction) {
		if (direction instanceof SnakeRight) {
			this.direction = this.direction.turnRight();
		} else if (direction instanceof SnakeLeft) {
			this.direction = this.direction.turnLeft();
		} else if (direction instanceof SnakeUp) {
			this.direction = this.direction.turnUp();
		} else if (direction instanceof SnakeDown) {
			this.direction = this.direction.turnDown();
		}
		
		/*if (direction >= 0 && direction <= 3) {
			this.direction = direction;
		}*/
	}

	public int move(LinkedList<Body> body, Point point) {
		if (direction instanceof SnakeRight) {
			x++;
			if (x >= width) {
				x = 0;
			}
		} else if (direction instanceof SnakeLeft) {
			x--;
			if (x < 0) {
				x = width - 1;
			}
		} else if (direction instanceof SnakeUp) {
			y--;
			if (y < 0) {
				y = height - 1;
			}
		} else if (direction instanceof SnakeDown) {
			y++;
			if (y >= height) {
				y = 0;
			}
		}
		if (x == point.getX() && y == point.getY()) {
			return GROW;
		} else if (checkBodyCollision(body)) {
			return CRASH;
		} else {
			return NONE;
		}
	}

	private boolean checkBodyCollision(LinkedList<Body> body) {
		for (Body bod : body) {
			if (x == bod.getX() && y == bod.getY()) {
				return true;
			}
		}
		return false;
	}

	public void draw(Graphics2D g) {
		g.setColor(new Color(172, 97, 84));
		g.fillOval(x * hScale, y * vScale, hScale, vScale);
	}

}
