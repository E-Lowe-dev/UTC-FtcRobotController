package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp
@Disabled
public class GamepadControl extends LinearOpMode {
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor rearLeft;
    private DcMotor rearRight;
    private DcMotor frontLeft;
    private DcMotor frontRight;

    @Override
    public void runOpMode() {
        rearLeft = hardwareMap.get(DcMotor.class,"rear_left");
        rearRight = hardwareMap.get(DcMotor.class,"rear_right");
        frontLeft = hardwareMap.get(DcMotor.class,"front_left");
        frontRight = hardwareMap.get(DcMotor.class,"front_right");

        waitForStart();
        runtime.reset();
        while (opModeIsActive()) { // runs until 'stop' is pressed
            float drive;
            float turn;

            drive = gamepad1.left_stick_y;
            turn = gamepad1.right_stick_x;

            telemetry.addData("Drive","(%.2f)",drive);
            telemetry.addData("Turning","(%.2f)",turn);
            telemetry.update();
        }
    }
}