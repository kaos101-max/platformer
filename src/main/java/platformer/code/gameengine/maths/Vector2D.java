package platformer.code.gameengine.maths;

public class Vector2D {

	public float x;
	public float y;
	
	public Vector2D() {
		this.x = 0;
		this.y = 0;
	}
	
	public Vector2D(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public static boolean isClose(float x1, float y1, float x2, float y2, float distance){
		float actualDistance = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		if(actualDistance<distance){
			return true;
		}
		else{
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "[x:" + String.format("%1.2f", x) + " y:" + String.format("%1.2f", y) + "]"; 
	}
}
