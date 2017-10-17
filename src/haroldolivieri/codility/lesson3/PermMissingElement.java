package haroldolivieri.codility.lesson3;

import java.util.HashSet;

public class PermMissingElement {

	public static void main(String[] args) {
		int[] A = { 2, 3, 1, 5 };
		solution(A);
	}

	public static int solution(int[] A) {
		int num = 1;
		HashSet<Integer> hset = new HashSet<>();

		for (int a : A) {
			hset.add(a);
		}

		while (hset.contains(num)) {
			num++;
		}

		return num;
	}
}
