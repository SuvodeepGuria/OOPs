//import java.applet.Applet;
import java.applet.Applet;
import java.awt.Graphics;

public class MessageApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        // Display a message in the applet window
        g.drawString("Hello, Welcome to Java Applet!", 50, 100);
    }
}