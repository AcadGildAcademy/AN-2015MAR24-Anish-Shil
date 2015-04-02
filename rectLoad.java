public class rectLoad {
	private int l,b;
	public rectLoad() {
		this.l=0;
		this.b=0;
	}
	public rectLoad(int a) {
		this.l=a;
		this.b=a;
	}
	public rectLoad(int x,int y) {
		this.l=x;
		this.b=y;
	}
	public void areaRect() {
		if(this.l==0)
			System.out.println("Area of Rectangle: "+(this.l)*(this.b)*1.0);
		else if(this.l==this.b)
			System.out.println("Area of Square: "+(this.l)*(this.b)*1.0);
		else
			System.out.println("Area of Rectangle: "+(this.l)*(this.b)*1.0);
	}
}
