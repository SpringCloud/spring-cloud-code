package cn.springcloud.book.provider.model;

public class Animal {
	private String name;
	private String sex;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal() {}
	public Animal(String name,String sex,int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
}
