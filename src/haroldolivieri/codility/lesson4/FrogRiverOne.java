package haroldolivieri.codility.lesson4;

import java.util.HashMap;

public class FrogRiverOne {

	public static void main(String[] args) {
		int[] A = { 1, 3, 1, 4, 2, 3, 5, 4 };
		int X = 5;
		solution(X, A);
	}

	public static int solution(int X, int[] A) {
		int num = 1;
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i <= A.length - 1; i++) {
			if (hashMap.containsKey(A[i])) {
				int time = hashMap.get(A[i]);
				if (time > i) {
					hashMap.put(A[i], i);
				}
			} else {
				hashMap.put(A[i], i);
			}
		}

		if (hashMap.size() < X) {
			return -1;
		}

		int minTime = 0;

		for (int j = 1; j <= X; j++) {
			if (hashMap.containsKey(num)) {
				int tempTime = hashMap.get(num);
				if (minTime < tempTime) {
					minTime = tempTime;
				}
			} else {
				return -1;
			}

			num++;
		}

		return minTime;
	}

}
