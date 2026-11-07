// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.SwerveModulePosition;
import edu.wpi.first.math.kinematics.SwerveModuleState;
import edu.wpi.first.math.controller.PIDController;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.swerve.SwerveModule;
import com.ctre.phoenix6.hardware.CANcoder;
/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class Swerve{
  private final TalonFX;

//Make basic tank drive and then name the motor after the drive motor
private final Steer TalonFX;

//Make basic tank drive and then name the motor after the steer motor
private final CANcoder absoluteEncoder;

private final PIDController steerPID = new PIDController(1.5, 0, 0);


public SwerveModule(int driveID, int steerID, int encoderID, Rotation2d offset) {
    this. driveMotor = new TalonFX(driveID); 
    this. steerMotor = new TalonFX(steerID);
    this. absoluteEncoder = new CANcoder(encoderID);
    this.angleOffset = offset;
  
  steerPID.enableContinuousInput(-Math.PI, Math.PI);
  }


public SwerveModulePosition getPosition() {
    double distanceMeters = driveMotor.getPosition().getValueAsDouble() * Constants.DriveConversionFactor;
    Return new SwerveModulePosition(distanceMeters, getAbsoluteAngle());
  }
  //replace driveID and encoderID with actual id's later

publicRotation2d getAbsoluteAngle(){
  double radians = Math.toRadians(absoluteEncoder.getAbsolutePosition().getValueAsDouble() * 360);

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
