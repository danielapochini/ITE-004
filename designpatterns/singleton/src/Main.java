public class Main {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		Singleton t = Singleton.getInstance();
		System.out.println(s);
		System.out.println(t);
	}

}
