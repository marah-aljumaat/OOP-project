import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;  

class ShapeDrawer extends JFrame {
    private String shapeType;
    private double param1, param2, param3, param4;

    public ShapeDrawer(String shapeType, double param1, double param2, double param3, double param4) {
        this.shapeType = shapeType;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;

        setTitle("Şekil Çizimi: " + shapeType);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);

        switch (shapeType) {
            case "Daire":
                g.drawOval(150, 150, (int) (param1 * 10), (int) (param1 * 10));
                break;
            case "Üçgen":
                g.drawPolygon(new int[]{200, (int) (200 - param1 * 5), (int) (200 + param1 * 5)},
                        new int[]{100, (int) (100 + param2 * 10), (int) (100 + param2 * 10)}, 3);
                break;
            case "Dikdörtgen":
                g.drawRect(150, 150, (int) (param1 * 10), (int) (param2 * 10));
                break;
            case "Kare":
                g.drawRect(150, 150, (int) (param1 * 10), (int) (param1 * 10));
                break;
        }
    }
}
