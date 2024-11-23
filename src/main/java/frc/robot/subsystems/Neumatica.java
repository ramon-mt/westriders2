package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;


public class Neumatica {
    //hardware
    static Compressor compresor;
    static Solenoid solenoide;
    

    //lógica
    boolean piston;

    //constructor
    public Neumatica(){
    compresor = new Compressor(0, PneumaticsModuleType.CTREPCM);
    solenoide = new Solenoid(0, PneumaticsModuleType.CTREPCM, 0);

    piston = false;
    }

    //Funciones
    public void pitona (boolean botonpicado){ 
      if(botonpicado == false){
       solenoide.set(false);
      }
      else{
        solenoide.set(true);
      }
    }


    }
