package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private Rect background;
	private Rect rect;
//	private Rect a;
//	private Rect b;
//	private Rect c;
//	private Rect d;
//	private Rect e;
//	private Rect f;
	
	
	public GameWindow () {
		background = new Rect(Color.BLACK, 0, 0, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		rect = new Rect(Color.WHITE, 25, 35,  450, 450);
//		a = new Rect(Color.BLUE, 30, 40, 220, 120);
//		b = new Rect(Color.GREEN, 30, 160, 220, 120);
//		c = new Rect(Color.CYAN, 30, 280, 220, 120);
//		d = new Rect(Color.DARK_GRAY, 250, 40, 220, 120);
//		e = new Rect(Color.MAGENTA, 250, 160, 220, 120);
//		f = new Rect(Color.ORANGE, 250, 280, 220, 120);
		
		
		setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		setResizable(false);
		setTitle(Constants.WINDOW_TITLE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	@Override
	public void paint (Graphics g) {
		background.paint(g);
		rect.paint(g);
//		a.paint(g);
//		b.paint(g);
//		c.paint(g);
//		d.paint(g);
//		e.paint(g);
//		f.paint(g);
	}
}
	
