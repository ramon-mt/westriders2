// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.ControlBoard.control;
import frc.robot.subsystems.Drive;
import frc.robot.subsystems.IntakePelotas;
import frc.robot.subsystems.Tapita;
import frc.robot.Auto.Actions.GetTimeAction;
import frc.robot.Auto.Actions.MoveForward;
import frc.robot.Auto.Actions.MoveBackwards;
import frc.robot.Auto.Actions.Stop;
import frc.robot.Auto.Actions.Turnleft;
import frc.robot.Auto.Actions.Turnright;
import frc.robot.Auto.Actions.Eat;
import frc.robot.Auto.Actions.Throw;
import frc.robot.Auto.Actions.Tapdown;
//import frc.robot.Auto.Actions.Tapitilla;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  private Command m_autonomousCommand;
  //PARA QUE SE MUEVA TU CHASIS, CAMBIA LOS ID's
  //Para agregar otros subsistemas sigue el mismo "protocolo que con "Drive" "
  Drive mChasis;
  control mControl;
  IntakePelotas mIntake;
  Tapita mTapita;
  

  GetTimeAction mAutoTimer = new GetTimeAction();
  MoveForward mMoveForward = new MoveForward();
  Stop mStop = new Stop();
  Eat mEat = new Eat();
  MoveBackwards mMoveBackwards = new MoveBackwards();
  Turnleft mTurnleft = new Turnleft();
  Turnright mTurnright = new Turnright();
  Throw mThrow = new Throw();
 // Tapitilla mtapitilla = new Tapitilla();
  Tapdown mTapdown;



  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    // Instantiate our RobotContainer.  This will perform all our button bindings, and put our
    // autonomous chooser on the dashboard.
   
    mChasis = new Drive(); //lo de naranja es el nombre de tus códigos
    mControl = new control();
    mIntake = new IntakePelotas();
    mTapita = new Tapita();
    mTapdown = new Tapdown(mTapita);
  }

  /**
   * This function is called every 20 ms, no matter the mode. Use this for items like diagnostics
   * that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
    // Runs the Scheduler.  This is responsible for polling buttons, adding newly-scheduled
    // commands, running already-scheduled commands, removing finished or interrupted commands,
    // and running subsystem periodic() methods.  This must be called from the robot's periodic
    // block in order for anything in the Command-based framework to work.
    CommandScheduler.getInstance().run();
  }

  /** This function is called once each time the robot enters Disabled mode. */
  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  /** This autonomous runs the autonomous command selected by your {@link RobotContainer} class. */
  @Override
  public void autonomousInit() {
   mAutoTimer.autoRelativeTimeControl();
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {
    mAutoTimer.autoAbsoluteTimeControl();
    double diftime = mAutoTimer.getAbsoluteTimer()-mAutoTimer.getRelativeTimer();

    // Determinamos la etapa basada en el tiempo
    int stage;
    if (diftime < 3) {
        stage = 1;
    } else if (diftime >= 3 && diftime < 4) {
        stage = 2;
    } else if (diftime >= 4 && diftime < 5) {
        stage = 3;
    } else if (diftime >= 5 && diftime < 9) {
        stage = 4;
    } else if (diftime >= 8 && diftime < 10) {
        stage = 5;
    } else if (diftime >= 10 && diftime < 12) {
        stage = 6;
    } else {
        stage = 0;
    }

    // Switch para manejar las acciones por etapa
    switch (stage) {
        case 1:
            mMoveBackwards.finalMoveBackwardAction();
            break;
        case 2:
            mTapdown.finalTapdownAction();
            break;
        case 3:
            mMoveForward.finalMoveForwardAction();
            break;
        case 4:
            mEat.finalEatAction();
            break;
        case 5:
            mTurnright.finalTurnRightAction();
            break;
        case 6:
            mMoveForward.finalMoveForwardAction();
            break;
        default:
            mStop.finalStopAction();
            break;
    }

    ///////////////////////////////Avanzar
    /*if(diftime<2 ){
      mMoveForward.finalMoveForwardAction();
    }
    else{
      mStop.finalStopAction();
    } */


    //////////////////////////////CONO Y COMER
    /*if(diftime<3){
      mMoveBackwards.finalMoveBackwardAction();
    } else{
      mStop.finalStopAction();
    }
    if(diftime>3 && diftime < 4){
      mTapdown.finalTapdownAction();
    } else{
      mStop.finalStopAction();
    }
    if(diftime>4 && diftime < 5){
      mMoveForward.finalMoveForwardAction();
    }else {
      mStop.finalStopAction();
    }
    if(diftime>5 && diftime<9){
      mEat.finalEatAction();
    }else {
      mStop.finalStopAction();
    }
    if(diftime>8 && diftime<10){
      mTurnright.finalTurnRightAction();
    } else {
      mStop.finalStopAction();
    }
    if(diftime>10 && diftime<12){
      mMoveForward.finalMoveForwardAction();
    }else {
      mStop.finalStopAction();
    }*/

    ////////////////////////////////CONO
    /*if(diftime<2){
      mMoveForward.finalMoveForwardAction();
    }
    if(diftime>2 && diftime < 4){
      mTurnright.finalTurnRightAction();
    }
    if(diftime>4 && diftime < 5){
      mMoveForward.finalMoveForwardAction();
    }
    if(diftime>5 && diftime<5.5){
      mTapdown.finalTapdownAction();
    }
    if(diftime>7 && diftime<9){
      mMoveBackwards.finalMoveBackwardAction();
    } else {
      mStop.finalStopAction();
    }*/



  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
   
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    mChasis.avanzar(mControl.left_Y_stick_driver(), mControl.right_X_stick_driver());
    mIntake.activar(mControl.left_Trigger(), mControl.right_Trigger());
    mTapita.tapitear(mControl.left2_Trigger(), mControl.right2_Trigger());
  }

  @Override
  public void testInit() {
    // Cancels all running commands at the start of test mode.
    CommandScheduler.getInstance().cancelAll();
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}

  /** This function is called once when the robot is first started up. */
  @Override
  public void simulationInit() {}

  /** This function is called periodically whilst in simulation. */
  @Override
  public void simulationPeriodic() {}
}
