package frc.robot.Auto.Actions;

import frc.robot.subsystems.Drive;
import frc.robot.subsystems.IntakePelotas;
import frc.robot.subsystems.Tapita;

public class Stop {

    Drive mAutoDrive = new Drive();
    

    public void finalStopAction(){
        Drive.AutoChasis(0, 0, 0, 0);
        Tapita.AutoTapita(0);
        IntakePelotas.AutoIntake(0);
    }
}

