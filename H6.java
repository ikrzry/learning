package e2;
//class Cale ����2��������ʾ�����������������ĸ�methodʵ����ͣ���ˣ��̣�����Ϊ������ʾ����������������ֱ����
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
