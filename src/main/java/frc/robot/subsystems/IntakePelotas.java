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
    public void activar(double leftTrigg, double rightTrigg){
        speed = leftTrigg - rightTrigg;
        MotorRoller.set(TalonSRXControlMode.PercentOutput, speed);
    MotorRoller.set(ControlMode.PercentOutput, speed);
    }







    //AUTONOMO
   public static void AutoIntake(double realintakespeedM1){
    MotorRoller.set(ControlMode.PercentOutput, +realintakespeedM1);
}
}