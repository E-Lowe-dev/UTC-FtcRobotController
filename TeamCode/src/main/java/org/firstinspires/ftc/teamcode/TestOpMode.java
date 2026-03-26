package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
// Disabled removes the OpMode as an option on the driver station
@Disabled
public class TestOpMode extends LinearOpMode {

    @Override
    public void runOpMode() {
        // Show simple print statement
        telemetry.addData("Hello", "World");
        telemetry.update();

        // Wait for driver to press 'start'
        waitForStart();
        while (opModeIsActive()) {
            telemetry.addData("Running", "Robot!");
            telemetry.update();
        }
    }
}