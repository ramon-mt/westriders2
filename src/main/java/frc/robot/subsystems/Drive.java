package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

public class Drive {
    //hardware (importa con link)
     static TalonFX MotorDerechoAtras; //mencionas tus motores
     static TalonFX MotorDerechoAdelante;
     static TalonFX MotorIzquierdoAtras;
     static TalonFX MotorIzquierdoAdelante;

    
    // variables de lógica
    double speed;

    double rightspeed;
    double leftspeed;

    double realrightspeed;
    double realleftspeed;

    //constructor (define valores a tus objetos)
    public Drive(){//public + el nombre de tu clase
    MotorDerechoAtras = new TalonFX(0);  //(el numero dentro del paréntesis depende del número que tenga el controlador (spark))
    MotorDerechoAdelante = new TalonFX(1);
    MotorIzquierdoAtras = new TalonFX(2);
    MotorIzquierdoAdelante = new TalonFX(3);

    //creo que aquí dejas speed 0, solo cambia en funciones
    speed = 0; //velocidad de tu motor
    realleftspeed = 0; //lo ocupas para los sticks que mueven tus motores
    realrightspeed = 0; //lo ocupas para los sticks que mueven tus motores
    }

    //funciones
    public void stop(){ //void significa que el código no debe devolver nada
    MotorDerechoAtras.set(0); //mismo número de velocidad de tu motor
    MotorDerechoAdelante.set(0);
    MotorIzquierdoAtras.set(0);
    MotorIzquierdoAdelante.set(0);
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
    MotorDerechoAtras.set(realrightspeed); //los dos motores del mismo lado siempre con el mismo sentido (signo) 
    MotorDerechoAdelante.set(realrightspeed);
    MotorIzquierdoAtras.set(-realleftspeed); //se necesitan que estén en negativos para que puedan avanzar recto
    MotorIzquierdoAdelante.set(-realleftspeed);
    }
}

