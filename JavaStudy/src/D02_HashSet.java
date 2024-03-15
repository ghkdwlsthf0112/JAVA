import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_HashSet {
	
	/*
	 	# Set
	 	
	 	- 집합을 구현해놓은 클래스
	 	- 중복을 허용하지 않는다
	 	- collection 인터페이스를 구현한 클래스
	 	
	 	# Hash
	 	
	 	- 같은 값을 넣으면 항상 일정한 갑ㅅ이 나와야하는 단방향성 알고리즘
	 	- HashSet은 중복임을 체크하는데 해당 객체의 Objet.hashcode() 메서드를 사용한다
	 	- 해쉬의 결과는 구체적이지 않기 때문에 순서는 존재하지 않는다 -> index가 없다
	 	
	 	# java.util.HashSet
	 	
	 	- 해쉬 알고리즘을 사용하는Set
	 	- 중복돤 데이터를 허용하지 않으며 순서가 없다
	 	
	 */
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		
		// Set.add
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		System.out.println(numbers);
		
		// HashSet응 index가 없어서 get을 사용할 수 없다
		// 내용을 사용하서 싶다면 반복문을 통해 하나씩 모두 꺼내는 방법밖에 없다
		
		// forEach 반복은 : 오른쪽에서 값을 하나씩 꺼내며 반복
		for (Integer number : numbers) {
			System.out.println(number);
		}
		// Objet 타입의 HashCode : 주소값 리턴
		// String 타입의 Hashcode 오버라이드 : 문자열 값을 통한 계산값 리턴
		// Integer 타입의 Hashcode 오버라이드 :기본형 값 리터
		System.out.println("Integer hashCode: "
				+ Integer.valueOf(1234).hashCode());
		System.out.println("abcd".hashCode());
		
		HashSet<String> fruits = new HashSet<>();
		HashSet<String> animals = new HashSet<>();
		ArrayList<String> animalList = new ArrayList<>();
			
		animalList.add("monkey");
		animalList.add("monkey");
		animalList.add("monkey");
		animalList.add("monkey");
		animalList.add("monkey");
		animalList.add("monkey");
		animalList.add("monkey");
				
		fruits.add("lemon");
		fruits.add("mango");
		fruits.add("grape");
		fruits.add("orange");
		
		animals.add("zibra");
		animals.add("lion");
		animals.add("tiger");
		animals.add("tiger");
		
		System.out.println(animals);
		
		// set.addAll(Collection? extends GanericType)
		// :m 
		animals.addAll(fruits);
		// animals.addAll(numbers); // 제네릭이 integer라 더항 수 없다
		animals.addAll(animalList); // List도 Collection이므로 더할 수 있다
		
		System.out.println(animalList);	
		System.out.println(animals);
		
		// Set.removeAll(Collection)
		animals.removeAll(fruits);
		System.out.println(animals);
		
		System.out.println("오리 있나요? " + animals.contains("duck"));
		
		// 컬렉션은 다른 컬렉션으로ㅜ 변환이 자유롭다
		List<String> list1 = new ArrayList<>(animals);
		Set<String> set1 = new HashSet<>(animalList);
		
		System.out.println("리스트가 된 셋: " + list1);
		System.out.println("셋이 된 리스트: " + set1);
	}	
}



























