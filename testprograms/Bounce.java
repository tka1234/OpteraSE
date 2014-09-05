import java.awt.Color; import java.util.ArrayList;
public class Bounce {
	public static void main(String args[]) throws InterruptedException {
		Graphics.x = new Graphics();
		Graphics.switchAliasing(true);
		ArrayList<Integer> XVals = new ArrayList<Integer>();
		ArrayList<Integer> YVals = new ArrayList<Integer>();
		ArrayList<Integer> VXVals = new ArrayList<Integer>();
		ArrayList<Integer> VYVals = new ArrayList<Integer>();
		XVals.add(0);
		YVals.add(0);
		VXVals.add(2);
		VYVals.add(2);
		while (true) {
			for(int i = 0; i < XVals.size(); i++) {
				Graphics.drawPic(XVals.get(i), YVals.get(i), 0.5, "FANCEE.jpg");
				XVals.set(i, XVals.get(i) + VXVals.get(i));
				if (XVals.get(i) > 980) VXVals.set(i, -2);
				if (XVals.get(i) < 0) VXVals.set(i, 2);
				YVals.set(i, YVals.get(i) + VYVals.get(i));
				if (YVals.get(i) > 519) VYVals.set(i, -2);
				if (YVals.get(i) < 0) VYVals.set(i, 2); }
			//if (Graphics.keysdown.contains(" ")) {
			if (true) {
				XVals.add((int) Math.floor(Math.random() * 980));
				YVals.add((int) Math.floor(Math.random() * 519));
				VXVals.add(2);
				VYVals.add(2); }
			Graphics.writeString(900, 680, 2, "NUMBER OF STUFF " + XVals.size());
			Graphics.makeImage();
			Thread.sleep(15);
			Graphics.clearScreen(Color.WHITE);
		} } }
