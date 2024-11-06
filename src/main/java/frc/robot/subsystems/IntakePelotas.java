package frc.robot.subsystems;
import com.ctre.phoenix6.hardware.TalonFX;


public class IntakePelotas {
    //hardware
    static TalonFX MotorRoller;

    //lógica
    double speed;

    //constructor
    public IntakePelotas(){
    MotorRoller = new TalonFX(0);

    speed = 0; //aquí dejalo 0, solo cambia la speed en funcioness
    }

    //Funciones
    public void nadota(){
        MotorRoller.set(0);
    }

    public void comer(double rtinput){
    if(rtinput>0){
        speed = 1;
    }
    MotorRoller.set(speed);
    }

    public void escupir(double linput){
    if(linput>0){
        speed = -1;
    }
      MotorRoller.set(-speed);
    }
}