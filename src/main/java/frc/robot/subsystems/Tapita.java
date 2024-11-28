package frc.robot.subsystems;
import com.ctre.phoenix6.hardware.TalonFX;

public class Tapita {
    
    
        //hardware
        static TalonFX MotorTapita;
    
        //lógica
        double speed;
    
        //constructor
        public Tapita(){
        MotorTapita = new TalonFX(0);
    
        speed = 0; //aquí dejalo 0, solo cambia la speed en funcioness
        }
    
        //Funciones
        public void nadota(){
            MotorTapita.set(0);
        }
    
        public void abrir(boolean yput){
        if(yput=true){
            speed = 1;
        }
        MotorTapita.set(speed);
        }
    
        public void cerrar(boolean aput){
        if(aput=true){
            speed = -1;
        }
          MotorTapita.set(-speed);
        }
    }

