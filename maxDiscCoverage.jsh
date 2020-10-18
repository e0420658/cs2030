Circle createUnitCircle(Point p, Point q){
	Point m = p.midPoint(q);
	double theta = p.angleTo(q);
	double qm = m.distanceBetween(q);
	double d = Math.sqrt(1 - (qm)*(qm));
	return new Circle(m.moveTo((theta + Math.PI/2),d), 1.0);
}
int findMaxDiscCoverage(Point[] points) {
	int maxDiscCoverage = 0;
	for (int i = 0; i < points.length - 1; i++) {
		for (int j = i + 1; j < points.length; j++) {
			// find coverage with (points[i], points[j])
			if (points[i].distanceBetween(points[j])<=2) {
				int firstCoverage = 0;
				for (Point z: points){ 
					if (createUnitCircle(points[i],points[j]).checkPointsInCircle(z)) {
						firstCoverage+=1;

					}
				}
				if (firstCoverage > maxDiscCoverage) {
					maxDiscCoverage = firstCoverage;
				}
		
			}
		}
	
	}
	return maxDiscCoverage;
}
