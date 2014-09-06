import java.awt.Color;
public class Circle {
	public static void main(String args[]) throws InterruptedException {
		Graphics.x = new Graphics();
		Graphics.switchAliasing(true);
		Graphics.setPen(Color.RED);
		double AngleValue = 0, deltaangle = 0;
		
		int frameCount = 0, stTime = 0, fps = 0;
		
		while (true) {
			Graphics.drawPic(50, 50, .5, "uc.jpg");
			Graphics.drawPic(157, 197, .5, "SONATA.jpg", AngleValue);
			
			//degreesLine(306, 306, 178, AngleValue);
			//degreesLine(306, 306, 178, AngleValue + 90);
			//degreesLine(306, 306, 178, AngleValue + 180);
			//degreesLine(306, 306, 178, AngleValue + 270);
			
			AngleValue = AngleValue + deltaangle;
			if (Graphics.RangePressed(500, 500, 700, 600)) {
				Graphics.drawPic(500, 500, 1, "b2.jpg");
				deltaangle = deltaangle + .05; }
			else {
				Graphics.drawPic(500, 500, 1, "b1.jpg");
				if (deltaangle >= 0) deltaangle = deltaangle - .05; }
			if (deltaangle < 0) deltaangle = 0;
			Graphics.writeString(10, 10, 2, "DELTA DEGREES " + Math.round(deltaangle * 100) / 100);
			if (AngleValue == 360) AngleValue = 0;
			
			frameCount++;
			if (((int) System.currentTimeMillis()) > (stTime + 1000)) {
				stTime = (int) System.currentTimeMillis();
				fps = frameCount;
				frameCount = 0; }
			Graphics.writeString(1150, 680, 2, fps + " FPS");
			
			Graphics.makeImage();
			Thread.sleep(15);
			Graphics.clearScreen(Color.WHITE); } }
	public static void degreesLine(double x, double y, double length, double degrees) {Graphics.drawLine(x, y, x + (length * Math.cos(degrees * (Math.PI / 180))), y + (length * Math.sin(degrees * (Math.PI / 180)))); } }
