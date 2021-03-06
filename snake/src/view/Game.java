package view;

public class Game {
	
	private GameWindow gameWindow;
	private Renderer renderer;
	private Snake snake;
	
	public void start() {

		gameWindow = new GameWindow();
		snake = new Snake();
		renderer = gameWindow.getRenderer();
		
		addElementsToScreen();
		run();
		
	}
	
	private void addElementsToScreen() {
		renderer.add(new Background());
		renderer.add(snake);
	}

	public void run() {
			do {
				gameWindow.repaint();
				
//				try {
//					Thread.sleep(20);
//				}catch(InterruptedException e) {
//					
//				}
				
			} while(!isGameOver());
		
	}
	
	public boolean isGameOver() {
		return false;
	}
}
