package edu.javacourse.robot.ui;

import edu.javacourse.robot.Robot;
import edu.javacourse.robot.RobotLine;
import java.awt.Graphics;
import javax.swing.JComponent;

public class RobotPathComponent extends JComponent
{
    private Robot robot;

    public RobotPathComponent(Robot robot)
    {
        this.robot = robot;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for (RobotLine rl : robot.getLines())
        {
            int x1 = (int) Math.round(rl.getX1());
            int y1 = (int) Math.round(rl.getY1());
            int x2 = (int) Math.round(rl.getX2());
            int y2 = (int) Math.round(rl.getY2());

            g.drawLine(x1, y1, x2, y2);
        }
    }
}
