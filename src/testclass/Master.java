package testclass;

public class Master {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.setName("pan");
		d.setAge(12);
		d.eat();
		d.sleep();
		d.guard();
		String brak=d.brak();
		System.out.println(brak);
		
		
	}

}
