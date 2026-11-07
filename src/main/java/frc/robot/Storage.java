// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Storage extends SubsystemBase {
  TalonFX m_TalonFX = new TalonFX(1);
TalonFX m_TalonFX2 = new TalonFX(2);
TalonFX m_TalonFX3 = new TalonFX(1);
TalonFX m_TalonFX4 = new TalonFX(1);
  public Storage() {
  }

  @Override
  public void periodic() {
    
  }
  public void storageout(){
    m_TalonFX.set(1); 
  }
}