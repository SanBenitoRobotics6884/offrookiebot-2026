// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class intake extends SubsystemBase {
  TalonFX motor;
  TalonFX motow;
  TalonFX motother;
  /** Creates a new intake. */
  public intake() {
  motor = new TalonFX(1);
  motow = new TalonFX(2);
  motother = new TalonFX(3);
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
}


  public void deploy(){
    motor.set(1);
  }

  public void retract(){
    motor.set(-1);
  }

  public void in() {
    motow.set(2);
    motother.set(-2);
  }

  public void out() {
    motow.set(-2);
    motother.set(2);
  }
}
