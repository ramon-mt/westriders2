package frc.robot.Auto.Actions;

import frc.robot.subsystems.Tapita;

public class Tapitilla {
    Tapita mAutoTapita = new Tapita();
    

    public void finalTapitillaAction(){
        mAutoTapita.AutoTapita(-0.05);
}
}