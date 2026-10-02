// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class storage extends SubsystemBase {
  /** Creates a new storage. */
  public storage() {
    TalonFX motor;
    TalonFX motow;
    TalonFX motother;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  
  TalonFX Moto = new TalonFX(1);

}
}
