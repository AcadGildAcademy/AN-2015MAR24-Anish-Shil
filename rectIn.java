public class rectIn {
	private int l,b;
	public rectIn(int x,int y) {
		this.l=x;
		this.b=y;
	}
	public void areaRectTri() {
		System.out.println("Area of Rectangle: "+(this.l)*(this.b)*1.0);
		System.out.println("Area of Triangle: "+(this.l)*(this.b)/2.0);
	}
}