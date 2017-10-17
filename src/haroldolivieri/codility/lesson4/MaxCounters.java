package haroldolivieri.codility.lesson4;

public class MaxCounters {

	public static void main(String[] args) {
		int[] A = { 3, 4, 4, 6, 1, 4, 4 };
		int N = 5;
		solution(N, A);
	}

	public static int[] solution(int N, int[] A) {
		int[] result = new int[N];

		int maxCounter = 0;
		int lastUpdate = 0;
		for (int a : A) {
			if (a >= 1 && a <= N) {
				result[a - 1] = Math.max(lastUpdate, result[a - 1]) + 1;
				maxCounter = Math.max(maxCounter, result[a - 1]);
			} else if (a == N + 1) {
				lastUpdate = maxCounter;
			}
		}

		for (int j = 0; j < result.length; j++) {
			result[j] = Math.max(result[j], lastUpdate);
		}

		return result;
	}
}
