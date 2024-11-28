package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


public class IntakePelotas {
    //hardware
    static TalonSRX MotorRoller;

    //lógica
    double speed;

    //constructor
    public IntakePelotas(){
    MotorRoller = new TalonSRX(5);

    speed = 0; //aquí dejalo 0, solo cambia la speed en funcioness
    }

    //Funciones
    public void nadota(){
        MotorRoller.set(ControlMode.PercentOutput,0);
    }

    public void comer(double rtinput){
    if(rtinput>0){
        speed = 1;
    }
    MotorRoller.set(ControlMode.PercentOutput,speed);
    }

    public void escupir(double linput){
    if(linput>0){
        speed = -1;
    }
      MotorRoller.set(ControlMode.PercentOutput,-speed);
    }
}