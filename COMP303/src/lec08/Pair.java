package lec08;

public interface Pair {
	int getFirst();
	int getSecond();
	
	static Pair create(int pFirst, int pSecond) {
		return new Pair() {
			//actually has two implicit fields
			@Override
			public int getFirst() {
				return pFirst;
			}

			@Override
			public int getSecond() {
				return pSecond;
			}
			
		};
	}

}
