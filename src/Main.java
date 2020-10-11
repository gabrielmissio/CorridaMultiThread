public class Main {

	public static void main(String args[]) {
			
      for(int num = 0; num < 10; num++) {
    	  Coelho coelho = new Coelho("Coelho " + String.valueOf(num+1));
    	  coelho.start();
      }
   }   

}
