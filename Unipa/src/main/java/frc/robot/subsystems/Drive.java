/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.Drive.DriveWithJoystick;

/**
 * Add your docs here.
 */
public class Drive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public void drive(double Speed, double Rotation){

    double Rspd = Speed * -1 - Rotation;
    double Lspd = Speed * -1 + Rotation;
    if(Speed == 0){
      RobotMap.m_robotDrive.arcadeDrive(0, Rotation * 0.5);
    }else{
      RobotMap.m_robotDrive.tankDrive(Lspd * 0.5, Rspd * 0.5);
    }
    

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveWithJoystick());
  }
}
