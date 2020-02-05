package algorithm;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[] {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
		int[] arr = new int[] {3, 4, 6, 7, 2, 7, 2, 8, 0};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		if(start < end) {
			// 把数组中的第0个数字作为标准数
			int target = arr[start];
			// 记录需要排序的下标
			int low = start;
			int high = end;
			// 循环找比标准数大的数和比标准数小的数
			while(low < high) {
				// 右边的数字比标准数大
				if(low < high && target <= arr[high]) {
					high--;
				} 
				// 使用右边的数字替换左边的数字
				arr[low] = arr[high];
				
				// 如果左边的数字比标准数小
				if(low < high && arr[low] <= target) {
					low++;
				}
				// 使用左边的数字替换右边的数字
				arr[high] = arr[low];
			}
			// 当高和低相同的时候，把标准数赋值给低所在的标准数
			arr[low] = target;
			// 处理所有小的数字
			quickSort(arr, start, low);
			// 处理所有大的数字
			quickSort(arr, low+1, end);
		}
	}

}
