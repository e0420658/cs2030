public class Circle {
        Point centre;
	double radius;
	
	Circle(Point centre, double radius) {
		this.centre= centre;
		this.radius= radius;
	}
	
	boolean checkPointsInCircle(Point q) {
		if (centre.distanceBetween(q) <= this.radius){
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "circle of radius " + this.radius + " centered at " + this.centre;
	}
}
