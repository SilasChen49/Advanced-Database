import java.util.Scanner;

public class Database {
	private static final int sizeOfFive=1000;
	private static final int sizeOfTen=2000;
	
	//To sort the relation employees
	static void sortEmployees(){
		
	}
	
	//To sort the relation Projects
	static void sortProjects(){
		
	}
	
	static void join(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		//size is 5MB
		if ((Runtime.getRuntime().totalMemory() / 1024) < 7000)	
			size = sizeOfFive;
		else	//size is 10MB
			size = sizeOfTen;
		
		Block[] block = new Block[size];
		sortEmployees();
		sortProjects();
		join();
	}

}
