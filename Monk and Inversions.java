import java.util.*;

class TestClass {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int c = 0;
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j) {
					arr[i][j] = s.nextInt();
				}
			}
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j) {
					for (int x = i; x < n; ++x) {
						for (int y = j; y < n; ++y) {
							if (arr[x][y] < arr[i][j])
								c++;
						}
					}
				}
			}
			System.out.println(c);
		}
		s.close();
	}
}
