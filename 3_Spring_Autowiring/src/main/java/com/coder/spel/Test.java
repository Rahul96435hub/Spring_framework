package com.coder.spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/coder/spel/config.xml");
		Student st = context.getBean("student", Student.class);
		//System.out.println(st.num);
		System.out.println(st.result);
		
		
		SpelExpressionParser parser = new SpelExpressionParser();
		Expression e  = parser.parseExpression(" 'Hello World' ");
		System.out.println(e.getValue());
	}

}
