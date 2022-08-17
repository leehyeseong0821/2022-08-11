package projectA17;

public class Outter {
//         java 7이전 
	public void method1(final int arg){
		final int localVariable =1;
       class Inner{
    	   public void method() {
    		   int result = arg+localVariable;
    	   }
       }
	}
//	java 8이후 
	public void method2(int arg){
	final int localVariable =1;
    class Inner{
 	   public void method() {
 		   int result = arg+localVariable;
 	   }
    }
	}


}
