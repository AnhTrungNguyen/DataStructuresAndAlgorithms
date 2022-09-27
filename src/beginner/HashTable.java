package beginner;

import java.util.Hashtable;

public class HashTable {
	   public static void main(String args[]) {    	

		  // Hashtable = Một cấu trúc dữ liệu lưu trữ các khóa duy nhất cho các giá trị, ví dụ: <Integer, String>
		// Mỗi cặp khóa / giá trị được gọi là một Mục nhập
		// Chèn, tra cứu, xóa cặp khóa / giá trị NHANH CHÓNG
		// Không lý tưởng cho các tập dữ liệu nhỏ, tuyệt vời với các tập dữ liệu lớn

		// băm = Lấy khóa và tính một số nguyên (công thức sẽ thay đổi tùy theo khóa và kiểu dữ liệu)
		// Trong Hashtable, chúng tôi sử dụng hash% dung lượng để tính toán một số chỉ mục

		// key.hashCode ()% dung lượng = index

		// bucket = một vị trí lưu trữ được lập chỉ mục cho một hoặc nhiều Mục nhập
		// có thể lưu trữ nhiều Mục nhập trong trường hợp xảy ra va chạm (được liên kết tương tự như một LinkedList)

		// hàm va chạm = hàm băm tạo ra cùng một chỉ mục cho nhiều hơn một khóa
		// ít va chạm hơn = hiệu quả hơn

		// Độ phức tạp thời gian chạy: Trường hợp tốt nhất O (1)
		// Trường hợp tồi tệ nhất O (n)

	    	Hashtable<Integer, String> table = new Hashtable<>(10);
	    	
	    	table.put(100, "Spongebob");
	    	table.put(123, "Patrick");
	    	table.put(321, "Sandy");
	    	table.put(555, "Squidward");
	    	table.put(777, "Gary");
	    	  	
	    	for(Integer key : table.keySet()) {
	    		System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
	    	}
	    }
}
