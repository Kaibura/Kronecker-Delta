/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
 
public class RampSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public Victor rampMotor = new Victor(RobotMap.rampMotorPort);

  public void forwardMotor() {
    rampMotor.set(0.25);
  }

  public void reverseMotor() {
    rampMotor.set(-0.25);
  }
  
  public void turnOffMotor() {
    rampMotor.set(0);
  }
  // public void rampControl(double up, double down) {
      
  // }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new MotorOff());
  }
}
