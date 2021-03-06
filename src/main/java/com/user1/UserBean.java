package com.user1;

public class UserBean {
	private UserService userService;//인터페이스에 의존관계를 가지고 있는 UserBean

	public UserBean(UserService userService) {
		this.userService = userService;
	}

	public void init() {
		System.out.println("init...");
	}

	public void write() {
		String m = userService.message();
		System.out.println(m);
	}

	public void destroy() {
		System.out.println("destroy...");
	}
}
