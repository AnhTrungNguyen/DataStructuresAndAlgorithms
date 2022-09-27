package beginner;

public class QuickSort {
	 public static void main(String args[])
	    {   	
		// sắp xếp nhanh = di chuyển các phần tử nhỏ hơn sang trái của một trục.
		// chia đệ quy mảng thành 2 phân vùng

		// độ phức tạp thời gian chạy = Trường hợp tốt nhất O (n log (n))
		// Trường hợp trung bình O (n log (n))
		// Trường hợp xấu nhất O (n ^ 2) nếu đã được sắp xếp

		// độ phức tạp không gian = O (log (n)) do đệ quy
	    	
	        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};
	        
	        quickSort(array, 0, array.length - 1);
	        
	        for(int i : array){
	            System.out.print(i + " ");
	        }
	    }

		private static void quickSort(int[] array, int start, int end) {
			
			if(end <= start) return; //base case
			
			int pivot = partition(array, start, end);
			quickSort(array, start, pivot - 1);
			quickSort(array, pivot + 1, end);		
		}
		private static int partition(int[] array, int start, int end) {
			
			int pivot = array[end];
			int i = start - 1;
			
			for(int j = start; j <= end; j++) {
				if(array[j] < pivot) {
					i++;
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			i++;
			int temp = array[i];
			array[i] = array[end];
			array[end] = temp;
			
			return i;
		}
}
