package haroldolivieri.codility.lesson2;

import java.util.HashMap;

public class OddOcurrencesInArray {

	public static void main(String[] args) {
		int[] A = { 9, 3, 9, 3, 9, 7, 9 };
		solution(A);
	}

	public static int solution(int[] A) {
		HashMap<Integer, Object> hashMap = new HashMap<>();

		for (int a : A) {

			if (hashMap.containsKey(a)) {
				hashMap.remove(a);
			} else {
				hashMap.put(a, null);
			}
		}

		return (int) hashMap.keySet().toArray()[0];
	}
}