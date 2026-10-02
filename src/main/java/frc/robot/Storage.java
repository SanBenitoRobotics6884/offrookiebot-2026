// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Storage extends SubsystemBase {
  TalonFX Spinny;
  public Storage() {
    Spinny = new TalonFX(2);
  }

  @Override
  public void periodic() {
  }
    public void forward(){

    Spinny.set(1);
  }
  public void Backward(){

    Spinny.set(-1);
  }
}
