/**
 * 
 */
package org.dimigo.inheritance;

import org.dimigo.inheritance.Chinese;
import org.dimigo.inheritance.Japanese;
import org.dimigo.inheritance.Korean;
import org.dimigo.inheritance.Person;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ PersonTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author      : 허고운
 * @version     : 1.0
 */
public class PersonTest {

	public static void main(String[] args) {
		Person a = new Person("Tom");
		System.out.println(a);
		a.getName();
		
		Korean k = new Korean("홍길동");
		System.out.println(k);
		
		
		Japanese j = new Japanese("다나카");
		System.out.println(j);
		a.getName();
		
		Chinese c = new Chinese("왕밍");
		System.out.println(c);
		a.getName();
		
		
		a.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();
		
		a.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();
	
	}







}