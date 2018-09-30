package FifthLesson;

import java.io.IOException;

public class ExceptionLesson {
	
	public static void doSome() throws IOException {
		
	}
	
	public static void doOther() {
		try {
			doSome();
		} catch (IOException e) {      // Иерархия от подкласса к родителю.
			                           // IOException------->
			e.printStackTrace();       //------------> Exception
		}                              //
		catch (Exception e){           //
			e.printStackTrace();       //
		}
	}
	
	
	public static void main(String[] args) {
		doOther();
		System.out.println("run!!!");
	}
}
