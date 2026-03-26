package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

@TeleOp
//@Disabled
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
            double leftPower;
            double rightPower;

            drive = gamepad1.left_stick_y;
            turn = gamepad1.right_stick_x;

            leftPower = Range.clip(drive + turn,-1.0,1.0);
            rightPower = Range.clip(drive - turn,-1.0,1.0);

            rearLeft.setPower(leftPower);
            frontLeft.setPower(leftPower);
            rearRight.setPower(rightPower);
            frontRight.setPower(rightPower);

            telemetry.addData("Drive","(%.2f)",drive);
            telemetry.addData("Turning","(%.2f)",turn);
            telemetry.addData("Left wheels power calculated:","(%.2f)",leftPower);
            telemetry.addData("Right wheels power calculated:","(%.2f)",rightPower);
            telemetry.update();
        }
    }
}