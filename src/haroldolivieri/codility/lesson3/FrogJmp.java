package haroldolivieri.codility.lesson3;

public class FrogJmp {

	public static void main(String[] args) {
		solution(10, 85, 30);
	}

	public static int solution(int X, int Y, int D) {
		int missingPath = Y - X;

		int jumps = missingPath / D;
		int mod = missingPath % D;

		if (mod > 0) {
			jumps++;
		}

		return jumps;
	}
}
