package testclass;

public class Dog extends Pet {
	public String brak(){
		return "汪汪";
	}
	public void guard(){
		System.out.println(this.getName()+"正在看门");
	}

}
