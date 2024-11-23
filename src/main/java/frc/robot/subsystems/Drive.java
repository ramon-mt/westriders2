package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


public class Drive {
    //hardware (importa con link)
     static TalonSRX MotorDerechoAtras; //mencionas tus motores
     static TalonSRX MotorDerechoAdelante;
     static TalonSRX MotorIzquierdoAtras;
     static TalonSRX MotorIzquierdoAdelante;

    
    // variables de lógica
    double speed;

    double rightspeed;
    double leftspeed;

    double realrightspeed;
    double realleftspeed;

    //constructor (define valores a tus objetos)
    public Drive(){//public + el nombre de tu clase
    MotorDerechoAtras = new TalonSRX(0);  //(el numero dentro del paréntesis depende del número que tenga el controlador (spark))
    MotorDerechoAdelante = new TalonSRX(1);
    MotorIzquierdoAtras = new TalonSRX(2);
    MotorIzquierdoAdelante = new TalonSRX(3);

    //creo que aquí dejas speed 0, solo cambia en funciones
    speed = 0; //velocidad de tu motor
    realleftspeed = 0; //lo ocupas para los sticks que mueven tus motores
    realrightspeed = 0; //lo ocupas para los sticks que mueven tus motores
    }

    //funciones
    public void stop(){ //void significa que el código no debe devolver nada
    MotorDerechoAtras.set(ControlMode.PercentOutput,0); //mismo número de velocidad de tu motor
    MotorDerechoAdelante.set(ControlMode.PercentOutput,0);
    MotorIzquierdoAtras.set(ControlMode.PercentOutput, 0);
    MotorIzquierdoAdelante.set(ControlMode.PercentOutput, 0);
    }

    public void avanzar(double yinput, double xinput){
    if(yinput < 0){
        rightspeed = yinput+xinput; //dependiendo del stick que muevas y hacia dónde, avanza adelante o atrás
        leftspeed= yinput-xinput;
    }
    else{
        rightspeed = yinput-xinput; //lo mismo de arriba, pero se invierten los signos
        leftspeed= yinput+xinput;
    }
    realleftspeed= leftspeed; //no quieres que se opere directamente, por eso va afuera de la condicional. que siempre sea el valor que se dió antes
    realrightspeed = rightspeed;
    MotorDerechoAtras.set(ControlMode.PercentOutput, realrightspeed); //los dos motores del mismo lado siempre con el mismo sentido (signo) 
    MotorDerechoAdelante.set(ControlMode.PercentOutput, realrightspeed);
    MotorIzquierdoAtras.set(ControlMode.PercentOutput, -realleftspeed); //se necesitan que estén en negativos para que puedan avanzar recto
    MotorIzquierdoAdelante.set(ControlMode.PercentOutput, -realleftspeed);
    }
}

