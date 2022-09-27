package beginner;

public class InsertionSort {
	// Sắp xếp chèn = sau khi so sánh các phần tử ở bên trái,
	// dịch chuyển các phần tử sang bên phải để tạo khoảng trống để chèn giá trị

	// Thời gian bậc hai O (n ^ 2)
	// tập dữ liệu nhỏ = phong nha
	// tập dữ liệu lớn = BAD

	// Ít bước hơn sắp xếp bong bóng
	// Trường hợp tốt nhất là O (n) so với Sắp xếp lựa chọn O (n ^ 2)
	public static void main(String[] args) {
		
		int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		
		insertionSort(array);
		
		for(int i : array) {
			System.out.print(i);
		}
	}

	private static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			while(j>= 0 && array[j] > temp) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp;
		}
	}
}
