package com.test2;

public class UserServiceImpl2 implements UserService {

	private String name;
	private String tel;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String message() {
		String s = "�̸�: " + name + ", ��ȭ��ȣ: " + tel + ", ����: " + age;
		s += age >= 19 ? ", ����" : ", �̼�����";
		return s;
	}

}