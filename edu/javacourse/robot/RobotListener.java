package edu.javacourse.robot;

public interface RobotListener
{
    public static final String NAME = "Robot listener";

    public void startMove(double x, double y);

    public void endMove(double x, double y);
}
