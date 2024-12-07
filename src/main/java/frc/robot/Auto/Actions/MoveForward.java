package frc.robot.Auto.Actions;
import frc.robot.subsystems.Drive;

public class MoveForward {
    Drive mAutoDrive = new Drive();
    

    public void finalMoveForwardAction(){
        Drive.AutoChasis(0.30, 0.3, 0.3, 0.3);
    }
    
    
}
