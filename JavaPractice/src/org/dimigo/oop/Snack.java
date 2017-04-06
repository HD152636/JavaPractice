/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Snack
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author      : 허고운
 * @version     : 1.0
 */
public class Snack {
	private String name;
	private String company;
	private int price;
	private int number;
	
	public Snack(){}
	public Snack(String name, String company, int price, int number) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString(){
		return "이름 :"+name+"\n제조사 : "+company+"\n가격:"+price+"원\n개수:"+number+"개";
	}
	public int calcPrice(){
		return this.number*this.price;
	}
	
}
