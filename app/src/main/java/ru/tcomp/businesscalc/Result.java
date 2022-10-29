package ru.tcomp.businesscalc;

class Result
{

    private double acc;
    private String rest;

    public Result(double v, String r)
    {
        this.acc = v;
        this.rest = r;
    }

    public double getAcc() {
        return acc;
    }

    public void setAcc(double acc) {
        this.acc = acc;
    }

    public String getRest() {
        return rest;
    }

    public void setRest(String rest) {
        this.rest = rest;
    }
}