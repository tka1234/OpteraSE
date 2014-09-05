import java.awt.Color;
public class OSDSystem {
	public static void main(String args[]) throws InterruptedException {
		Graphics.x = new Graphics();
		Graphics.switchAliasing(true);
		double CarXValue = 0;
		double CarYValue = 0;
		double speedfixation = 2;
		String fname = "SONATA";
		boolean readyswitch = true;
		while (true) {
			if (Graphics.keysdown.contains("W")) CarYValue = CarYValue - speedfixation;
			if (Graphics.keysdown.contains("S")) CarYValue = CarYValue + speedfixation;
			if (Graphics.keysdown.contains("A")) CarXValue = CarXValue - speedfixation;
			if (Graphics.keysdown.contains("D")) CarXValue = CarXValue + speedfixation;
			if (Graphics.keysdown.contains(" ") && readyswitch) {
				if (fname == "SONATA") fname = "FANCEE";
				else fname = "SONATA";
				readyswitch = false; }
			if (!Graphics.keysdown.contains(" ")) readyswitch = true;
			Graphics.drawPic(Math.floor(CarXValue), Math.floor(CarYValue), .5, fname + ".jpg");
			Graphics.writeString(900, 650, 2, "POS X " + (int) CarXValue + " Y " + (int) CarYValue);
			Graphics.writeString(900, 680, 1, "NUMBER OF KEYS PRESSED " + Graphics.keysdown.size());
			Graphics.makeImage();
			Thread.sleep(15);
			Graphics.clearScreen(Color.WHITE);
		} } }
