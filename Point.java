public class Point {
	public double x;
	public double y;

	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
        Point midPoint(Point q) {
	     double midx = (this.x + q.x)/2;
             double midy = (this.y + q.y)/2;
             return new Point(midx, midy);
        }
       
        double angleTo(Point q){
	       	Point v = new Point(q.x-this.x,q.y-this.y);	
		return Math.atan2(v.y, v.x);
	}
       
        Point moveTo(double theta, double d){
		double movedx = this.x + d* Math.cos(theta);
		double movedy = this.y + d* Math.sin(theta);
		return new Point(movedx, movedy);
	}
	
	double distanceBetween(Point q){
		return Math.sqrt(((this.x-q.x)*(this.x-q.x))+((this.y-q.y)*(this.y-q.y)));
		
	}

	@Override
	public String toString(){
		return "point (" + String.format("%.3f", this.x) + ", " + String.format("%.3f", this.y) +")";
	}
}
