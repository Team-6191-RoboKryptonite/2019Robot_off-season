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
  
  /**
   * Function for drive, use curvatureDrive
	 * @param SpeedF Axis to go ahead.
   * @param SpeedB Axis to go Back.
   * @param Rotation Axis to turn around.
   * @param isQuickTurn set true if you want to Quick.
   * @param mult the limit of speed.
   * @param turn the cargo and panel side inversed.
	 */
  public void drive(double SpeedF, double SpeedB, double Rotation, double smallRotation, boolean isQuickTurn, double mult, int turn){

    // double Rspd = Speed * -1 - Rotation;
    // double Lspd = Speed * -1 + Rotation;
    // if(Speed == 0){
    //   RobotMap.m_robotDrive.arcadeDrive(0, Rotation * 0.5);
    // }else{
    //   RobotMap.m_robotDrive.tankDrive(Lspd * 0.5, Rspd * 0.5);
    // }
    if(SpeedF > 0.3 && SpeedB == 0){
      RobotMap.m_robotDrive.curvatureDrive(SpeedF * mult * turn, Rotation * mult, isQuickTurn);
    }else if(SpeedF == 0 && SpeedB > 0.3){
      RobotMap.m_robotDrive.curvatureDrive(SpeedB * mult * turn * -1 , Rotation * mult, isQuickTurn);
    }else if(Rotation != 0){
      RobotMap.m_robotDrive.arcadeDrive(0, Rotation * mult); 
    }else if(smallRotation != 0){
      RobotMap.m_robotDrive.arcadeDrive(0, smallRotation * mult * 0.7);
    }else{
      RobotMap.m_robotDrive.stopMotor();
    }

  }

  public void inversed(boolean cargo, boolean panel){

    if(cargo){
      RobotMap.inversion = -1;
    }else if(panel){
      RobotMap.inversion = 1;
    }
    else{
    }
  }


   
  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveWithJoystick());
  }
}
