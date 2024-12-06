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
    public double right_X_stick_driver(){
        double xValue = Chasis.getRightX(); //getLeftX significa que accedes al objeto, este te regresa el número o valor del eje que le pongas
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
        double right_TriggerValue = Mecanismos.getRightTriggerAxis(); //getLeftX significa que accedes al objeto, este te regresa el número o valor del eje que le pongas
        if(Math.abs(right_TriggerValue)<tolerance){ //Math.abs() se pone para que sea con valor absoluto y tmb te acepte los negativos del stick
            right_TriggerValue = 0;
        }
        return right_TriggerValue;
    }

    public double left2_Trigger(){
        double left_TriggerValue = Chasis.getLeftTriggerAxis(); //getLeftX significa que accedes al objeto, este te regresa el número o valor del eje que le pongas
        if(Math.abs(left_TriggerValue)<tolerance){ //Math.abs() se pone para que sea con valor absoluto y tmb te acepte los negativos del stick
            left_TriggerValue = 0;
        }
        return left_TriggerValue;
    }

    public double right2_Trigger(){
        double right_TriggerValue = Chasis.getRightTriggerAxis(); //getLeftX significa que accedes al objeto, este te regresa el número o valor del eje que le pongas
        if(Math.abs(right_TriggerValue)<tolerance){ //Math.abs() se pone para que sea con valor absoluto y tmb te acepte los negativos del stick
            right_TriggerValue = 0;
        }
        return right_TriggerValue;

    /*public boolean boton_Y(){
        boolean boton_YValue = Mecanismos.getYButtonPressed();
        boton_YValue = true;

    return boton_YValue;
    }

    public boolean boton_A(){
        boolean boton_AValue = Mecanismos.getAButtonPressed();
        boton_AValue = true;
        
        return boton_AValue;
    }*/

    
    //Importas tu objeto al Robot.java
//ahhh
}
}

    

