/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.CellevatorConstants;
import frc.robot.subsystems.Cellevator;

public class CellevatorLoaderMotor extends CommandBase {
  
  private final Cellevator m_cellevator;
  /**
   * Creates a new CellevatorLoader.
   */
  public CellevatorLoaderMotor(Cellevator cellevator) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_cellevator = cellevator;
    addRequirements(m_cellevator);
  }

  /** 
   * sets a boolean to true if the loader motor can run 
  */
  private boolean isSafeToLoad() {
    //if there is no power cell at the bottom of the cellevator and the gap is clear in the middle then the loader motor can run
    boolean middleIsClear = !m_cellevator.isBottomBallPresent() && m_cellevator.isMiddleGapClear();
    
    return middleIsClear;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  /** 
   * Every time the command is called run the loader motor if it is safe to load the power cell into the cellevator
  */
  @Override
  public void execute() {
    if (isSafeToLoad()) { 
      m_cellevator.runLoaderMotor(CellevatorConstants.kLoaderMotorSpeed);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_cellevator.stopLoaderMotor();

    
  }

  // Returns true when it is not safe to load so that the motor stops
  @Override
  public boolean isFinished() {
    return !isSafeToLoad();
    }
}
