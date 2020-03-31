package pkgShape;

public class Circle extends Shape implements Comparable {
	
	double radius;

	
	public Circle() {
		
		super();
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return Math.PI * radius * radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public int compareTo(Object o) {

		Circle c = (Circle) o;
		if (this.area()>(c.area())) {
			return 1;
		} else if (this.area() < c.area()) {
			return -1;
		} else {
			return 0;
		}
	}

}
