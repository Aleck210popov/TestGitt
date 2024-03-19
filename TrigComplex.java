package com.javauser.narfu.one;

public class TrigComplex {
    private double radius;
    private double arg;
    {
        this.radius=0;
        this.arg=0;
    }
    TrigComplex(){

    }
    TrigComplex(double radius){
        this.radius=0;
    }
    TrigComplex(double radius, double arg) {
        this.radius=radius;
        this.arg=arg;
    }

    @Override
    public String toString() {
        return String.format("%.2f", radius) + " * (cos(" + String.format("%.2f", arg) + ") + i * sin(" + String.format("%.2f",arg) + "))";
    }
    public String equals(TrigComplex a) {
        boolean isEquals =  this.radius == a.radius && this.radius == a.arg;
        return isEquals ? "Равны" : "Не равны";
    }
    public TrigComplex add(TrigComplex a) {
        double realPart = this.radius * Math.cos(this.radius) + a.radius * Math.cos(a.arg);
        double imaginaryPart = this.radius * Math.sin(this.arg) + a.radius * Math.sin(a.arg);
        double modulus = Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
        double argument = Math.atan2(imaginaryPart, realPart);
        return new TrigComplex(modulus, argument);
    }
    public TrigComplex sub(TrigComplex a) {
        double realPart = this.radius * Math.cos(this.arg) - a.radius * Math.cos(a.arg);
        double imaginaryPart = this.radius * Math.sin(this.arg) - a.radius * Math.sin(a.arg);
        double modulus = Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
        double argument = Math.atan2(imaginaryPart, realPart);
        return new TrigComplex(modulus, argument);
    }
    public TrigComplex mult(TrigComplex a) {
        double modulus = this.radius * a.radius;
        double argument = this.arg + a.arg;
        return new TrigComplex(modulus, argument);
    }
    public TrigComplex div(TrigComplex a) {
        double modulus = this.radius / a.radius;
        double argument = this.arg - a.arg;
        return new TrigComplex(modulus, argument);
    }
    public TrigComplex pow(double a) {
        double modulus = Math.pow(this.radius, a);
        double argument = this.arg * a;
        return new TrigComplex(modulus, argument);
    }
    public Complex toAlgebraic() {
        double realPart = radius * Math.cos(arg);
        double imaginaryPart = radius * Math.sin(arg);
        return new Complex(realPart, imaginaryPart);
    }

    // set, get
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setArg(double arg) {
        this.arg = arg;
    }

    public double getArg() {
        return arg;
    }

    public double getRadius() {
        return radius;
    }
}
