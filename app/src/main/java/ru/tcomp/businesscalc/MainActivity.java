package ru.tcomp.businesscalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button clearbutton;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clearbutton = (Button) findViewById(R.id.clearbutton);
        Button button = (Button) findViewById(R.id.clearbutton);
        button.setOnTouchListener(new View.OnTouchListener() {

            private Handler mHandler;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        if (mHandler != null) return true;
                        mHandler = new Handler();
                        mHandler.postDelayed(mAction, 500);
                        break;
                    case MotionEvent.ACTION_UP:
                        if (mHandler == null) return true;
                        mHandler.removeCallbacks(mAction);
                        mHandler = null;
                        break;
                }
                return false;
            }

            Runnable mAction = new Runnable() {
                @Override
                public void run() {
                    Sum1 = "0";
                    br = 0;
                    forpoint = false;
                    screen.setText(Sum1);
                    mHandler.postDelayed(this, 500);
                }
            };

        });

    }

    public static int isNum(String str) {
        int b = 0;
        if ((str.substring(str.length() - 1).equals("0")) || str.substring(str.length() - 1).equals("1")
                || str.substring(str.length() - 1).equals("2") || str.substring(str.length() - 1).equals("3") ||
                str.substring(str.length() - 1).equals("4") || str.substring(str.length() - 1).equals("5")
                || str.substring(str.length() - 1).equals("6") || str.substring(str.length() - 1).equals("7")
                || str.substring(str.length() - 1).equals("8") || str.substring(str.length() - 1).equals("9"))
            b = 1;
        return b;
    }

    double m1 = 0.0;
    java.lang.String Sum1 = "0";
    int br = 0;
    boolean forpoint = false;
    TextView screen;
    TextView EM;

    public void onButtonClick1(View v) {
        screen = (TextView) findViewById(R.id.scr);
        String laststr = Sum1.substring(Sum1.length() - 1);
        if (Sum1.equals("0")) {
            Sum1 = "1";
            screen.setText(Sum1);
        } else if (laststr.equals(")")) {
            Sum1 = Sum1 + "×1";
            screen.setText(Sum1);
        } else if (Sum1.substring(Sum1.length() - 1).equals("%")) {
            screen.setText(Sum1);
        } else {
            Sum1 = Sum1 + "1";
            screen.setText(Sum1);
        }
    }

    public void onButtonClick2(View v) {
        screen = (TextView) findViewById(R.id.scr);
        String laststr = Sum1.substring(Sum1.length() - 1);
        if (Sum1.equals("0")) {
            Sum1 = "2";
            screen.setText(Sum1);
        } else if (laststr.equals(")")) {
            Sum1 = Sum1 + "×2";
            screen.setText(Sum1);
        } else if (Sum1.substring(Sum1.length() - 1).equals("%")) {
            screen.setText(Sum1);
        } else {
            Sum1 = Sum1 + "2";
            screen.setText(Sum1);
        }
    }

    public void onButtonClick3(View v) {
        screen = (TextView) findViewById(R.id.scr);
        String laststr = Sum1.substring(Sum1.length() - 1);
        if (Sum1.equals("0")) {
            Sum1 = "3";
            screen.setText(Sum1);
        } else if (laststr.equals(")")) {
            Sum1 = Sum1 + "×3";
            screen.setText(Sum1);
        } else if (Sum1.substring(Sum1.length() - 1).equals("%")) {
            screen.setText(Sum1);
        } else {
            Sum1 = Sum1 + "3";
            screen.setText(Sum1);
        }
    }

    public void onButtonClick4(View v) {
        screen = (TextView) findViewById(R.id.scr);
        String laststr = Sum1.substring(Sum1.length() - 1);

        if (Sum1.equals("0")) {
            Sum1 = "4";
            screen.setText(Sum1);
        } else if (laststr.equals(")")) {
            Sum1 = Sum1 + "×4";
            screen.setText(Sum1);
        } else if (Sum1.substring(Sum1.length() - 1).equals("%")) {
            screen.setText(Sum1);
        } else {
            Sum1 = Sum1 + "4";
            screen.setText(Sum1);
        }
    }

    public void onButtonClick5(View v) {
        screen = (TextView) findViewById(R.id.scr);
        String laststr = Sum1.substring(Sum1.length() - 1);

        if (Sum1.equals("0")) {
            Sum1 = "5";
            screen.setText(Sum1);
        } else if (laststr.equals(")")) {
            Sum1 = Sum1 + "×5";
            screen.setText(Sum1);
        } else if (Sum1.substring(Sum1.length() - 1).equals("%")) {
            screen.setText(Sum1);
        } else {
            Sum1 = Sum1 + "5";
            screen.setText(Sum1);
        }
    }

    public void onButtonClick6(View v) {
        screen = (TextView) findViewById(R.id.scr);
        String laststr = Sum1.substring(Sum1.length() - 1);

        if (Sum1.equals("0")) {
            Sum1 = "6";
            screen.setText(Sum1);
        } else if (laststr.equals(")")) {
            Sum1 = Sum1.substring(0, Sum1.length() - 2);
            Sum1 = Sum1 + "×6";
            screen.setText(Sum1);
        } else if (Sum1.substring(Sum1.length() - 1).equals("%")) {
            screen.setText(Sum1);
        } else {
            Sum1 = Sum1 + "6";
            screen.setText(Sum1);
        }
    }

    public void onButtonClick7(View v) {
        screen = (TextView) findViewById(R.id.scr);
        String laststr = Sum1.substring(Sum1.length() - 1);

        if (Sum1.equals("0")) {
            Sum1 = "7";
            screen.setText(Sum1);
        } else if (laststr.equals(")")) {
            Sum1 = Sum1.substring(0, Sum1.length() - 2);
            Sum1 = Sum1 + "×7";
            screen.setText(Sum1);
        } else if (Sum1.substring(Sum1.length() - 1).equals("%")) {
            screen.setText(Sum1);
        } else {
            Sum1 = Sum1 + "7";
            screen.setText(Sum1);
        }

    }

    public void onButtonClick8(View v) {
        screen = (TextView) findViewById(R.id.scr);
        String laststr = Sum1.substring(Sum1.length() - 1);

        if (Sum1.equals("0")) {
            Sum1 = "8";
            screen.setText(Sum1);
        } else if (laststr.equals(")")) {
            Sum1 = Sum1.substring(0, Sum1.length() - 2);
            Sum1 = Sum1 + "×8";
            screen.setText(Sum1);
        } else if (Sum1.substring(Sum1.length() - 1).equals("%")) {
            screen.setText(Sum1);
        } else {
            Sum1 = Sum1 + "8";
            screen.setText(Sum1);
        }
    }

    public void onButtonClick9(View v) {
        screen = (TextView) findViewById(R.id.scr);
        String laststr = Sum1.substring(Sum1.length() - 1);

        if (Sum1.equals("0")) {
            Sum1 = "9";
            screen.setText(Sum1);
        } else if (laststr.equals(")")) {
            Sum1 = Sum1.substring(0, Sum1.length() - 2);
            Sum1 = Sum1 + "×9";
            screen.setText(Sum1);
        } else if (Sum1.substring(Sum1.length() - 1).equals("%")) {
            screen.setText(Sum1);
        } else {
            Sum1 = Sum1 + "9";
            screen.setText(Sum1);
        }
    }

    public void onButtonClick0(View v) {
        screen = (TextView) findViewById(R.id.scr);
        String laststr = Sum1.substring(Sum1.length() - 1);

        if (Sum1.equals("0")) {
            Sum1 = "0";
            screen.setText(Sum1);
        } else if (laststr.equals(")")) {
            Sum1 = Sum1.substring(0, Sum1.length() - 2);
            Sum1 = Sum1 + "×0";
            screen.setText(Sum1);
        } else if (Sum1.substring(Sum1.length() - 1).equals("%")) {
            screen.setText(Sum1);
        } else {
            Sum1 = Sum1 + "0";
            screen.setText(Sum1);
        }
    }

    public void onButtonClickC(View v) {
        screen = (TextView) findViewById(R.id.scr);

        int i = Sum1.length();
        String check = Sum1.substring((Sum1.length() - 1));
        if (check.equals(".")) {
            forpoint = false;
        }
        if (Sum1.substring(Sum1.length() - 1).equals("(")) {
            br--;
        } else if (Sum1.substring(Sum1.length() - 1).equals(")")) {
            br++;
        }


        if (i > 1) {
            Sum1 = Sum1.substring(0, Sum1.length() - 1);
            screen.setText(Sum1);
        } else {
            Sum1 = "0";
            screen.setText(Sum1);
        }

    }

    public void percent(View v) {
        screen = (TextView) findViewById(R.id.scr);
        String a = screen.getText().toString();
        if (isNum(a) == 1) {
            a = a + "%";
            Sum1 = a;
            screen.setText(Sum1);
        }
    }

    public void getstepen(View v) {
        screen = (TextView) findViewById(R.id.scr);

        String a = screen.getText().toString();
        if (isNum(a) == 1) {
            a = a + "^(";
            br++;
            Sum1 = a;
            screen.setText(Sum1);
        }
    }

    public void onButtonClickPoint(View v) {
        screen = (TextView) findViewById(R.id.scr);
        String a = screen.getText().toString();
        if ((isNum(a) == 1) && (forpoint == false)) {
            a = a + ".";
            Sum1 = a;
            screen.setText(Sum1);
        }
        forpoint = true;
    }

    public void plus(View v) {
        screen = (TextView) findViewById(R.id.scr);
        java.lang.String b = Sum1.substring(Sum1.length() - 1);
        switch (b) {
            case "+":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "+";
                screen.setText(Sum1);
                break;
            case "−":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "+";
                screen.setText(Sum1);
                break;
            case "×":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "+";
                screen.setText(Sum1);
                break;
            case "÷":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "+";
                screen.setText(Sum1);

                break;
            case ".":
                screen.setText(Sum1);
                break;
            default:
                Sum1 = Sum1 + "+";
                screen.setText(Sum1);
                break;
        }
    }

    public void minus(View v) {
        screen = (TextView) findViewById(R.id.scr);
        java.lang.String b = Sum1.substring(Sum1.length() - 1);
        switch (b) {
            case "−":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "−";
                screen.setText(Sum1);
                break;
            case "+":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "−";
                screen.setText(Sum1);
                break;
            case "×":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "−";
                screen.setText(Sum1);
                break;
            case "÷":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "−";
                screen.setText(Sum1);
                break;
            case ".":
                screen.setText(Sum1);
                break;
            default:
                Sum1 = Sum1 + "−";
                screen.setText(Sum1);
                break;
        }
    }

    public void umn(View v) {
        screen = (TextView) findViewById(R.id.scr);
        java.lang.String b = Sum1.substring(Sum1.length() - 1);
        switch (b) {
            case "−":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "×";
                screen.setText(Sum1);
                break;
            case "+":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "×";
                screen.setText(Sum1);
                break;
            case "×":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "×";
                screen.setText(Sum1);
                break;
            case "÷":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "×";
                screen.setText(Sum1);

                break;
            case ".":
                screen.setText(Sum1);
                break;
            default:
                Sum1 = Sum1 + "×";
                screen.setText(Sum1);
                break;
        }

    }

    public void del(View v) {
        screen = (TextView) findViewById(R.id.scr);
        java.lang.String b = Sum1.substring(Sum1.length() - 1);
        switch (b) {
            case "−":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "÷";
                screen.setText(Sum1);
                break;
            case "+":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "÷";
                screen.setText(Sum1);
                break;
            case "×":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "÷";
                screen.setText(Sum1);
                break;
            case "÷":
                Sum1 = Sum1.substring(0, Sum1.length() - 1);
                Sum1 = Sum1 + "÷";
                screen.setText(Sum1);

                break;
            case ".":
                screen.setText(Sum1);
                break;
            default:
                Sum1 = Sum1 + "÷";
                screen.setText(Sum1);
                break;
        }

    }

    public void brackets(View v) {
        screen = (TextView) findViewById(R.id.scr);
        String laststr = Sum1.substring(Sum1.length() - 1);
        if (Sum1.equals("0")) {
            Sum1 = "(";
            br++;
            screen.setText(Sum1);
        } else if (laststr.equals("0") || laststr.equals("1") || laststr.equals("2") || laststr.equals("3")
                || laststr.equals("4") || laststr.equals("5") || laststr.equals("6") || laststr.equals("7")
                || laststr.equals("8") || laststr.equals("9")) {
            if (br == 0) {
                Sum1 = Sum1 + "×(";
                br++;
                screen.setText(Sum1);
            } else if (br > 0) {
                Sum1 = Sum1 + ")";
                br--;
                screen.setText(Sum1);
            }
        } else if (laststr.equals("+") || laststr.equals("×") || laststr.equals("÷") || laststr.equals("−")) {
            Sum1 = Sum1 + "(";
            br++;
            screen.setText(Sum1);
        } else if (laststr.equals(")")) {
            if (br > 0) {
                Sum1 = Sum1 + ")";
                br--;
                screen.setText(Sum1);
            } else if (br == 0) {
                Sum1 = Sum1 + "×(";
            }
        }

    }

    public void sqrttt(View v) {
        screen = (TextView) findViewById(R.id.scr);

        String a = screen.getText().toString();
        if (Sum1.equals("0")) {
            Sum1 = "sqrt(";
            br++;
            screen.setText(Sum1);
        } else if (isNum(a) == 1 || Sum1.substring(Sum1.length() - 1).equals(")")) {
            a = a + "×sqrt(";
            br++;
            Sum1 = a;
            screen.setText(Sum1);
        } else {
            Sum1 = Sum1 + "sqrt(";
            br++;
            screen.setText(Sum1);
        }

    }

    public void Sin(View v) {
        screen = (TextView) findViewById(R.id.scr);
        if (Sum1.equals("0")) {
            Sum1 = "sin(";
            br++;
            screen.setText(Sum1);
        } else if (isNum(Sum1) == 1 || Sum1.substring(Sum1.length() - 1).equals(")")) {
            Sum1 = Sum1 + "×sin(";
            br++;
            screen.setText(Sum1);
        } else {
            Sum1 = Sum1 + "sin(";
            br++;
            screen.setText(Sum1);
        }

    }

    public void Cos(View v) {
        screen = (TextView) findViewById(R.id.scr);
        if (Sum1.equals("0")) {
            Sum1 = "cos(";
            br++;
            screen.setText(Sum1);
        } else if (isNum(Sum1) == 1 || Sum1.substring(Sum1.length() - 1).equals(")")) {
            Sum1 = Sum1 + "×cos(";
            br++;
            screen.setText(Sum1);
        } else {
            Sum1 = Sum1 + "cos(";
            br++;
            screen.setText(Sum1);
        }

    }

    public void Tan(View v) {
        screen = (TextView) findViewById(R.id.scr);
        if (Sum1.equals("0")) {
            Sum1 = "tan(";
            br++;
            screen.setText(Sum1);
        } else if (isNum(Sum1) == 1 || Sum1.substring(Sum1.length() - 1).equals(")")) {
            Sum1 = Sum1 + "×tan(";
            br++;
            screen.setText(Sum1);
        } else {
            Sum1 = Sum1 + "tan(";
            br++;
            screen.setText(Sum1);
        }

    }

    public void plmn(View v) {
        screen = (TextView) findViewById(R.id.scr);
        if (Sum1.equals("0")) {
            Sum1 = "−";
            screen.setText(Sum1);
        } else if (isNum(Sum1) == 1) {
            Sum1 = Sum1 + "×(−";
            screen.setText(Sum1);
        } else {
            Sum1 = Sum1 + "(−";
            screen.setText(Sum1);
        }
    }

    public void Mpl(View v) {
        EM = (TextView) findViewById(R.id.M);
        if (Sum1.contains("+") || Sum1.contains("−") || Sum1.contains("×") || Sum1.contains("÷")) {
            screen.setText(Sum1);
        } else {
            Double m2 = Double.valueOf(Sum1);
            m1 = m1 + m2;
            String Sum2 = Double.toString(m1);
            if (Sum2.substring(Sum2.length() - 2).equals(".0")) {
                Sum2 = Sum2.substring(0, Sum2.length() - 2);
                EM.setText(Sum2);
            } else {
                EM.setText(Double.toString(m1));
            }
        }
    }

    public void Mmn(View v) {
        EM = (TextView) findViewById(R.id.M);
        if (Sum1.contains("+") || Sum1.contains("−") || Sum1.contains("×") || Sum1.contains("÷")) {
            screen.setText(Sum1);
        } else {
            Double m2 = Double.valueOf(Sum1);
            m1 = m1 - m2;
            String Sum2 = Double.toString(m1);
            if (Sum2.substring(Sum2.length() - 2).equals(".0")) {
                Sum2 = Sum2.substring(0, Sum2.length() - 2);
                EM.setText(Sum2);
            } else {
                EM.setText(Double.toString(m1));
            }
        }
    }

    public void Mc(View v) {
        EM = (TextView) findViewById(R.id.M);
        m1 = 0;
        EM.setText(Double.toString(m1));
    }

    public void MR(View v) {
        EM = (TextView) findViewById(R.id.M);
        Sum1 = Double.toString(m1);
        screen.setText(Sum1);
    }

    public static int opmax(String Sum) {
        int plus = Sum.lastIndexOf("+");
        int minus = Sum.lastIndexOf("-");
        int multi = Sum.lastIndexOf("×");
        int dev = Sum.lastIndexOf("÷");
        int max1 = Math.max(plus, minus);
        int max2 = Math.max(multi, dev);
        int a = Math.max(max1, max2);
        return a;

    }

    public void SUM(View v) {
        screen = (TextView) findViewById(R.id.scr);
        MatchParser matchParser = new MatchParser();
        while (Sum1.contains("%")) {
            int perc = Sum1.indexOf("%");
            String sum = Sum1.substring(0, perc);
            if (opmax(sum) != -1) {
                double num2 = Double.valueOf(Sum1.substring(opmax(sum)));
                String sum1 = sum.substring(0, opmax(sum));
                double num1 = 2;
                /*try{
                 num1 = matchParser.Parse(sum1);}
                catch(Exception e){}
                switch (sum.charAt(opmax(sum))){
                    case '+':
                        num1=num1+(num1*num2)/100; //я хз, псчитает это правильно, или нет
                        System.out.println(num1);
                        break;


            }

        }*/
                Sum1 = screen.getText().toString();

                try {
                    double d = matchParser.Parse(screen.getText().toString());
                    screen.setText(d + "");

                } catch (Exception e) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Пора покормить кота!", Toast.LENGTH_SHORT);
                    toast.show();
                }
                forpoint = false;

            }
        }

    }
}

