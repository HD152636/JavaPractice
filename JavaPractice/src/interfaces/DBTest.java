/**
 * 
 */
package interfaces;

/**
 * <pre>
 * interfaces
 *   |_ DBTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author      : 허고운
 * @version     : 1.0
 */
public class DBTest {

	public static void main(String[] args) {
		IDBManager db = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		IDBManager db1 = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		System.out.println("< 변경 전 >");
		crude(db);
		System.out.println();
		System.out.println("< 변경 후 >");
		crude(db1);
		}
	private static void crude(IDBManager db){
		db.insert();

		db.search();

		db.update();

		db.delete();
		
	}
	

}
