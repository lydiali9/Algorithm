package algorithm;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {3, 5, 2, 7, 8, 1, 2, 0, 4, 7, 4, 3, 8};
		System.out.println(Arrays.toString(arr));
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void shellSort(int[] arr) {
		int k = 1;
		// 遍历所有的步长
		for(int d = arr.length/2; d > 0; d/=2) {
			// 遍历所有的元素
			for(int i = d; i<arr.length-1; i++) {
				// 遍历本组中所有的元素
				for(int j=i-d; j>=0; j-=d) {
					// 如果当前元素大于加上步长后的元素
					if(arr[j] > arr[j+d]) {	
						int temp = arr[j];
						arr[j] = arr[j+d];
						arr[j+d] = temp; 
					}
				}
			}
			System.out.println("第" + k + "次排序的结果: " + Arrays.toString(arr));
			k++;
		}
	}

}
