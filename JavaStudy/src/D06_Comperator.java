import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D06_Comperator {
	
	/*
	 	# Comparable
	 	
	 	- 이 인터페이스를 쿠현한 클래스는 크기 비교가 가능하다
	 	
	 	#	Comperator
	 	
	 	- 이 인터페이스를 구현할 클래스는 크기 비교의 기준이 된다
	
	 */
	
	public static void main(String[] args) {
		
		System.out.println(10 > 20);
				
		Grape g1 = new Grape(3300, 33, 10, "대관령양떼목장", 1);
		Grape g2 = new Grape(4000, 30, 8, "김씨네포도농장", 3);
		
		System.out.println(g1.compareTo(g2));
		
		List<Integer> numbers = new ArrayList<>();
		
		Collections.addAll(numbers, 99, 1, 88, -9, 13, 15, 8, 3, 99, 100);
		Collections.sort(numbers);
		
		System.out.println(numbers);

		
//		List<Integer> peaches = new ArrayList<>();
//		
//		peaches.add(new Peach());
//		peaches.add(new Peach());
//		
//		Collections.sort(peaches);
		
		List<Grape> grapes = new ArrayList<>();
		
		grapes.add(new Grape(3300, 33, 10, "대관령양떼목장", 1));
		grapes.add(new Grape(2300, 31, 8, "김씨네복숭아농장", 3));
		grapes.add(new Grape(3500, 29, 5, "이씨네사과농장", 1));
		grapes.add(new Grape(6300, 40, 7, "박씨네닭장", 2));
		grapes.add(new Grape(5150, 55, 8, "최씨네", 1));
		grapes.add(new Grape(3000, 60, 8, "김가네", 5));
		
		// Comparable 인터페이스가 구현된 클래스만 sort가 가능하다
		// Collections.sort(grapes);
		
		Collections.sort(grapes, new GrapeNofcomparator());
		Collections.reverse(grapes);
		
		System.out.println(grapes);
		
		List<Peach> peachList = new ArrayList<>();
		
		Collections.addAll(peachList, 
				new Peach(2000, 4.31, "D+", "아오리사과농장"),
		        new Peach(2500, 5.63, "B", "동네농장"),
		        new Peach(3000, 7.77, "A+", "동네농장"),
		        new Peach(2800, 5.11, "A", "주말농장")
			);
	      
		Collections.sort(peachList);
		
		System.out.println(peachList);
		
		
		Comparator<Peach> myComperator1 = new Comparator<>() {
			@Override
			public int compare(Peach o1, Peach o2) {
				String g1 = o1.grade;
				String g2 = o2.grade;
				
				char firstCh1 = g1.charAt(0);
				char firstCh2 = g2.charAt(0);
				
				if (firstCh1 == firstCh2) {
					int len1 = g1.length();
					int len2 = g2.length();
					
					if (len1 == len2) {
						//
						//
						return Integer.compare(o2.price, o1.price);
				    } else if (len1 > len2) {
		               return 1;
		            } else {
		               return -1;
		               }               
		            } else if (firstCh1 > firstCh2) {
		               return -1;
		            } else {
		               return 1;	
				}
			}
		};
			
		  // 연습문제3 : 복숭아를 등급 기준으로 오름차순 정렬하고, 등급이 같은 경우
	      //           가격 기준으로 내림차순 정렬 해보세요
	      peachList.add(new Peach(2700, 1.13, "B", "옥상텃밭"));
	      peachList.add(new Peach(2500, 2.23, "B+", "앞마당"));
	      peachList.add(new Peach(2390, 3.13, "B", "뒷마당"));
	      peachList.add(new Peach(2420, 4.55, "B", "옆집마당"));
	      
	      Collections.sort(peachList, myComperator1);
	      
	      System.out.println("#### 연습문제 3번 결과 ####");
	      System.out.println(peachList);
	}   
}

class GrapeNofcomparator implements Comparator<Grape> {
	@Override
	public int compare(Grape o1, Grape o2) {
		if (o1.numOfFruits == o2.numOfFruits) {
			return 0;
		} else if (o1.numOfFruits > o2.numOfFruits) {
			return 1;
		} else {
			return -1;
		}
	}
}

class Grape implements Comparable<Grape> {
	int price;
	int numOfFruits;
	int sweet;
	String farm;
	int grade;

	
	public Grape(int price, int numOffruits, int sweet, String farm
			, int grade) {
		this.price = price;
		this.numOfFruits = numOffruits;
		this.sweet = sweet;
		this.farm = farm;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return String.format("[%d/%d/%d/%s/%d]\n", 
				price, numOfFruits, sweet, farm, grade);
	}
	
	@Override
	public int compareTo(Grape o) {
		
		// 이곳에서 현재 인스턴스와 전달되는 인스턴스의 비교 결과를 정의한다
		
		// 두 객체의 크기가 같다면 0을 리턴
		// 두 객체 중 현재 객체의 크기가 더 크다면 1을 리턴
		// 두 객체 중 매개변수로 전달받은 객체의 크기가 더 크면 -1을 리턴		
		
		if (this.price == o.price) {
			return 0;	
		} else if (this.price > o.price) {
			return -1;
		} else {
			return 1;
		}
	}
}

// 연습문제1 : 복숭아 클래스를 마저 정의해보세요
// 			복숭아는 가격, 등급, 무게, 농장이름 필드값을 가지고 있습니다
// 			(등급은 A+, A, B, C, D.. 등 영어로 매긴다)		

// 연습문제2 : 복숭아를 정렬하면 기본적으로 무게를 기준으로 내림차순 정렬되게 민들어보세요

// 연습문제3 : 복숭아를 등급 기준으로 오름차순 정렬하고, 등급이 같은 경우
//			가격 기준으로 매림차순 정렬 해보세요

// 연습문제4 : 복숭아를 농장이름 오름차순으로 정렬하고 같은 농장인 경우
//			등급 기준 오름차순 정렬 해보세요

class Peach implements Comparable<Peach> {
	int price;
	double weight;
	String grade;
	String farm;

	
	public Peach(int price, double weight, String grade, 
			String farm) {
		this.price = price;
		this.weight = weight;
		this.grade = grade;
		this.farm = farm;

	}
	
	@Override
	public String toString() {
		return String.format("%d/%d/%s/%s\n", price, weight, farm, grade);
	}
	
	@Override
	public int compareTo(Peach o) {
		return Double.compare(o.weight, this.weight);
	}
	
 }










