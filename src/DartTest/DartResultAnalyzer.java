package DartTest;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DartResultAnalyzer {

	private int dartScore;
	private String dartScoreEquation;

	public DartResultAnalyzer(String dartResult) {

		List<Integer> score = new ArrayList<Integer>();
		List<String> scoreEquation = new ArrayList<String>();

		StringTokenizer st = new StringTokenizer(dartResult, "0123456789", true);

		int numOfDart = 0;
		while (st.hasMoreElements()) {
			String token1 = st.nextToken();
			String token2 = st.nextToken();
			if (token1.equals("1") && token2.equals("0")) {
				token1 = "10";
				token2 = st.nextToken();
			} else {
				// NoOP
			}
			if (numOfDart == 0) {
				System.out.printf("score : %s   Option %s\n", token1, token2);
				DartScoreParser sp = new DartScoreParser(token1, token2);
				score.add(sp.getCurScore());
				scoreEquation.add(sp.getCurEquation());
				System.out.printf("score : %s   Equation %s\n", score.get(numOfDart), scoreEquation.get(numOfDart));
			} else {
				System.out.printf("score : %s   Option %s\n", token1, token2);
				DartScoreParser sp = new DartScoreParser(token1, token2, score.get(numOfDart - 1),
						scoreEquation.get(numOfDart - 1));

				score.set(numOfDart - 1, sp.getPrvScore());
				scoreEquation.set(numOfDart - 1, sp.getPrvEquation());
				score.add(sp.getCurScore());
				scoreEquation.add(sp.getCurEquation());
				System.out.printf("score : %s   Equation %s\n", score.get(numOfDart), scoreEquation.get(numOfDart));
			}

			numOfDart++;
		}
		for (int idx = 0; idx < numOfDart; idx++) {
			dartScore += score.get(idx);
			dartScoreEquation += scoreEquation.get(idx) + "+";
		}
	}

	public int getDartScore() {
		return dartScore;
	}

	public String getDartScoreEquation() {
		return dartScoreEquation;
	}

}
