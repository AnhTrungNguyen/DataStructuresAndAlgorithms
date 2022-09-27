package depthfirstsearch;

public class Main {
public static void main(String[] args) {
		
	// Tìm kiếm đầu tiên theo chiều sâu = Chọn một tuyến đường, tiếp tục đi.
	// Nếu bạn đạt đến điểm cuối hoặc một nút đã được truy cập,
	// quay ngược trở lại một nút trước đó với các hàng xóm liền kề không được kiểm tra
		
		Graph graph = new Graph(5);
		
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);
		
		graph.print();
		
		graph.depthFirstSearch(0);
	}
}
