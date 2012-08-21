package test;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1;
		
		int count = 10*1000*1000;
		int bingo = 0;
		
		
		for(int n = 0; n < count; n++){
			double x = (Math.random()*2 - 1);
			double y = (Math.random()*2 - 1);
			if (x*x + y*y < a*a) {
				bingo++;
			}
			
		}
		
		double pi = 4*(double)bingo/(double)count ;
		
		
		System.out.println(pi);
	
	}
}
