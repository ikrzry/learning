package e2;
//class A01 Method max 求某个double数组最大值并return

public class H1 {

	public static void main(String[] args) {
		double arr[] = {2.2, 5.5, 3.3, 7.7, 6.6};
		A01 a1 = new A01();
		double arr1 = a1.max(arr);
		System.out.println(arr1);
	}

}

class A01{
	public double max(double arr[]) {
		double maxnum = 0;
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] > maxnum) {
				maxnum = arr[i];
			}
		}
		return maxnum;
	}
}
