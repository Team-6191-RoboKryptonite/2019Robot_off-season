/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
//import edu.wpi.first.wpilibj.SPI;
//import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Solenoid;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  
  public static WPI_TalonSRX wheel_l;
  public static WPI_TalonSRX wheel_r;
  public static WPI_VictorSPX wheel_l_2;
  public static WPI_VictorSPX wheel_r_2;
  public static DifferentialDrive m_robotDrive;
  
  public static WPI_TalonSRX lift_one;
  public static WPI_TalonSRX lift_two;
  public static SpeedControllerGroup lift;
  
  public static WPI_VictorSPX intake_l;
  public static WPI_VictorSPX intake_r;
  public static SpeedControllerGroup intake;
  
  public static WPI_VictorSPX arm_panel;

  public static Solenoid cylinder_l;
  public static Solenoid cylinder_r;

  public static ADXRS450_Gyro gyro;

  public static int inversion;
    
  public static double Kp = 0.07;
  public static double Ki = 0.00;
  public static double Kd = 2000;

  static UsbCamera camera0;
  static UsbCamera camera1;
  



/**
* This function is run when the robot is first started up and should be
* used for any initialization code.
*/

  public static void init() {


    camera0 = CameraServer.getInstance().startAutomaticCapture(0);
    camera1 = CameraServer.getInstance().startAutomaticCapture(1);
    camera0.setResolution(160, 120);
    camera1.setResolution(160, 120);
    wheel_l = new WPI_TalonSRX(3);
    wheel_r = new WPI_TalonSRX(1);
    wheel_l_2 = new WPI_VictorSPX(3);
    wheel_r_2 = new WPI_VictorSPX(0);
    wheel_r_2.follow(wheel_r);
    wheel_l_2.follow(wheel_l);
    m_robotDrive = new DifferentialDrive(wheel_l,wheel_r);
    
    lift_one = new WPI_TalonSRX(4);
    lift_two = new WPI_TalonSRX(0);
    lift = new SpeedControllerGroup(lift_one, lift_two);
    
    arm_panel = new WPI_VictorSPX(5);
    cylinder_l= new Solenoid(0);
    cylinder_r= new Solenoid(1);
    intake_l = new WPI_VictorSPX(1);
    intake_r = new WPI_VictorSPX(6);
    intake_l.setInverted(true);
    intake = new SpeedControllerGroup(intake_l, intake_r);
    inversion = 1;
  }
}
