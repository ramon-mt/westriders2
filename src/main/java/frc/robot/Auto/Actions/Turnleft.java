package frc.robot.Auto.Actions;

import frc.robot.subsystems.Drive;

public class Turnleft {
  
    Drive mAutoDrive = new Drive();
    

    public void finalMoveForwardAction(){
        Drive.AutoChasis(-0.3, -0.3, 0.3, 0.3);
    }
}
    