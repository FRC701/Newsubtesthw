// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.MotorAlignmentValue;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  
  private TalonFX TungTung;

  private TalonFX PopDemonHunters;

  /** Creates a new Intake. */
  public Intake() {

    TungTung = new TalonFX(Constants.Intake.kTungTung);
    PopDemonHunters = new TalonFX(Constants.Intake.kPopDemonHunters);
   
    TungTung.setControl(
      new Follower(PopDemonHunters.getDeviceID(), MotorAlignmentValue.Opposed)
    );

  }
public void spinIntake() {
    PopDemonHunters.setVoltage(5);

}
public void stopIntake(){
  PopDemonHunters.setVoltage(0);
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
