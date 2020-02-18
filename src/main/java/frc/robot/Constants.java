/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.util.Color;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class DriveConstants {
        public static final int kLeftDriveMotor1Port = 2;
        public static final int kLeftDriveMotor2Port = 3;
        public static final int kRightDriveMotor1Port = 36;
        public static final int kRightDriveMotor2Port = 1;

        // pistons that shift the gear of the drive train
        public static final int kDriveSolenoid = 7;

        public static final double kWheelDiameter = 6; // Inches

        // Gearing for calculations, given in output turns per motor turn
        private static final double kHighGear = 14.0/58.0 * 18.0/38.0 * 32.0/34.0;
        private static final double kLowGear = 14.0/58.0 * 18.0/38.0 * 22.0/44.0;

        // Conversions to calculate inches per encoder pulse in high gear
        public static final double kHighGearDistancePerPulse = Math.PI * kWheelDiameter * kHighGear;
        // Conversions to calculate inches/second per encoder pulse in high gear
        public static final double kHighGearSpeedPerPulse = kHighGearDistancePerPulse / 60;

        // Conversions to calculate distance per encoder pulse in high gear
        public static final double kLowGearDistancePerPulse = Math.PI * kWheelDiameter * kLowGear;
        // Conversions to calculate speed per encoder pulse in high gear
        public static final double kLowGearSpeedPerPulse = kLowGearDistancePerPulse / 60;

        // Constants to define which side of the drivetrain is "inverted"
        public static final boolean kLeftSideInverted = true;
        public static final boolean kRightSideInverted = !kLeftSideInverted;

        // Current limit for the drivetrain motors in amps
        public static final int kDrivetrainCurrentLimit = 60;

            // Constants for DriveDistance.
        // TODO: Update these constants with the correct values.
        public static final double kMaxSpeed = 0; // Inches per second
        public static final double kMaxAcceleration = 0; // Inches per (second^2)

        public static final double kS = 0;  //TODO: Test for values
        public static final double kV = 0;  //TODO: Test for values
        public static final double kA = 0;  //TODO: Test for values


        // PointTurn constants
        public static final class PointTurnPID {
            // Our PID values for PointTurn
            public static final double kP = 0.0; // TODO: Test and update this value.
            public static final double kI = 0.0; // TODO: Test and update this value.
            public static final double kD = 0.0; // TODO: Test and update this value.

            // Degrees away from setpoint at which PointTurn can end
            public static final double kPositionTolerance = 0.5; //Degrees

            // Maximum angular speed in degrees per second at which PointTurn can end
            public static final double kVelocityTolerance = 1.0; // TODO: Update this value.
        }

        // Drive Distance constants
        public static final class DriveDistancePID {
            // Our PID values for PointTurn
            public static final double kP = 0.0; // TODO: Test and update this value
            public static final double kI = 0.0; // TODO: Test and update this value.
            public static final double kD = 0.0; // TODO: Test and update this value.

            // Degrees away from setpoint at which PointTurn can end
            public static final double kPositionTolerance = 1.0; // TODO: Update this value.

            // Maximum angular speed in degrees per second at which PointTurn can end
            public static final double kVelocityTolerance = 1.0; // TODO: Update this value.

            //max velocity in meters per second
            public static final double kMaxVelocity = 0.0; //TODO: update
    
            //max velocity in meters per second squared
            public static final double kMaxAcc = 0.0; //TODO: update
        }
    }

    public static final class LauncherConstants {
        public static final int kRightLauncherMotorPort = 9;
        public static final int kLeftLauncherMotorPort = 8;

        // piston (double solenoid) that adjusts the angle of the launcher
        public static final int kLongLaunchSolenoidPort = 3;
        public static final int kShortLaunchSolenoidPort = 4;

        // used in inverting launcher motor
        public static final boolean kInvertLeftLauncher = false;
        public static final boolean kInvertRightLauncher = !kInvertLeftLauncher;

        // The two different speeds for the set shooting locations.
        public static final double kLaunchSpeed1 = 0; // TODO: test and update this value
        public static final double kLaunchSpeed2 = 0; // TODO: test and update this value

        // PID constants for the launcher
        public static final class LaunchPID {
            //Our PID values for the Launcher
            public static final double kP = 0; // TODO: test and update this value
            public static final double kI = 0; // TODO: test and update this value
            public static final double kD = 0; // TODO: test and update this value

            // Integral zone, which is the maximum |error| for the integral gain to take effect
            public static final double kIz = 0; // TODO: test and update this value

            // Feed-forward constant
            public static final double kF = 0; // TODO: test and update this value

            // Min and max output values
            public static final double kMinOutput = -1;
            public static final double kMaxOutput = 1;
        }


    }

    public static final class IntakeConstants {
        public static final int kIntakeMotorPort = 4;

        // piston (double solenoid) that raises and lowers the intake
        public static final int kIntakeRaiseSolenoidPort = 5;
        public static final int kIntakeLowerSolenoidPort = 2;

        public static final double kIntakeMotorSpeed = 1.0; // TODO: Change if needed
    }

    public static final class HopperConstants {
        public static final int kHopperMotorPort = 5;
        public static final double kHopperMotorSpeed = 1.0; // TODO: Change if needed.
    }

    public static final class CellevatorConstants {
        // beam breakers detect the number of powercells in the cellevator
        public static final int kBeamBreakLoaderPort = 1; // TODO: Port Numbers possibly need to be updated
        public static final int kBeamBreakMiddlePort = 3;
        public static final int kBeamBreakHolderPort = 5;

        // motors in cellevator that transport powercells to launcher
        public static final int kHolderMotorPort = 13;
        public static final int kLoaderMotorPort = 14;

        // Define if a motor is inverted or not
        public static final boolean kHolderMotorInverted = false;
        public static final boolean kLoaderMotorInverted = false;

        // Define the current limit for the celevator motors
        public static final int kCellevatorCurrentLimit = 45;

        // the constant speed for the holder motor
        public static final double kHolderMotorSpeed = 0.5; // TODO: Update if needed
        
        //speed for the loader Motor
        public static final double kLoaderMotorSpeed = 0.5; //TODO: Update if needed
       
    }

    public static final class PartyConstants {

        // DIO port number constants for the two LED Blinkin Drivers
        public static final int kLedBlinkinDriverPort = 10;

        // Each possible LED mode correlates to a value for the Spark, as defined in the Rev Blinkin docs
        public static final double kRainbowParty = -0.97;           // Pattern: Rainbow, Pallete: Party
        public static final double kNormal = 0.53;                  // Color 1 and 2: Color Waves set as normal
        public static final double kRed = 0.61;                     // Solid Color: Red
        public static final double kOrange = 0.65;                  // Solid Color: Orange
        public static final double kGreen = 0.71;                   // Solid color: Green
        public static final double kYellow = 0.69;                  // Solid color: Yellow
        public static final double kHeartbeatBlue = -0.23;          // Fixed Pallete Pattern: Heartbeat, Blue
        public static final double kPink = 0.57;                    // Solid Color: Hot Pink
        public static final double kViolet = 0.91;                  // Solid Color: Violet
        public static final double kStrobeGold = -0.07;             // Fixed Pallete Pattern: Strobe Gold
        public static final double kStrobeWhite = -0.05;            // Fixed Pallete Pattern: Strobe White
        public static final double kWhite = 0.93;                   // Solid Color: White
        public static final double kBlack = 0.99;                   // Solid Color: Black
        public static final double kGray = 0.95;                    // Solid Color: Gray
    }

    public static final class ControlPanelConstants {
        // Motor for the wheel that spins the control panal
        public static final int kSpinnerMotorPort = 6;

        // Color sensor that senses the colors on the control panel
        public static final int kColorSensorPort = 0;

        // The main speed of the control panel motor.
        public static final double kCountRevSpeed = 0.4; // TODO Update with testing
        // The speed to run when seeking color
        public static final double kFindColorSpeed = 0.18; // TODO Update with testing

        /** Values the color sensor uses to detect the colors on control panel */
        // Red
        public static final double kRedTargetR = 0.476;
        public static final double kRedTargetG = 0.376;
        public static final double kRedTargetB = 0.15;
        // Yellow
        public static final double kYellowTargetR = 0.381;
        public static final double kYellowTargetG = 0.545;
        public static final double kYellowTargetB = 0.136;
        // Green
        public static final double kGreenTargetR = 0.18;
        public static final double kGreenTargetG = 0.568;
        public static final double kGreenTargetB = 0.249;
        // Blue
        public static final double kBlueTargetR = 0.15;
        public static final double kBlueTargetG = 0.4467;
        public static final double kBlueTargetB = 0.40;
        // Colors
        public static final Color kRedTarget = new Color(kRedTargetR, kRedTargetG, kRedTargetB);
        public static final Color kYellowTarget = new Color(kYellowTargetR, kYellowTargetG, kYellowTargetB);
        public static final Color kGreenTarget = new Color(kBlueTargetR, kBlueTargetG, kBlueTargetB);
        public static final Color kBlueTarget = new Color(kGreenTargetR, kGreenTargetG, kGreenTargetB);

        // The confidence threshold for a given color
        public static final double kConfidence = 0.9; // TODO determine ideal confidence from testing
    }

    public static final class ClimberConstants {
        // Gearing for calculations, given in output turns per motor turn
        private static final double kGearing = 10.0/58.0 * 16.0/60.0;

        // Conversion for distance and speed per encoder pulse, given in inches
        public static final double kEncoderDistancePerPulse = 0; // ADD CONVERSION
        public static final double kEncoderSpeedPerPulse = kEncoderDistancePerPulse / 60;

        public static final int kRightClimberMotorPort = 15;
        public static final int kLeftClimberMotorPort = 12;

        // piston that applies the friction brake on the climbing motors
        public static final int kFrictionSolenoidPort = 6;

        // Set the constants to invert the left and right climber motors
        public static final boolean kRightClimberMotorInverted = true;
        public static final boolean kLeftClimberMotorInverted = !kRightClimberMotorInverted;

        // Define the speeds for up and down climbing
        public static final double kClimbUpSpeed = 0.5; // TODO Determine best speed
        public static final double kClimbDownSpeed = -0.5; // TODO Determine best speed

        // Define the maximum height of the climber
        public static final double kMaxHeight = 0.0; // TODO Determine max height
    }

    public static final class LimelightConstants {
        // Values used to calculate target location
        public static final double kLimelightOffset = 13.67; // In inches
        public static final double kLimelightHeight = 43; // In inches
        public static final double kLimelightAngle = 48; // In degrees
        public static final double kPortHeight = 98.25; // In inches

        // Alignment PID constants for Limelight
        public static final double kLimelightAlignP = 1.0;
        public static final double kLimelightAlignI = 0.0;
        public static final double kLimelightAlignD = 0.0;
        public static final double kLimelightAlignSpeedTolernce = 1.0;
        public static final double kLimelightAlignPositionTolerance = 0.5;
        public static final double kSteeringAdjust = 0.25;

        // Distance PID constants for Limelight
        public static final double kLimelightDistanceP = 1.0;
        public static final double kLimelightDistanceI = 0.0;
        public static final double kLimelightDistanceD = 0.0;
        public static final double kLimelightDistance = 50.0;
        public static final double kLimelightDistanceTolerance = 5.0;
    }
    
    public static final class ControllerConstants {
        public static final int kDriverControlPort = 0;
        public static final int kWeaponsControlPort = 1;

    }

    }


