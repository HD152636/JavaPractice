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
public class PersonTest2{
	
	private static void greeting(Person p){
		System.out.println(p.toString());
		p.sayHello();
		p.sayBye();
		System.out.println();
	}
	public static void main(String[] args) {
		
		
		Person[] t= {
				new Person("Tom"),
				new Korean("한국인"),
				new Japanese("일본인"),
				new Chinese("중국인")
		};
		for(Person p1 : t){
			
			greeting(p1);
		}
		

	}







}