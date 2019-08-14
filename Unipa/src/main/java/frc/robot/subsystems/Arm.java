/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.Arm.ArmWithJoystick;

/**
 * Add your docs here.
 */
public class Arm extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  /**
   * 
   * @param power power.
   * @param mult the limit of speed.
   */
  public void arm(double power, double mult){
    if(power < 0){
      RobotMap.arm_panel.set(power * (mult-0.2));
    }else{
      RobotMap.arm_panel.set(power * mult);
    }
  }

  public void push(boolean open, boolean close){
     if(open)
     {
        RobotMap.cylinder.set(true);
    }
    else if(close)
    {
        RobotMap.cylinder.set(false);
    }
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ArmWithJoystick());
  }
}
