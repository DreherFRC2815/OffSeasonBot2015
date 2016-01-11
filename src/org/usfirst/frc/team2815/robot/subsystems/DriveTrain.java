package org.usfirst.frc.team2815.robot.subsystems;

import org.usfirst.frc.team2815.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	static Victor[] rightMotors = new Victor[2];
	static Victor[] leftMotors = new Victor[2];
	static double lTarget;
	static double rTarget;
	
	public DriveTrain(){
		rightMotors[0] = new Victor(RobotMap.rightMotors[0]);
		rightMotors[1] = new Victor(RobotMap.rightMotors[1]);
		leftMotors[0] = new Victor(RobotMap.leftMotors[0]);
		leftMotors[1] = new Victor(RobotMap.leftMotors[1]); 
	}
	public static void setMotorsToValue(double lS, double rS){
		leftMotors[0].set(lS);
		leftMotors[1].set(lS);
		rightMotors[0].set(rS);
		rightMotors[1].set(rS);
	}
	public static void tankDrive(double lS, double rS){
		
		setMotorsToValue(lS, rS);
		
	}
	
	public static void arcadeDrive(double ySpeed, double turnVal ){
		lTarget = (ySpeed + turnVal );
		rTarget = (ySpeed - turnVal);
		
		setMotorsToValue(lTarget, rTarget);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

