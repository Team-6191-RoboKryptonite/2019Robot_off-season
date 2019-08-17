/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Drive;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class DriveWithJoystick extends Command {
  public DriveWithJoystick() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.drive);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    //RobotMap.inversion = Robot.drive.inversed(Robot.m_oi.m_stick_drive.getRawButtonPressed(5));

    Robot.drive.inversed(Robot.m_oi.d_A.get(), Robot.m_oi.d_Y.get());
    Robot.drive.drive(Robot.m_oi.m_stick_drive.getRawAxis(3), Robot.m_oi.m_stick_drive.getRawAxis(2),
                     Robot.m_oi.m_stick_drive.getRawAxis(0),Robot.m_oi.m_stick_drive.getRawAxis(4), Robot.m_oi.d_LB.get(), 0.7, RobotMap.inversion);
    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
