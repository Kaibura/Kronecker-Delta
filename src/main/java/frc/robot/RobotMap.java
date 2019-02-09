/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
 





  // Motor Ports
  public static int leftMotorPortTop = 2;
  public static int leftMotorPortBottom = 3;

  public static int rightMotorPortTop = 0;
  public static int rightMotorPortBottom = 1;  



  // Ramp Motor Ports
  public static int rampMotorPort = 4;
  // Ramp Controls
  public static int rampUp = 5;
  public static int rampDown = 3;



  // Solenoid Ports
  public static int forwardSolenoidPort = 3;
  public static int backwardSolenoidPort = 4;

  public static int sForwardButton = 11;
  public static int sReverseButton = 12;
  public static int sOffButton = 7;



  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
