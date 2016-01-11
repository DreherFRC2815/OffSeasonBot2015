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
	public static Solenoid[] solenoid= new Solenoid[2];
	public Piston(){
		solenoid[0] = new Solenoid(RobotMap.solenoid[0]);
		solenoid[1] = new Solenoid(RobotMap.solenoid[1]);
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
    public static void operate(boolean b, boolean c){
    	if(b){
    		solenoid[0].set(true);
    	}else if(c){
    		solenoid[1].set(false);
    	}
    }
}

