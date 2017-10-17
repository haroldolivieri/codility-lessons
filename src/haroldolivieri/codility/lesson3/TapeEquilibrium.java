package haroldolivieri.codility.lesson3;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int[] A = { 3, 1, 2, 4, 3 };
		solution(A);
	}

	public static int solution(int[] A) {
		int sumMin = A[0];
		int sumMax = 0;

		for (int i = 1; i < A.length; i++) {
			sumMax += A[i];
		}

		int minDif = Math.abs(sumMin - sumMax);
		for (int i = 1; i < A.length - 1; i++) {
			sumMin += A[i];
			sumMax -= A[i];
			minDif = Math.min(minDif, Math.abs(sumMin - sumMax));
		}

		return minDif;
	}
}
