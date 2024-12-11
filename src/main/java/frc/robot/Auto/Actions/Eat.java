package frc.robot.Auto.Actions;
import frc.robot.subsystems.IntakePelotas;

public class Eat {
    IntakePelotas mAutoIntake = new IntakePelotas();
    

    public void finalEatAction(){
        IntakePelotas.AutoIntake(0.6);
    }
}
