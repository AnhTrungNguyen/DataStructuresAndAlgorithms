package adjacencymatrix;

public class Main {
	public static void main(String[] args) {

		// Ma trận kề
		// # hàng = # nút duy nhất
		// # cột = # nút duy nhất

		// độ phức tạp thời gian chạy để kiểm tra một Edge: O (1)
		// độ phức tạp của không gian: O (v ^ 2)

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

		 System.out.println(graph.checkEdge(0, 1));
	}
}
