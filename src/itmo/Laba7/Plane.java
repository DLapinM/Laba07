package itmo.Laba7;

import java.util.Calendar;

public class Plane
{
    private double length;
    private double velocityMax;
    private double hightOfFlying;

    private Wing leftWing;
    private Wing rightWing;

    public Plane(double length, double velocityMax, double hightOfFlying, double lWingLength, double lWingWidth, int lWingMass, double rWingLength, double rWingWidth, int rWingMass)
    {
        this.length = length;
        this.velocityMax = velocityMax;
        this.hightOfFlying = hightOfFlying;

        this.leftWing = new Wing(lWingLength, lWingWidth, lWingMass);
        this.rightWing = new Wing(rWingLength, rWingWidth, rWingMass);
    }

    public void ShowMassOfWings()
    {
        System.out.println("Масса левого крыла: " + this.leftWing.getMass());
        System.out.println("Масса правого крыла: " + this.rightWing.getMass());
    }

    public class Wing
    {
        private double length;
        private double width;
        private int mass;

        public Wing(double length, double width, int mass)
        {
            this.length = length;
            this.width = width;
            this.mass = mass;
        }

        public int getMass()
        {
            return this.mass;
        }

        public void showMass()
        {
            System.out.println("Масса крыла: " + this.mass + " кг");
        }
    }
}
