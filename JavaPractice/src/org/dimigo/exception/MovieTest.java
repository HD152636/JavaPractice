/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ MovieTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 *
 * @author      : 허고운
 * @version     : 1.0
 */
public class MovieTest {
	
	public static void main(String[] args) {
		
		Movie[]movies = {
				new Movie("에이리언:커버넌트",15),
				new Movie("가디언스 오브 갤럭시", 12)
	
		};
		int age = 13;
		for(Movie movie : movies){
			try {
				movie.buyTicket(age);
				System.out.println(movie.getTitle()+" 즐감하세요.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
