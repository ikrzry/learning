package e2;
//class Circle，属性：半径，提供显示圆周长功能的方法与面积的方法
public class H5 {

	public static void main(String[] args) {
		Circle test = new Circle();
		double perimeter = test.computeC(25);
		double area1 = test.computeArea(25);
		System.out.println(perimeter);
		System.out.println(area1);
	}

}

class Circle{
	int radius;
	
	public double computeC(double radius) {
		double C = radius * 2 * 3.1415926;
		return C;
	}
	
	public double computeArea(double radius) {
		double area = radius * radius * 3.1415926;
		return area;
	}
}
