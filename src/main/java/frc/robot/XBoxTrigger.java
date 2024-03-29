/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * Add your docs here.
 */
public class XBoxTrigger extends Button {
    Joystick stick;
    int axis;
    
    

    public XBoxTrigger(Joystick joystick, int axis) {
        this.stick = joystick;
        this.axis = RobotMap.TriggerAxis;
    }

    public double getTriggerValue() {
        return stick.getRawAxis(RobotMap.TriggerAxis);
    }

    @Override
    public boolean get() {
        return stick.getRawAxis(RobotMap.TriggerAxis) > 0.15;
    }

}
