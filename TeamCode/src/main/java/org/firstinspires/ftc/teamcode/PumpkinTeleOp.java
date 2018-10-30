package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import Hardware.Controller.Controller;

@TeleOp(name="Pumpkin", group="TeleOp")
public class PumpkinTeleOp extends LinearOpMode {

    private DcMotor motorFR;
    private DcMotor motorFL;
    private DcMotor motorBL;
    private DcMotor motorBR;
    Controller controller;

    @Override
    public void runOpMode() throws InterruptedException {
        motorFR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motorFL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motorBL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motorBR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        motorFR = hardwareMap.dcMotor.get("motorFR");
        motorFL = hardwareMap.dcMotor.get("motorFL");
        motorBL = hardwareMap.dcMotor.get("motorBL");
        motorBR = hardwareMap.dcMotor.get("motorBR");

        waitForStart();

        while(opModeIsActive()) {
            while(controller.y.isPressed.value()) {
                motorFR.setPower(1.0);
                motorFL.setPower(1.0);
                motorBL.setPower(1.0);
                motorBR.setPower(1.0);
            }
            while(controller.a.isPressed.value()) {
                motorFR.setPower(-1.0);
                motorFL.setPower(-1.0);
                motorBL.setPower(-1.0);
                motorBR.setPower(-1.0);
            }
            while(controller.x.isPressed.value()) {
                motorFR.setPower(1.0);
                motorFL.setPower(-1.0);
                motorBL.setPower(-1.0);
                motorBR.setPower(1.0);
            }
            while(controller.b.isPressed.value()) {
                motorFR.setPower(-1.0);
                motorFL.setPower(1.0);
                motorBL.setPower(1.0);
                motorBR.setPower(-1.0);
            }
        }

    }
}
