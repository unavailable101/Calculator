package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //numbers
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnZero2;

    //operations
    Button btnDivide, btnMultiply, btnPlus, btnMinus, btnEquals;

    //clear, all clear, and backspace
    Button btnC, btnAC, btnBS, btnPeriod;

//    List<Button> numbers;
//    List<Button> ops;
//    Button[] numbers = new Button[12];
//    Button[] ops = new Button[5];

    private static final int[] nums_ID = {
            R.id.one,
            R.id.two,
            R.id.three,
            R.id.four,
            R.id.five,
            R.id.six,
            R.id.seven,
            R.id.eight,
            R.id.nine,
            R.id.zero,
            R.id.doubleZero,
    };

    private static final int[] ops_ID = {
            R.id.divide,
            R.id.multiply,
            R.id.minus,
            R.id.plus,
            R.id.equals
    };

    String input;

    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //number buttons
        btnOne = (Button) findViewById(nums_ID[0]);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = (TextView) findViewById(R.id.textView);
                input = "1";
                output.setText(output.getText() + input);
            }
        });
        btnTwo = (Button) findViewById(nums_ID[1]);
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = (TextView) findViewById(R.id.textView);
                input = "2";
                output.setText(output.getText() + input);
            }
        });
        btnThree = (Button) findViewById(nums_ID[2]);
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = (TextView) findViewById(R.id.textView);
                input = "3";
                output.setText(output.getText() + input);
            }
        });
        btnFour = (Button) findViewById(nums_ID[3]);
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = (TextView) findViewById(R.id.textView);
                input = "4";
                output.setText(output.getText() + input);
            }
        });
        btnFive = (Button) findViewById(nums_ID[4]);
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = (TextView) findViewById(R.id.textView);
                input = "5";
                output.setText(output.getText() + input);
            }
        });
        btnSix = (Button) findViewById(nums_ID[5]);
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = (TextView) findViewById(R.id.textView);
                input = "6";
                output.setText(output.getText() + input);
            }
        });
        btnSeven = (Button) findViewById(nums_ID[6]);
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = (TextView) findViewById(R.id.textView);
                input = "7";
                output.setText(output.getText() + input);
            }
        });
        btnEight = (Button) findViewById(nums_ID[7]);
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = (TextView) findViewById(R.id.textView);
                input = "8";
                output.setText(output.getText() + input);
            }
        });
        btnNine = (Button) findViewById(nums_ID[8]);
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = (TextView) findViewById(R.id.textView);
                input = "9";
                output.setText(output.getText() + input);
            }
        });
        btnZero = (Button) findViewById(nums_ID[9]);
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = (TextView) findViewById(R.id.textView);
                input = "0";
                output.setText(output.getText() + input);
            }
        });
        btnZero2 = (Button) findViewById(nums_ID[10]);
        btnZero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = (TextView) findViewById(R.id.textView);
                input = "00";
                output.setText(output.getText() + input);
            }
        });

        //ops buttons
        btnDivide = (Button) findViewById(ops_ID[0]);
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = (TextView) findViewById(R.id.textView);
                input = "/";
                output.setText(output.getText() + input);
            }
        });
        btnMultiply = (Button) findViewById(ops_ID[1]);
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = (TextView) findViewById(R.id.textView);
                input = "x";
                output.setText(output.getText() + input);
            }
        });
        btnMinus = (Button) findViewById(ops_ID[2]);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = (TextView) findViewById(R.id.textView);
                input = "-";
                output.setText(output.getText() + input);
            }
        });
        btnPlus = (Button) findViewById(ops_ID[3]);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = (TextView) findViewById(R.id.textView);
                input = "+";
                output.setText(output.getText() + input);
            }
        });
        btnEquals = (Button) findViewById(ops_ID[4]);
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //others all clear, clear, backspace
        btnAC = (Button) findViewById(R.id.allClear);
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = "";
                output.setText(input);
            }
        });
        btnC = (Button) findViewById(R.id.clear);
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = "";
                output.setText(input);
            }
        });
        btnBS = (Button) findViewById(R.id.backspace);
        btnBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnPeriod = (Button) findViewById(R.id.period);
        btnPeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = ".";
                output.setText(output.getText() + input);
            }
        });
        //for numbers create new buttons
//        numbers = new ArrayList<>(nums_ID.length);
//
//        for(int id : nums_ID) {
//            Button temp = (Button) findViewById(id);
//            temp.setOnClickListener((View.OnClickListener) this);
//            numbers.add(temp);
//        }

        //for operations create array button
//        ops = new ArrayList<>(ops_ID.length);
//
//        for(int id : ops_ID){
//            Button temp = (Button) findViewById(id);
//            ops.add(temp);
//        }

//        for (int i = 0; i<12; i++){
//            numbers[i] = (Button)findViewById(nums_ID[i]);
//            numbers[i].setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    output = (TextView) findViewById(R.id.textView);
//                    switch (view.getId()){
//                        case R.id.one:
//                            input.append("1");
//                            output.setText(input.toString());
//                            break;
//                        case R.id.two:
//                            input.append("2");
//                            output.setText(input.toString());
//                            break;
//                        case R.id.three:
//                            input.append("3");
//                            output.setText(input.toString());
//                            break;
//                        case R.id.four:
//                            input.append("4");
//                            output.setText(input.toString());
//                            break;
//                        case R.id.five:
//                            input.append("5");
//                            output.setText(input.toString());
//                            break;
//                        case R.id.six:
//                            input.append("6");
//                            output.setText(input.toString());
//                            break;
//                        case R.id.seven:
//                            input.append("7");
//                            output.setText(input.toString());
//                            break;
//                        case R.id.eight:
//                            input.append("8");
//                            output.setText(input.toString());
//                            break;
//                        case R.id.nine:
//                            input.append("9");
//                            output.setText(input.toString());
//                            break;
//                        case R.id.zero:
//                            input.append("0");
//                            output.setText(input.toString());
//                            break;
//                        case R.id.doubleZero:
//                            input.append("00");
//                            output.setText(input.toString());
//                            break;
//                    }
//                }
//            });
//        }

    }
}