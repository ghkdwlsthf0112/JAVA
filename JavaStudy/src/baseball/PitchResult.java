package baseball;

public class PitchResult {
	String guess;
	int strike;
	int ball;
	
	public PitchResult(String guess, int strike, int ball) {
		this.guess = guess;
		this.strike = strike;
		this.ball = ball;
	}
	public String getGuess() {
		return guess;
	}
	public int getStrike() {
		return strike;
	}
	public int getBall() {
		return ball;
	}
	
}
