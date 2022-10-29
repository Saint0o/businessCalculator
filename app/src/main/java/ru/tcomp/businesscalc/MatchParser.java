package ru.tcomp.businesscalc;

import java.util.HashMap;

public class MatchParser {

    private HashMap<String, Double> variables;

    public MatchParser() {
        variables = new HashMap<String, Double>();
    }

    public void setVariable(String variableName, Double variableValue) {
        variables.put(variableName, variableValue);
    }

    public Double getVariable(String variableName) {
        if (!variables.containsKey(variableName)) {
            System.err.println("Error: Try get unexists variable '" + variableName + "'");
            return 0.0;
        }
       System.out.println("getVariable "+variables.get(variableName));
        return variables.get(variableName);
    }

    public double Parse(String s) throws Exception {
        Result result = PlusMinus(s);
        if (!result.getRest().isEmpty()) {
            System.err.println("Error: can't full parse");
            System.err.println("rest: " + result.getRest());
        }
        System.out.println("Parse " + result.getAcc());
        return result.getAcc();
    }

    private Result PlusMinus(String s) throws Exception {
        System.out.println("SS " + s);
        Result current = MulDiv(s);
        double acc = current.getAcc();
        System.out.println("acc " + current.getAcc());
        while (current.getRest().length() > 0) {
            System.out.println("current.rest " + current.getRest());
            if (!(current.getRest().charAt(0) == '+' || current.getRest().charAt(0) == '−')) break;

            char sign = current.getRest().charAt(0);
            String next = current.getRest().substring(1);

            current = MulDiv(next);
            if (sign == '+') {
                acc += current.getAcc();
            } else {
                acc -= current.getAcc();
            }
        }
        return new Result(acc, current.getRest());
    }

    private Result Bracket(String s) throws Exception {
       System.out.println("SSS " + s);
        char zeroChar = s.charAt(0);
        System.out.println("zeroChar " + zeroChar);
        if (zeroChar == '(') {
            Result r = PlusMinus(s.substring(1));
            System.out.println("r " + r);
            if (!r.getRest().isEmpty() && r.getRest().charAt(0) == ')') {
                r.setRest(r.getRest().substring(1));
            } else {
                System.err.println("Error: not close bracket");
            }
            return r;
        }
        return FunctionVariable(s);
    }

    private Result FunctionVariable(String s) throws Exception {
        System.out.println("ss " + s);
        String f = "";
        int i = 0;

        while (i < s.length() && (!Character.isDigit(s.charAt(i)) || (Character.isDigit(s.charAt(i)) && i > 0))) {
            System.out.println("s " + s);
            f += s.charAt(i);
            i++;
            System.out.println("f " + f);
        }
        if (!f.isEmpty()) {
            if (s.length() > i && s.charAt(i) == '(') {
                Result r = Bracket(s.substring(f.length()));
                return processFunction(f, r);
            } else {
                return new Result(getVariable(f), s.substring(f.length()));
            }
        }
        return Num(s);
    }

    private Result MulDiv(String s) throws Exception {
        Result current = Bracket(s);

        double acc = current.getAcc();
        while (true) {
            if (current.getRest().length() == 0) {
                return current;
            }
            char sign = current.getRest().charAt(0);
            if ((sign != '×' && sign != '÷')) return current;

            String next = current.getRest().substring(1);
            Result right = Bracket(next);

            if (sign == '×' ) {
                acc *= right.getAcc();
            } else {
                acc /= right.getAcc();
            }

            current = new Result(acc, right.getRest());
        }
    }

    private Result Num(String s) throws Exception {
        int i = 0;
        int dot_cnt = 0;
        boolean negative = false;

        if (s.charAt(0) == '−') {
            negative = true;
            s = s.substring(1);
        }

        while (i < s.length() && (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.')) {

            if (s.charAt(i) == '.' && ++dot_cnt > 1) {
                throw new Exception("not valid number '" + s.substring(0, i + 1) + "'");
            }
            i++;
        }
        if (i == 0) {
            throw new Exception("can't get valid number in '" + s + "'");
        }

        double dPart = Double.parseDouble(s.substring(0, i));
        if (negative) dPart = -dPart;
        String restPart = s.substring(i);

        return new Result(dPart, restPart);
    }
    public static double perc(String operand1, String operand2, String op) {
    double a = Double.parseDouble(operand1);
    double b = Double.parseDouble(operand2);
        switch (op) {
            case "+":
                a = a + (a * b) / 100;
                break;
            case "−":
                a = a - (a * b) / 100;
                break;
            case "×":
                a = a * (a * b) / 100;
                break;
            case "÷":
                a = a / (a * b) / 100;
                break;
            default:
                a = a / 100;
                break;
        }
        return a;
    } //охуенна мне нрав

    private Result processFunction(String func, Result r) {
        System.out.println("ФУНКЦИЯ БЛЯТЬ" + func);


        if (func.equals("sin")) {
            return new Result(Math.sin(Math.toRadians(r.getAcc())), r.getRest());
        } else if (func.equals("cos")) {
            return new Result(Math.cos(Math.toRadians(r.getAcc())), r.getRest());
        } else if (func.equals("tan")) {
            return new Result(Math.tan(Math.toRadians(r.getAcc())), r.getRest());
        } else if(func.equals("ctg")) {
            return new Result(1/ Math.tan(Math.toRadians(r.getAcc())),r.getRest());
        } else if (func.equals("sqrt")) {
            return new Result(Math.sqrt(r.getAcc()), r.getRest());
        }else if (func.equals("pow")){
       // v1=Double.parseDouble(powto);
          // return  new Result(Math.pow(r.acc),r.rest);
    }

        else{
            System.err.println("function '" + func + "' is not defined");
        }
        return r;
    }
}

