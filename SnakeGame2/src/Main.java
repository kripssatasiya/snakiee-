import javax.swing.JFrame;


public class Main extends JFrame {
	Main() {
    	super("Snake_Game🐍");
    	add(new Board());
		pack();

	    
	    setResizable(false);
	    setLocationRelativeTo(null);
	}
	
	
    public static void main(String [] args) {
		
		new Main().setVisible(true);
		
	}
}
