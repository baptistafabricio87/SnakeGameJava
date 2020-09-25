package view;

import java.awt.Color;
import java.awt.Graphics;

public class Rect {

	private Integer x, y, height, width;
	private Color color;
	
	public Rect(Color color, Integer x, Integer y, Integer width, Integer height) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	public Integer getX() {
		return x;
	}

	public Integer getY() {
		return y;
	}

	public Integer getHeight() {
		return height;
	}

	public Integer getWidth() {
		return width;
	}

	public Color getColor() {
		return color;
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}
}