package projectA17;

public class Outter1 {
	String field = "OutterA-field";
    void method() {
    	System.out.println();
    }
    
    class Nested{
    	String field = "Nested-field";
    	void method() {
    		System.out.println("Nested-method");
    	}
    	void print() {
    		System.out.println(this.field);
    		this.method();
    		System.out.println(Outter1.this.field);
    		Outter1.this.method();
    	}
    }
	
}
