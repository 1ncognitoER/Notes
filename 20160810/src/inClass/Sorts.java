package inClass;

public class Sorts {

	public static void main(String[] args) {
		// 选择排序
//		sort1(9,2,8,3,7,4,6,5);
		// 快速排序
		int[] array = { 9, 2, 8, 3, 7, 4, 6, 5 };
		sort2(0, array.length - 1, array);
		for (int i : array) {
			System.out.println(i);
		}

	}

	/**
	 * 快速排序的递归调用方法
	 * 
	 * @param low
	 * @param high
	 * @param arr
	 */
	static void sort2(int low, int high, int[] arr) {
		if (low >= high) {
			return;
		}
		int index = sort3(low, high, arr);
		// 对左边排序
		sort2(0, index - 1, arr);
		// 对右边排序
		sort2(index + 1, 0, arr);

	}

	/**
	 * 快速排序
	 * 
	 * @param low
	 *            下标最低位
	 * @param high
	 *            下标最高位
	 * @param arr
	 *            数组数据
	 * @return 返回中间下标
	 */
	static int sort3(int low, int high, int[] arr) {

		int key = arr[low];

		for (; low < high;) {
			// 从后往前找比key小的数
			for (; arr[high] > key && high > low; high--) {
			}
			arr[low] = arr[high];
			// 从前往后找比key大的数
			for (; arr[low] < key && high > low; low++) {
			}
			arr[high] = arr[low];
		}
		arr[low] = key;// 将key赋值给到最中间的位置
		return low;// 返回中间的下标
	}

	/**
	 * 选择排序
	 * 
	 * @param arr
	 *            数组
	 */
	static void sort1(int... arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					// arr[i]=arr[i]+arr[j];
					// arr[j]=arr[i]-arr[j];
					// arr[i]=arr[i]-arr[j];

					arr[i] = arr[i] ^ arr[j];
					arr[j] = arr[i] ^ arr[j];
					arr[i] = arr[i] ^ arr[j];

				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
