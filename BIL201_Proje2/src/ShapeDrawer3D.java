import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Graphics;
class ShapeDrawer3D extends JFrame {
    private String shapeType;
    private double param1, param2, param3;

    public ShapeDrawer3D(String shapeType, double param1, double param2, double param3) {
        this.shapeType = shapeType;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;

        setTitle("3D Şekil Çizimi: " + shapeType);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.drawString("3D çizim: " + shapeType, 250, 300);
        
        if ("Küre".equals(shapeType)) {
            g.setColor(Color.BLUE);
            int diameter = (int) (param1 * 2); 
            g.fillOval(200, 200, diameter, diameter);
            g.setColor(Color.BLACK);
            g.drawOval(200, 200, diameter, diameter);
        }
    }
}
