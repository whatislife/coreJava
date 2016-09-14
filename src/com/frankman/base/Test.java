package com.frankman.base;

public class Test {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		
		Student stu1 = new Student();
		stu1.setName("frankman");
		stu1.setPwd("123");
		stu1.setAge("12");
		Student stu2 = new Student();
		stu2 = (Student) stu1.clone();
		stu2.setAge("23");
		System.out.println(stu1.getAge());
		System.out.println(stu2.getAge());
		
		
		String a = "hello2";  
		final String b = "hello";
		String d = "hello";
		String c = b + 2;  
		String e = d + 2;
		System.out.println((a == c));
		System.out.println((a.equals(e)));
		System.out.println(a);
		System.out.println(e);
		
	}
}
