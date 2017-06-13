/**
 * 
 */
package org.dimigo.collection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <pre>
 * org.dimigo.collection
 *   |_ MelonGenreChart
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 *
 * @author      : 허고운
 * @version     : 1.0
 */
public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String,List<Music>> map = new HashMap<>();
		List<Music> balladArraylist = new ArrayList<Music>();
		List<Music> danceArraylist = new ArrayList<>();
		
		System.out.println("<<멜론 장르별 차트>>");
		map.put("발라드", balladArraylist);
		map.put("댄스", danceArraylist);
		balladArraylist.add(new Music("팔레트","아이유"));
		danceArraylist.add(new Music("I LUV IT","싸이"));
		danceArraylist.add(new Music("맞지?","언니쓰"));
		printMap(map);
		
		System.out.println("--<<댄스 2위 곡 변경>>--");
		map.get("댄스").set(1, new Music("SIGNAL", "트와이스"));
		
		printMap(map);
		
		System.out.println("--<<댄스 1위 곡 삭제>>--");
		map.get("댄스").remove(0);
		printMap(map);
		
		System.out.println("--<< 전체 리스트 삭제>>--");
		map.clear();
		printMap(map);
	}
		
		public static void printMap(Map<String, List<Music>> map){
			for(String a : map.keySet())
			{
				System.out.println("["+a+"]");
				for(Music b : map.get(a))
				{
					System.out.print(map.get(a).indexOf(b)+1);
					System.out.println(". "+b);
				}
			}
			System.out.println();
		
		
		
	}

}
