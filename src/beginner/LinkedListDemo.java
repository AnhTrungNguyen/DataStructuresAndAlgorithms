package beginner;

import java.util.LinkedList;

public class LinkedListDemo {
	 // LinkedList = Các nút gồm 2 phần (dữ liệu + địa chỉ)
	  // Các nút ở vị trí bộ nhớ không liên tiếp
	  // Các phần tử được liên kết bằng cách sử dụng con trỏ
	            
	  //    thuận lợi?
	  // 1. Cấu trúc dữ liệu động (cấp phát bộ nhớ cần thiết trong khi chạy)
	  // 2. Chèn và xóa các nút dễ dàng. O (1)
	  // 3. Không / Lãng phí bộ nhớ thấp
	  
	  // nhược điểm?
	  // 1. Sử dụng bộ nhớ lớn hơn (con trỏ bổ sung)
	  // 2. Không có quyền truy cập ngẫu nhiên vào các phần tử (không có chỉ mục [i])
	  // 3. Việc truy cập / tìm kiếm các phần tử tốn nhiều thời gian hơn. Trên)
	  
	  // sử dụng?
	  // 1. triển khai Stacks / Queues
	  // 2. Định vị GPS
	  // 3. danh sách nhạc
	  //
	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
//		linkedList.push("d");
//		linkedList.push("a");
//		linkedList.push("b");
//		linkedList.push("e");
//		linkedList.push("c");		
//		linkedList.pop();
		
		linkedList.offer("a");
		linkedList.offer("b");
		linkedList.offer("c");
		linkedList.offer("d");
		linkedList.offer("f");
//		linkedList.poll();
		
//		linkedList.add(4,"e");
//		linkedList.remove("f");
		
//		System.out.println(linkedList.indexOf("d"));
//		System.out.println(linkedList.peekFirst());
//		System.out.println(linkedList.peekLast());
//		linkedList.addFirst("m");
//		linkedList.addLast("n");
//		linkedList.removeFirst();
//		linkedList.removeLast();
		
		System.out.println(linkedList);
	}
}
