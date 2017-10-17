package haroldolivieri.codility.lesson4;

import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args) {
		int[] A = { 4, 1, 3, 2 };
		solution(A);
	}

	public static int solution(int[] A) {
		Arrays.sort(A);

		if (A[0] != 1) {
			return 0;
		}

		boolean isSequence = true;

		for (int i = 0; i < A.length - 1; i++) {
			int currentPosition = A[i];
			int nextPosition = A[i + 1];
			if (nextPosition - currentPosition != 1) {
				isSequence = false;
				break;
			}
		}

		if (isSequence) {
			return 1;
		} else {
			return 0;
		}
	}
}
