package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class pivotSubsystem extends SubsystemBase{
    // temporary device ID and motortype
    public final CANSparkMax pivotMotor = new CANSparkMax(6, MotorType.kBrushless);

    public pivotSubsystem() {
        pivotMotor.restoreFactoryDefaults();
    }

    @Override
    public void periodic() {

    }
    
}
