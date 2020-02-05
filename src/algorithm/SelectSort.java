package algorithm;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {3, 5, 2, 7, 8, 1, 2, 0, 4, 7, 4, 3, 8};
		System.out.println(Arrays.toString(arr));
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectSort(int[] arr) {
		// 遍历所有的数
		for(int i=0; i<arr.length; i++) {
			int minIndex = i;
			// 把当前遍历的数和后面所有的数一次做比较，并记录下最小数的小标
			for(int j=i+1; j<arr.length; j++) {
				// 如果后面比较的数比记录的最小的数小
				if(arr[minIndex] > arr[j]) {
					// 记录下最小的数的那个下标
					minIndex = j;
				}
			}
			// 如果最小的数和当前遍历的数的下标不一致
			// 说明下标为minIndex的数比当前 遍历的数更小
			if(i != minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

}
