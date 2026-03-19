package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name = "TestMotor")
public class TestMotor extends LinearOpMode {

    private DcMotor rear_left;
    private DcMotor front_left;
    private DcMotor rear_right;
    private DcMotor front_right;

    @Override
    public void runOpMode() {

        rear_left = hardwareMap.get(DcMotor.class,"rear_left");
        rear_right = hardwareMap.get(DcMotor.class,"rear_right");
        front_left = hardwareMap.get(DcMotor.class,"front_left");
        front_right = hardwareMap.get(DcMotor.class,"front_right");

//        rear_left.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();

        rear_left.setPower(1);
        rear_right.setPower(1);
        front_left.setPower(1);
        front_right.setPower(1);
        sleep(6000);
        rear_left.setPower(0);
        rear_right.setPower(0);
        front_left.setPower(0);
        front_right.setPower(0);
    }
}