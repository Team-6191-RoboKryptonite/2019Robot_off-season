/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.Lift.LiftWithAxis;

/**
 * Add your docs here.
 */
public class Lift extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.et


  /**
   * 
   * @param Speedup
   * @param Speeddown
   * @param mult
   */
  public void lift(double SpeedUp,double SpeedDown, double mult){

    // double Rspd = Speed * -1 - Rotation;
    // double Lspd = Speed * -1 + Rotation;
    // if(Speed == 0){
    //   RobotMap.m_robotDrive.arcadeDrive(0, Rotation * 0.5);
    // }else{
    //   RobotMap.m_robotDrive.tankDrive(Lspd * 0.5, Rspd * 0.5);
    // }
    if(SpeedUp > 0.3 && SpeedDown == 0){
      RobotMap.lift.set(SpeedUp * mult);
    }else if(SpeedUp == 0 && SpeedDown > 0.3){
      RobotMap.lift.set(-1 * SpeedDown * (mult - 0.1));
    }else{
      RobotMap.lift.set(0);
    }
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new LiftWithAxis());
  }
}
