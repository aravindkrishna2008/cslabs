import java.awt.*;
import javax.swing.*;

/**
  Creates
 * 
 * @author Aravind the parralel line optical illusion
 * @version Period 1
 */
public class ParallelLines
  extends JPanel
{
  // TODO Your Instance Variables Here

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              // to paint the background

    int width = getWidth();
    int height = getHeight();

    drawIllusion(g, width, height);
  }


  /**
   * TODO Write your method description here.
   * 
   * @param g
   * @param width
   * @param height
   * @param size
   */
  public void drawIllusion(Graphics g, int width, int height)
  {
    for (int row = 0; row < 25; row++)
    {
      // calculate the start of the row of squares
      // calculate and add a horizontal offset

      g.drawLine(0, row * 35, 700, row * 35);

      for (int col = 0; col < 14; col++)
      {
        if (col % 2 == 0)
        {
          g.setColor(Color.BLACK);
        }
        else
        {
          g.setColor(Color.WHITE);
        }

        if (row % 2 == 0)
        {
          g.fillRect(col * 35, row * 35, 35, 35);
        }
        else
        {
          g.fillRect(col * 35 + 17, row * 35, 35, 35);
        }
      }
      g.setColor(Color.BLACK);
      g.drawLine(0, row * 35, 700, row * 35);
    }
  }


  public static void main(String[] args)
  {
    JFrame w = new JFrame("ParallelLines");
    w.setBounds(100, 100, 640, 480);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ParallelLines panel = new ParallelLines();
    panel.setBackground(Color.WHITE);
    Container c = w.getContentPane();
    c.add(panel);
    w.setResizable(true);
    w.setVisible(true);
  }
}
