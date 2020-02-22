/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.controls.OI;
import frc.robot.subsystems.ObjectDetectionSystem;
import frc.robot.subsystems.ColorMotorSystem;
import frc.robot.subsystems.DriveSystem;
import frc.robot.subsystems.SolenoidSystem;
import frc.robot.subsystems.BrosiusIsAMotor;
import frc.robot.subsystems.Shooter;

/*
  The Robot Class.
  This is technically your true 'Main' class.
  Every classes that you program must go in here for it to run.
*/
public class Robot extends TimedRobot 
{
  // ColorMotorSystem colorMotorSystem;
  ObjectDetectionSystem objectDetectionSystem;
  // DriveSystem driveSystem;
  // BrosiusIsAMotor bruhMomento;

  @Override
  public void robotInit() 
  {

   // objectDetectionSystem = new ObjectDetectionSystem();
    // colorMotorSystem = new ColorMotorSystem();
    // bruhMomento = new BrosiusIsAMotor();
  }

  //An automatic update method, provided by WPILIB
  //Runs every cycle/loop/tick
  @Override
  public void teleopPeriodic() 
  {
    OI.update();

    DriveSystem.update();
        
    //objectDetectionSystem.update();
    Shooter.update();
    // bruhMomento.update();
  }
}
