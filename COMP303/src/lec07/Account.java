package lec07;

public class Account {
	private int aAmount = 0;
	private String aHolderName = "B";
	
	public void setName(String name) {
		aHolderName = name;
		//makes the abstract state's possibility infinite
	}
	
	public void setAmout(int pAmount) {
		if(pAmount < 0) aAmount =0; //2^31 possibilities
		aAmount = pAmount;//2^32 possibilities
	}

}
