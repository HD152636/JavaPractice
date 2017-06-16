/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

/**
 * <pre>
 * org.dimigo.io
 *   |_ ArakoMenu
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 16.
 * </pre>
 *
 * @author      : 허고운
 * @version     : 1.0
 */
public class ArakoMenu {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			Writer writer = new BufferedWriter(new FileWriter("files/menu.txt"));
				BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"))){
			String result;
			
			// 파일에서 한 줄씩 읽어와서 모니터로 출력하기
			while((result = br.readLine())!= null){
				writer.write(result + "\n");
			}
			
			writer.flush();
			System.out.println("<< 메뉴 출력 >>");
			
			while((result = reader.readLine()) != null){
				System.out.println(result);
			}
		   } catch (Exception e) {
			   e.printStackTrace(); 
			   }
		}
	}



