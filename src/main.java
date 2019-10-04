package indexx;

import java.awt.EventQueue;

public class main {
	
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpageWWe frame = new loginpageWWe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});
		
	}

}
