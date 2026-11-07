// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  public Intake() {}
    TalonFX Horizontal = new TalonFX(1);
    TalonFX VerticalUp = new TalonFX(0);
    TalonFX VerticalDown = new TalonFX(2);

  public void periodic() {
        // This method will be called once per scheduler run
  }
public void deploy() {

    Horizontal.set(1);
  }
public void retract() {

    Horizontal.set(-1);
  }
public void push(){

  VerticalUp.set(1);
  VerticalDown.set(-1);
  }
public void in(){
  VerticalUp.set(-1);
  VerticalDown.set(1);
  }
}
