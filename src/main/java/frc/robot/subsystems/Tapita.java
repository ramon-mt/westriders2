<<<<<<< Updated upstream
package frc.robot.subsystems;
import com.ctre.phoenix6.hardware.TalonFX;
=======
package frc.robot.subsystems;   
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
>>>>>>> Stashed changes

public class Tapita {
    
    
        //hardware
        static TalonFX MotorTapita;
    
        //lógica
        double speed;
    
<<<<<<< Updated upstream
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
=======
    //constructor
    public Tapita(){
        tapa = new TalonSRX(6);

        speed = 0;
    }
        
    //Funciones
    public void tapota(boolean abierto){
    if(abierto == true){
        speed = 1;
>>>>>>> Stashed changes
        }
    }

