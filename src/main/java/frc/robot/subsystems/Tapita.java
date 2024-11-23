package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Tapita {
    //hardware
        static TalonSRX tapa;
    
    //logica
        double speed;
    
    //constructor
    public Tapita(){
        tapa = new TalonSRX(0);

        speed = 0;
    }
        
    //Funciones
    public void tapota(boolean abierto){
    if(abierto == true){
        speed = 1;
        }
    else{
        speed = 0;
    }
    }

       
    }   


