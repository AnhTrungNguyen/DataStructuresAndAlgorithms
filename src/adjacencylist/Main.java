package adjacencylist;

public class Main {
public static void main(String[] args) {
		
	// Danh sách gần kề = Một mảng / danh sách mảng các danh sách được liên kết.
			// Mỗi LinkedList có một nút duy nhất ở đầu.
			// Tất cả các hàng xóm liền kề với nút đó đều được thêm vào danh sách liên kết của nút đó

			// độ phức tạp thời gian chạy để kiểm tra một Edge: O (v)
			// độ phức tạp của không gian: O (v + e)
		
		Graph graph = new Graph();
		
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
		
		System.out.println(graph.checkEdge(0, 1));
	}
}
