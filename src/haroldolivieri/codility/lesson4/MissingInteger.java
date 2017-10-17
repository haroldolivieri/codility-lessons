package haroldolivieri.codility.lesson4;

import java.util.HashSet;

public class MissingInteger {
	
	public static void main(String[] args) {
		int[] A = {1, 3, 6, 4, 1, 2};
		solution(A);
	}

	public static int solution(int[] A) {
		int num = 1;
		HashSet<Integer> hset = new HashSet<Integer>();

		for (int a : A) {
			hset.add(a);
		}

		while (hset.contains(num)) {
			num++;
		}

		return num;
	}

}
