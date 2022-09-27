package beginner;

public class InterpolationSearch {
	// tìm kiếm nội suy = cải tiến so với tìm kiếm nhị phân được sử dụng tốt nhất cho dữ liệu được phân phối "đồng nhất"
    // "đoán" trong đó giá trị có thể dựa trên kết quả thăm dò được tính toán
    // nếu thăm dò không chính xác, vùng tìm kiếm sẽ bị thu hẹp và một thăm dò mới sẽ được tính
    
    // trường hợp trung bình: O (log (log (n)))
    // trường hợp xấu nhất: O (n) [giá trị tăng theo cấp số nhân]
	public static void main(String[] args) {
		
		int[] array = {1,2,4,8,16,32,64,128,256,512,1024};
		int index = interpolationSearch(array,256);
		
		if(index != -1) {
			System.out.println("Element found at: " + index);
		}else {
			System.out.println("Not found");
		}
	}

	private static int interpolationSearch(int[] array, int value) {
		int high = array.length-1;
		int low = 0;
		while(value >= array[low] && value <= array[high] && low <= high) {
			int probe = low + (high - low) * (value-array[low]) /
					(array[high] - array[low]);
			System.out.println("probe: " + probe);
			if(array[probe] == value) {
				return probe;
			}else if(array[probe] < value) {
				low = probe +1;
			}else {
				high = probe -1;
			}
		}
		return -1;
	}
}
