package binarysearchtree;

public class Main {
public static void main(String[] args) {
    	
	// Cây tìm kiếm nhị phân = Một cấu trúc dữ liệu dạng cây, trong đó mỗi nút lớn hơn nút con bên trái của nó,
    // nhưng ít hơn nó đúng.
    
    // lợi ích: dễ dàng xác định vị trí một nút khi chúng theo thứ tự này
    
    // độ phức tạp thời gian: trường hợp tốt nhất O (log n)
    // trường hợp xấu nhất O (n)
    	
    	BinarySearchTree tree = new BinarySearchTree();
    	
    	tree.insert(new Node(5));
    	tree.insert(new Node(1));
    	tree.insert(new Node(9));
    	tree.insert(new Node(2));
    	tree.insert(new Node(7));
    	tree.insert(new Node(3));
    	tree.insert(new Node(6));
    	tree.insert(new Node(4));
    	tree.insert(new Node(8));
    	
    	tree.display();
    }
}
