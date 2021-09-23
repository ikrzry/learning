package e2;
//class A03,实现arr复制功能copyArr,输入旧arr返回新arr，元素与旧相同
public class H4 {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30};
		A03 a03 = new A03();
		int[] newArr = a03.copyArr(arr);
		for(int i = 0;i < newArr.length; i++) {
		System.out.println(newArr[i]);
		}
		}

}

class A03{
	public int[] copyArr(int[] arr) {
		int[] arrNew = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i]; 
		}
		return arrNew;
	}
}