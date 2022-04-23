package util;

class Singleton {
	private static Singleton instance;
	private String str;

	private Singleton() {
		this.str = "jayesh";
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getStr() {
		return this.str;
	}

	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}

}

public class SingletonProgram {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.getStr());
		// System.out.println(s.toString());
	}
}
