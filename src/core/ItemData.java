package core;

public enum ItemData {
	WOOD(0,"木", "wood"),
	TABLE(1,"作業台", "table"),
	STICK(2,"棒" ,"stick"),
	EMPTY(999,"空" ,"empty");

	public int id;
	public String jname;
	public String ename;

	ItemData(int id, String jname, String ename) {
		this.id = id;
		this.jname = jname;
		this.ename = ename;
	}

	public String getName() {
		return jname;
	}
}
