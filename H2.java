package e2;
//class A02 Method find ʵ�ֲ���ĳ�ַ��������е�Ԫ�ز��Ҳ�����index�����Ҳ���return -1
public class H2 {

	public static void main(String[] args) {
		A02 test1 = new A02();
		String t1[] = {"god","niu"};
		int index = test1.find(t1);
		System.out.println(index);
	}

}

class A02{
	
	public int find(String arr[]) {
		int temp = 0;
		for(int i = 0;i < arr.length; i++) {
			if(arr[i].equals("god")) {
				temp = i;
				break;
			}
			else {
				temp = -1;
			}
		}
		return temp;
	}
}
