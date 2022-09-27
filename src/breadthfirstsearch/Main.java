package breadthfirstsearch;

public class Main {
public static void main(String[] args) {
		
	// Breadth FS = Duyệt qua mức đồ thị theo mức
	// Sử dụng hàng đợi
	// Tốt hơn nếu đích ở mức trung bình gần bắt đầu
	// Anh chị em được thăm trước khi có con

	// Độ sâu FS = Duyệt một nhánh đồ thị theo nhánh
	// Sử dụng ngăn xếp
	// Tốt hơn nếu điểm đến trung bình xa điểm bắt đầu
	// Trẻ em được thăm trước anh chị em ruột
	// Phổ biến hơn cho trò chơi / câu đố
		
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
		
		graph.breadthFirstSearch(0);
	}
}
