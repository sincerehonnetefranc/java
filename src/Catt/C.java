package Catt;

public class C {
	public static String u="qwwer";
	public C(){};
	private String name;
	private int age;
	private char sex;
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
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int add(int a,int b){
		return a+b;
	}
	public String add(String a,int b){
		return a;
	}
	public String add(String a,String b){
		return a+b;
	}
	
}
