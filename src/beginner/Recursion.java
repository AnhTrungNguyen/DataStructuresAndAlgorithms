package beginner;

public class Recursion {

	// recursion = Khi một thứ được xác định theo nghĩa của chính nó. - Wikipedia
	// Áp dụng kết quả của một thủ tục cho một thủ tục.
	// Một phương thức đệ quy gọi chính nó. Có thể thay thế cho sự lặp lại.
	// Chia một bài toán thành các bài toán con cùng loại với bài toán ban đầu.
	// Thường được sử dụng với các thuật toán sắp xếp nâng cao và điều hướng cây

	// Thuận lợi
	// ----------
	// dễ đọc / ghi hơn
	// dễ gỡ lỗi hơn

	// Nhược điểm
	// ----------
	// đôi khi chậm hơn
	// sử dụng nhiều bộ nhớ hơn

	public static void main(String[] args) {

		walk(5);
		System.out.println(factorial(7));
		System.out.println(power(2, 8));
	}

	private static void walk(int steps) {

		if (steps < 1)
			return; // base case
		System.out.println("You take a step!");
		walk(steps - 1); // recursive case
	}

	private static int factorial(int num) {

		if (num < 1)
			return 1; // base case
		return num * factorial(num - 1); // recursive case
	}

	private static int power(int base, int power) {

		if (power < 1)
			return 1; // base case
		return base * power(base, power - 1); // recursive case
	}
}

