/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
        // ADD THE PORT NUMBERS TO CONSTANTS

        public static final class DriveConstants {
            public static final int kLeftDriveMotor1Port = 0;
            public static final int kLeftDriveMotor2Port = 15;
            public static final int kRightDriveMotor1Port = 3;
            public static final int kRightDriveMotor2Port = 12;

            // pistons that change the gear of the drive train
            public static final int kDriveSolenoid = 7;
    
            public static final double kWheelDiameter = 0; // ADD UNIT OF MEASUREMENT

            public static final double kEncoderDistancePerPulse = 0; // ADD CONVERSION
            public static final double kEncoderSpeedPerPulse = 0; // ADD CONVERSION
        }
    
        public static final class LauncherConstants {
            public static final int kRightLauncherMotorPort = 13;
            public static final int kLeftLauncherMotorPort = 14;

            public static final double kEncoderSpeedPerPulse = 1; // ADD CONVERSION
    
            // piston (double solenoid) that adjusts the angle of the launcher
            public static final int kLongLaunchSolenoidPort = 3;
            public static final int kShortLaunchSolenoidPort = 4;
        }
    
        public static final class IntakeConstants {
           
            public static final int kIntakeMotorPort = 7;
            
            // piston (double solenoid) that raises and lowers the intake
            public static final int kIntakeRaiseSolenoidPort = 5;
            public static final int kIntakeLowerSolenoidPort = 2;
        }
    
        public static final class LoadingConstants {

            // beam breakers detect the number of powercells in the cellevator
            public static final int kBeamBreakOutput1Port = 0;
            public static final int kBeamBreakOutput2Port = 0;

            // motors in cellevator that transport powercells to launcher
            public static final int kLowCellevatorMotorPort = 5;
            public static final int kHighCellevatorMotor2Port = 8;

            // motors in ramp that transport powercells from intake to cellevator
            public static final int kLoadingMotorPort = 6;

        }
    
        public static final class ControlPanelConstants {
    
            public static final int kSpinnerMotorPort = 9; // motor for the wheel that spins the control panal

            public static final int kColorSensorPort = 0; // Color sensor that senses the colors on the control panel
        }
    
        public static final class HangerConstants {
    
            public static final int kRightHangerMotorPort = 2;
            public static final int kLeftHangerMotorPort = 1;

            public static final int kFrictionSolenoidPort = 6; // piston that applies the friction brake on the hanging elevator
        }
    
        public static final class LimeLightConstants {
    
        }
    
    }
