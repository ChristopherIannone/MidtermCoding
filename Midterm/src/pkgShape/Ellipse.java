package pkgShape;

public class Ellipse extends Circle implements Comparable {

	double minorRadius;

	public Ellipse(double radius, double minorRadius)
	{
		super(radius);
		this.minorRadius = minorRadius;
	}

	public double getMinorRadius()
	{
		return minorRadius;
	}

	public void setMinorRadius(double minorRadius)
	{
		this.minorRadius = minorRadius;
	}

	public double area()
	{
		
		return super.area() * minorRadius / radius;
	}

	public boolean isCircle()
	{
		return radius == minorRadius; 
		}

	public int compareTo(Object o) {
		Ellipse e = (Ellipse) o;
		if (this.area()>(e.area())) {
			return 1;
		} else if (this.area() < e.area()) {
			return -1;
		} else {
			return 0;
		}
	}
}
