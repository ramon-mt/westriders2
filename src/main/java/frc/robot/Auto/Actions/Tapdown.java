package frc.robot.Auto.Actions;
import frc.robot.subsystems.Tapita;

public class Tapdown {
    Tapita mAutoTapita = new Tapita();
    

    public void finalTapdownAction(){
        Tapita.AutoTapita(-0.05);
    }
}
