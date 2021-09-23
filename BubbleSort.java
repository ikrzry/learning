package arr;

public class BubbleSort {

	public static void main(String[] args) {
		int temp = 0;
		int arr[] = {25,23,75,56,18};
	for(int i = 0; i < 4; i++) {
		for(int j = 0;j < 4 - i; j++) {
			if(arr[j] > arr[j +1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			} 
		}
	}
		for(int j = 0;j<arr.length;j++) {
			System.out.print(arr[j] + "\t");
	}
	}

}
