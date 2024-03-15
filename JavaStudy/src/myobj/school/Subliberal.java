package myobj.school;

public class Subliberal extends Subject {
	
	int kor;
	int eng;
	int math1;
	int national;
	int moral;
	int world;
	
	static int getRandomScore() {
		return (int)(Math.random() * 101);
	}
	
	public Subliberal() {
		kor = getRandomScore();
		eng = getRandomScore();
		math1 = getRandomScore();
		national = getRandomScore();
		moral = getRandomScore();
		world = getRandomScore();	
	}
	
	
	
	

}
