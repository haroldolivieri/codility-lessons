package haroldolivieri.codility.lesson2;

public class CyclicRotation {
	
	public static void main(String[] args) {
		int[] A = {33,8,9,7,6};
		int K = 3;
		solution(A, K);
	}
	
	public static int[] solution(int[] A, int K) {

		int size = A.length - 1;

		if (size <= 0) {
			return A;
		}

		for (int count = 1; count <= K; count++) {

			int lastValue = A[size];

			for (int i = 0; i <= size - 1; i++) {
				A[size - i] = A[size - (i + 1)];
			}

			A[0] = lastValue;
		}
		return A;
	}
}