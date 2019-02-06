/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.PneumaticJoystickCommand;





/**
 * Add your docs here.
 */
   public class PneumaticsSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  DoubleSolenoid solenoid = new DoubleSolenoid(RobotMap.forwardSolenoidPort, RobotMap.backwardSolenoidPort);
  Compressor c = new Compressor(0);

   public void enableForward() {
    solenoid.set(Value.kForward);
   }

   public void enableReverse(){
     solenoid.set(Value.kReverse);
   }

   public void off(){
     solenoid.set(Value.kOff);
   }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new PneumaticJoystickCommand());
  }
}
