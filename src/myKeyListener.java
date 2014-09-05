import java.awt.event.KeyEvent; import java.awt.event.KeyListener;
class myKeyListener implements KeyListener {
	@Override
	public void keyPressed(KeyEvent arg0) {
		Graphics.keyPressed = true;
		int keyCode = arg0.getKeyCode();
		switch( keyCode ) {
			case KeyEvent.VK_W:
				if (!Graphics.keysdown.contains("W")) Graphics.keysdown.add("W");
				break;
			case KeyEvent.VK_A:
				if (!Graphics.keysdown.contains("A")) Graphics.keysdown.add("A");
				break;
			case KeyEvent.VK_S:
				if (!Graphics.keysdown.contains("S")) Graphics.keysdown.add("S");
				break;
			case KeyEvent.VK_D:
				if (!Graphics.keysdown.contains("D")) Graphics.keysdown.add("D");
				break;
			case KeyEvent.VK_SPACE:
				if (!Graphics.keysdown.contains(" ")) Graphics.keysdown.add(" ");
				break; } }
	@Override
	public void keyReleased(KeyEvent arg0) {
		int keyCode = arg0.getKeyCode();
		switch( keyCode ) {
			case KeyEvent.VK_W:
				Graphics.keysdown.remove("W");
				break;
			case KeyEvent.VK_A:
				Graphics.keysdown.remove("A");
				break;
			case KeyEvent.VK_S:
				Graphics.keysdown.remove("S");
				break;
			case KeyEvent.VK_D:
				Graphics.keysdown.remove("D");
				break;
			case KeyEvent.VK_SPACE:
				Graphics.keysdown.remove(" ");
				break; } 
		if (Graphics.keysdown.isEmpty()) Graphics.keyPressed = false; }
	@Override
	public void keyTyped(KeyEvent arg0) { } }
