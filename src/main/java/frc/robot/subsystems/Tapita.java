package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;


public class Tapita {
    
    
        //hardware
        static CANSparkMax MotorTapita;
        
        //lógica
        double speed;
    
        //constructor
        public Tapita(){
            MotorTapita = new CANSparkMax(6, MotorType.kBrushless);
            speed = 0; //aquí dejalo 0, solo cambia la speed en funcioness
        }
    
        //Funciones
        public void nadota(){
            MotorTapita.set(0);
        }
    
        /*public void tapitear(boolean yput, boolean aput){
        if(yput=true){
            speed = 0.3;
        }else if(aput=true){
            speed = -0.3;
        } else{
            speed = 0;
        }   
        MotorTapita.set(speed);*/

        public void tapitear(double leftTrigg, double rightTrigg){
        speed = leftTrigg - rightTrigg;
        MotorTapita.set(speed);
    MotorTapita.set(speed);
    }
    







        //AUTONOMO
   public static void AutoTapita(double realtapitaspeedM1){
    MotorTapita.set(realtapitaspeedM1);
}
    }