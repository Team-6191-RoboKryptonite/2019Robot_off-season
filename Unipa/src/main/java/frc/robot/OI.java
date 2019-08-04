/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  public Joystick m_stick_control;
  public Joystick m_stick_drive;
  
  public JoystickButton A;
  public JoystickButton B;
  public JoystickButton X;
  public JoystickButton Y;
  public JoystickButton LB;
  public JoystickButton RB;
  public JoystickButton Start;
  public JoystickButton Back;

  public JoystickButton d_A;
  public JoystickButton d_B;
  public JoystickButton d_X;
  public JoystickButton d_Y;
  public JoystickButton d_LB;
  public JoystickButton d_RB;
  public JoystickButton d_Start;
  public JoystickButton d_Back;


  public OI(){
    
    m_stick_control = new Joystick(0);
    m_stick_drive = new Joystick(1);
    A = new JoystickButton(m_stick_control, 1);
    B = new JoystickButton(m_stick_control, 2);
    X = new JoystickButton(m_stick_control, 3);
    Y = new JoystickButton(m_stick_control, 4);
    LB = new JoystickButton(m_stick_control, 5);
    RB = new JoystickButton(m_stick_control, 6);
    Start = new JoystickButton(m_stick_control, 7);
    Back = new JoystickButton(m_stick_control, 8);

    d_A = new JoystickButton(m_stick_drive, 1);
    d_B = new JoystickButton(m_stick_drive, 2);
    d_X = new JoystickButton(m_stick_drive, 3);
    d_Y = new JoystickButton(m_stick_drive, 4);
    d_LB = new JoystickButton(m_stick_drive, 5);
    d_RB = new JoystickButton(m_stick_drive, 6);
    d_Start = new JoystickButton(m_stick_drive, 7);
    d_Back = new JoystickButton(m_stick_drive, 8);

  }
  // // CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  // // joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
