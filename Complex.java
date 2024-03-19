package com.javauser.narfu.one;

public class Complex {
    private double realPart;
    private double imaginaryPart;
    {
        this.realPart=0;
        this.imaginaryPart=0;
    }
    public Complex(){

    }
    public Complex(double realPart) {
        this.realPart=realPart;
    }
    public Complex(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        return (imaginaryPart>0 ? String.format("%.2f",realPart) + " + " + String.format("%.2f", imaginaryPart) + "i" : imaginaryPart==0 ? String.format("%.2f",realPart) : String.format("%.2f",realPart) + " - " + String.format("%.2f", Math.abs(imaginaryPart))  + "i");
    }
    public String equals(Complex a) {
        boolean isEquals = (this.realPart == a.realPart) && (this.imaginaryPart == a.imaginaryPart);
        return isEquals ? "Равны" : "Не равны";
    }
    public Complex sum(Complex a){
        return new Complex(this.realPart+a.realPart,this.imaginaryPart+a.imaginaryPart);
    }
    public Complex sub(Complex a){
        return new Complex(this.realPart-a.realPart,this.imaginaryPart-a.imaginaryPart);
    }
    public Complex mult(Complex a){
        double rP = this.realPart*a.realPart-this.imaginaryPart*a.imaginaryPart;
        double iP = this.realPart*a.imaginaryPart+this.imaginaryPart*a.realPart;
        return new Complex(rP,iP);
    }
    public Complex conj(){
        return new Complex(this.realPart,-this.imaginaryPart);
    }
    public Complex div(Complex a){
        Complex num = this.mult(a.conj());
        Complex denum = a.mult(a.conj());
        return new Complex(num.realPart/denum.realPart,num.imaginaryPart/denum.realPart);

    }
    public TrigComplex toTrigonometric() {
        double radius = Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
        double arg = Math.atan2(imaginaryPart, realPart);
        return new TrigComplex(radius, arg);
    }



    // set, get
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }
}
