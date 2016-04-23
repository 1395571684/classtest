package testclass;

public class Pet {
	private String name;
	private int age;
	private String type;
	public String brak(){
		return "汪";
	}
	public void eat(){
		System.out.println(name+"正在吃");
	}
	public void sleep(){
		System.out.println(name+"正在睡");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
