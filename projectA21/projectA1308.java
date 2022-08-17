package projectA21;

class ButtonA{
	
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		this.listener.onClick();
	}
	
	interface OnClickListener{
	
		void onClick();
	}
}
     
class WindowA {
	ButtonA button1 = new ButtonA();
	ButtonA button2 = new ButtonA();
	
	ButtonA.OnClickListener listener = new ButtonA.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
			
		}
	};
	WindowA(){
		button1.setOnClickListener(listener);
		
		button2.setOnClickListener(new ButtonA.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
				
			}
		});
	}
}


public class projectA1308 {

	public static void main(String[] args) {
		 WindowA w = new WindowA();
		 w.button1.touch();
		 w.button2.touch();

	}

}
