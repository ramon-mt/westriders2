package frc.robot.ControlBoard; //nombres de carpeta NO llevan ".java"

import javax.swing.BorderFactory;

import edu.wpi.first.wpilibj.XboxController;

public class control {
    XboxController Chasis;
    XboxController Mecanismos;

    //logica
    double tolerance;

    //Constructor
    public control(){
        //control a chasis puerto 0, a mecanismos puerto 1
        Chasis = new XboxController(0);
        Mecanismos = new XboxController(1);
         //también declaras cuál es la tolerancia
         tolerance = 0.15;
    }

    //Funciones
    public double left_X_stick_driver(){
        double xValue = Chasis.getLeftX(); //getLeftX significa que accedes al objeto, este te regresa el número o valor del eje que le pongas
        if(Math.abs(xValue)<tolerance){ //Math.abs() se pone para que sea con valor absoluto y tmb te acepte los negativos del stick
            xValue = 0;
        }
        return xValue;
    }

    public double left_Y_stick_driver(){
        double yValue = Chasis.getLeftY(); //getLeftX significa que accedes al objeto, este te regresa el número o valor del eje que le pongas
        if(Math.abs(yValue)<tolerance){ //Math.abs() se pone para que sea con valor absoluto y tmb te acepte los negativos del stick
            yValue = 0;
        }
        return yValue;
    }

     public double left_Trigger(){
        double left_TriggerValue = Mecanismos.getLeftTriggerAxis(); //getLeftX significa que accedes al objeto, este te regresa el número o valor del eje que le pongas
        if(Math.abs(left_TriggerValue)<tolerance){ //Math.abs() se pone para que sea con valor absoluto y tmb te acepte los negativos del stick
            left_TriggerValue = 0;
        }
        return left_TriggerValue;
    }

    public double right_Trigger(){
        double right_TriggerValue = Mecanismos.getLeftTriggerAxis(); //getLeftX significa que accedes al objeto, este te regresa el número o valor del eje que le pongas
        if(Math.abs(right_TriggerValue)<tolerance){ //Math.abs() se pone para que sea con valor absoluto y tmb te acepte los negativos del stick
            right_TriggerValue = 0;
        }
        return right_TriggerValue;
    }

    public boolean boton_B(){
        boolean boton_BValue = Mecanismos.getBButtonPressed();
        boton_BValue = true;

    return boton_BValue;
    }

    public boolean boton_B2(){
        boolean boton_BValue2 = Mecanismos.getBButtonReleased();
        boton_BValue2 = false;
        
        return boton_BValue2;
    }
    //Importas tu objeto al Robot.java

}

    

