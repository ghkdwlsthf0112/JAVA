package database.Quiz;

import java.util.ArrayList;
import java.util.List;

import database.Quiz.event.EventDao;
import database.Quiz.event.model.Prize;

public class J06_PrizeEvent {
	
	/*
	 	# DB와 연결되는 경품 추첨 이벤트를 구현해보세요
	 	
	 	(1) DB에 경품들의 이름, 당첨 확률, 남은 수량 등 필요한 정보를
	 		저장할 수 있는 데이터들을 생성해보세요
	 		
	 		상품ID/상품명/당첨확률/남은수량/초기수량
	 		
	 	(2) 콘솔에서 뽑기를 진행하면 실제로 DB에서 수량이 줄어들게 만들어보세요
	 	
	 	(3) 상품이 모두 소진된 상태로 뽑기를 진행하면
	 		이벤트가 종료되었음을 알려주고 프로그램이 종료
	 	
	 	(4) 리셋 기능을 실행하면 DB의 상품이 다시 충전되어야 함
	*/
	EventDao eventDao = new EventDao();
	
	List<Prize> box = new ArrayList<>();
	
	public J06_PrizeEvent() {
		List<Prize> prizeList = eventDao.selectAllPrizes();
		
		int count = 0;
		
		for (Prize p : prizeList) {
			int r = (int)(p.getPrize_rate() * 1000);
			for (int i = 0; i < r; ++i){
				box.add(p);
				++count;
			}
		}
		
		while (count < 1000) {
			box.add(null);
			++count;
		}
	}	
	
	public Prize draw() {
		if (eventDao.getAllPrizesRemainQty() == 0) {
			
		}
		
		
		Prize p = box.get((int)(Math.random() * 1000));
		
		// DB에 수량 감소 반영
		if (p != null) {
			eventDao.reduceRemainQty(p.getPrize_id());
		}
		
		Prize p2  = eventDao.getPrize(p.getPrize_id());
		
		
		return p;
	}
	
	public static void main(String[] args) {
		J06_PrizeEvent event = new J06_PrizeEvent();
		
		for (int i = 0; i < 100; ++i) {
			System.out.println(event.draw());
			
			if (p != null) {
				System.out.println(p);
			}
		}
	}
}














