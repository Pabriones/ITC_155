import java.awt.*;

public class assignment1 {

	public assignment1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawingpanel panel = new Drawingpanel(500, 500);
        Graphics g = panel.getGraphics();
        // Set background color to yellow
        panel.setBackground(Color.YELLOW);
        
      //create 2 blue circles
        g.setColor(Color.BLUE);
        g.fillOval(80, 100, 100, 100);
        g.fillOval(300, 100, 100, 100);
        
        // inner red fill
        g.setColor(Color.RED);
        g.fillRect(125, 150, 230, 200);
        

        // black line in between the red rectangle
        g.setColor(Color.BLACK);
        g.drawLine(125,250,354,250);
        
        
	}

}
