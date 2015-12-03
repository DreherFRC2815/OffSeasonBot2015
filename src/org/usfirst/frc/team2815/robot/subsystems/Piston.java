package org.usfirst.frc.team2815.robot.subsystems;

import org.usfirst.frc.team2815.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Piston extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Solenoid solenoid = new Solenoid(RobotMap.solenoid);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
}

