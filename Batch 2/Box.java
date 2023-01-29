class Box{
	double length, breadth, height;
	Box(double length, double breadth, double height){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	public double Volume(){
		double vol = this.length*this.breadth*this.height;
		return vol;
	}
}
class TestDriver{
	public static void main(String []args){
		Box box= new Box(12,15,20);
		double volume=box.Volume();
		System.out.println("The volume of the box is " + volume);
	}
}