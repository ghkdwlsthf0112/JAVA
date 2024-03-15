package database.Quiz.event.model;

public class Prize {
	
	int prize_id;
	String prize_name;
	double prize_rate; 
	int remain_qty; 
	int init_qty;
	
	public Prize(int prize_id, String prize_name, double prize_rate,
			int remain_qty, int init_qty) {
			this.prize_id = prize_id;
			this.prize_name = prize_name;
			this.prize_rate = prize_rate;
			this.remain_qty = remain_qty;
			this.init_qty = init_qty;
	}

	public int getPrize_id() {
		return prize_id;
	}

	public String getPrize_name() {
		return prize_name;
	}

	public double getPrize_rate() {
		return prize_rate;
	}

	public int getRemain_qty() {
		return remain_qty;
	}

	public int getInit_qty() {
		return init_qty;
	}
	
	@Override
	public String toString() {
		return String.format("");
	}
}


// 우클릭 -> Source -> Generate Getters and Setters로
// 각 필드에 대한 Getter 또는 Setter를 자동을 생성가능