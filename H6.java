package e2;
//class Cale 定义2个变量表示两个操作数，定义四个method实现求和，差，乘，商（除数为零则提示），并用两个对象分别测试
public class H6 {

	public static void main(String[] args) {
		Cale test1 = new Cale();
		int result = test1.sum(1, 4);
		System.out.println(result);
	}
}

class Cale{
	int num1 = 20;
	int num2 = 5;
	
	public int sum(int a, int b) {
		a = this.num1;
		b = this.num2;
		int numSum = a + b;
		return numSum;
	}
	
	public int sub(int a, int b) {
		a = this.num1;
		b = this.num2;
		int numSub = a - b;
		return numSub;
	}
}
