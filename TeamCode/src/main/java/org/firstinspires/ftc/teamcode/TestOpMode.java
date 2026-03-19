package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
//@Disabled
public class TestOpMode extends LinearOpMode {

    @Override
    public void runOpMode() {
        telemetry.addData("Hello", "World");
        telemetry.update();

        waitForStart();
        while (opModeIsActive()) {
            telemetry.addData("Running", "Robot!");
            telemetry.update();
        }
    }
}