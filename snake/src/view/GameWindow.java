package view;

import java.awt.Graphics;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private Renderer renderer;
	
	public GameWindow () {
		renderer = new Renderer();
		
		Background background = new Background();
		renderer.add(background);
		
		Snake snake = new Snake();
		renderer.add(snake);
		
		setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		setResizable(false);
		setTitle(Constants.WINDOW_TITLE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public Renderer getRenderer() {
		return renderer;
	}
	
	@Override
	public void paint (Graphics g) {
		renderer.render(g);
	}
}
	