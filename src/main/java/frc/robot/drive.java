// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class drive extends SubsystemBase {

  TalonFX nanananamoto;

  TalonFX nananamoto;

  TalonFX nanamoto;

  TalonFX namoto;
// nanananamoto and nanamoto are on the right(2 & 4); nananamoto and namoto is on the left(1 & 3)

  public drive() {
      nanananamoto = new TalonFX(1);
      nananamoto = new TalonFX(2);
      nanamoto = new TalonFX(3);
      namoto = new TalonFX(4);
    }

    public void forwardDrive() {
    nanananamoto.set(1);
    nananamoto.set(1);
    nanamoto.set(1);
    namoto.set(1);
    }

    public void stopDrive() {
    nanananamoto.set(0);
    nananamoto.set(0);
    nanamoto.set(0);
    namoto.set(0);
    }

    public void backwardDrive() {
    nanananamoto.set(-1);
    nananamoto.set(-1);
    nanamoto.set(-1);
    namoto.set(-1);
    }

    public void leftDrive() {
    nanananamoto.set(1);
    nananamoto.set(-1);
    nanamoto.set(1);
    namoto.set(-1);
    }

    public void rightDrive() {
    nanananamoto.set(-1);
    nananamoto.set(1);
    nanamoto.set(-1);
    namoto.set(1);
    }

    public Command forwardDriveCommand() {
      
    }
}
