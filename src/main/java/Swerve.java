// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.SwerveModulePosition;
import edu.wpi.first.math.kinematics.SwerveModuleState;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.math.controller.PIDController;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.swerve.SwerveModule;
import com.ctre.phoenix6.hardware.CANcoder;
/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class Swerve extends SubsystemBase{
//Make basic drive and then name the motor after the drive motor
  private TalonFX steerMotor;
  private TalonFX driveMotor;

  private Rotation2d angleOffset;

//Make basic tank drive and then name the motor after the steer motor
private CANcoder absoluteEncoder;

private final PIDController steerPID = new PIDController(1.5, 0, 0);


public void SwerveModule(int driveID, int steerID, int encoderID, Rotation2d offset) {
    this. driveMotor = new TalonFX(driveID); 
    this. steerMotor = new TalonFX(steerID);
    this. absoluteEncoder = new CANcoder(encoderID);
    this. angleOffset = offset;
  
  steerPID.enableContinuousInput(-Math.PI, Math.PI);
  }


public SwerveModulePosition getPosition() {
    double distanceMeters = driveMotor.getPosition().getValueAsDouble() * /* Constants.DriveConversionFactor */ 10;
    return new SwerveModulePosition(distanceMeters, getAbsoluteAngle());
  }
  //replace driveID and encoderID with actual id's later

  public Rotation2d getAbsoluteAngle(){
    double radians = Math.toRadians(absoluteEncoder.getAbsolutePosition().getValueAsDouble() * 360);
    return new Rotation2d(radians);
  }



  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
