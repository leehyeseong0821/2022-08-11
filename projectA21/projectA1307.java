package projectA21;

interface RemoteControl{
	public void turnOn();
	public void turnOff();
}

class AnonymousA{
	
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
			
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
			
		}
		
	};
	
	void method() {
		//지역변수 
	   RemoteControl localVar = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("Audio를 켭니다.");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("Audio를 끕니다.");
			
		}
	};
	localVar.turnOn();
 }
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}


public class projectA1307 {

	public static void main(String[] args) {
		AnonymousA anony = new AnonymousA();
		anony.field.turnOn();
		anony.method();
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");
				
			}
		});
		
		
	}

}
