package pkgShape;

public class Ellipsoid extends Ellipse implements Comparable {
	double heightRadius;
	

	public Ellipsoid(double radius, double minorRadius, double heightRadius) {
		super(radius, minorRadius);
		this.heightRadius = heightRadius;
	}

	public double getVolume() {
		
		return super.area() * heightRadius * 4 / 3;
	}

	public int compareTo(Object o) {
		Ellipsoid es = (Ellipsoid) o;
		if (this.getVolume()>(es.getVolume())) {
			return 1;
		} else if (this.getVolume() < es.getVolume()) {
			return -1;
		} else {
			return 0;
		}
	}
}
