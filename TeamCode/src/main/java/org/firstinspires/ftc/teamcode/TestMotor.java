package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name = "TestMotor")
public class TestMotor extends LinearOpMode {

    private DcMotor rearLeft;
    private DcMotor frontLeft;
    private DcMotor rearRight;
    private DcMotor frontRight;

    @Override
    public void runOpMode() {
        // Get wheel motors from robots hardware map
        rearLeft = hardwareMap.get(DcMotor.class,"rear_left");
        rearRight = hardwareMap.get(DcMotor.class,"rear_right");
        frontLeft = hardwareMap.get(DcMotor.class,"front_left");
        frontRight = hardwareMap.get(DcMotor.class,"front_right");

        double wheelPower = 0.5;

        // One sides wheel spin must be reversed so the robot moves forward
        rearRight.setDirection(DcMotor.Direction.REVERSE);
        frontRight.setDirection(DcMotor.Direction.REVERSE);

        // Wait for driver to press 'start'
        waitForStart();

        // Set wheels to constant wheel power - see if possible to set at the same time
        rearLeft.setPower(wheelPower);
        rearRight.setPower(wheelPower);
        frontLeft.setPower(wheelPower);
        frontRight.setPower(wheelPower);
        // Run wheels for 6 seconds
        sleep(6000);
        // Turn off wheels
        rearLeft.setPower(0);
        rearRight.setPower(0);
        frontLeft.setPower(0);
        frontRight.setPower(0);
    }
}