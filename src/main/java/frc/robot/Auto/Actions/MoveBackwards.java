package frc.robot.Auto.Actions;

import frc.robot.subsystems.Drive;

public class MoveBackwards {
    Drive mAutoDrive = new Drive();
    

    public void finalMoveBackwardAction(){
        Drive.AutoChasis(0.3,0.3, 0.3, 0.3);
    }
}
