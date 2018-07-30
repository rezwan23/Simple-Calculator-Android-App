package com.shashangle.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    TextView tvExpress, tvResult;
    Button btnEquals, btnClr, btnOne, btnTwo,btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnAdd, btnSub, btnMul, btnDiv;
    boolean isPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
        initListener();
    }

    public void initView(){
        setContentView(R.layout.activity_main);

        btnZero = findViewById(R.id.btn_0);
        btnOne = findViewById(R.id.btn_1);
        btnTwo = findViewById(R.id.btn_2);
        btnThree = findViewById(R.id.btn_3);
        btnFour = findViewById(R.id.btn_4);
        btnFive = findViewById(R.id.btn_5);
        btnSix = findViewById(R.id.btn_6);
        btnSeven = findViewById(R.id.btn_7);
        btnEight = findViewById(R.id.btn_8);
        btnNine = findViewById(R.id.btn_9);
        btnAdd = findViewById(R.id.btn_add);
        btnSub = findViewById(R.id.btn_sub);
        btnMul = findViewById(R.id.btn_mul);
        btnDiv = findViewById(R.id.btn_div);
        btnClr = findViewById(R.id.btn_clr);
        btnEquals = findViewById(R.id.btn_equals);
        tvExpress = findViewById(R.id.tv_express);
        tvResult = findViewById(R.id.tv_result);


    }

    public void initListener(){
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpress.setText(tvExpress.getText()+"0");
                isPressed = false;
            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpress.setText(tvExpress.getText()+"1");
                isPressed = false;
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpress.setText(tvExpress.getText()+"2");
                isPressed = false;
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpress.setText(tvExpress.getText()+"3");
                isPressed = false;
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpress.setText(tvExpress.getText()+"4");
                isPressed = false;
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpress.setText(tvExpress.getText()+"5");
                isPressed = false;
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpress.setText(tvExpress.getText()+"6");
                isPressed = false;
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpress.setText(tvExpress.getText()+"7");
                isPressed = false;
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpress.setText(tvExpress.getText()+"8");
                isPressed = false;
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpress.setText(tvExpress.getText()+"9");
                isPressed = false;
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPressed == false){
                    tvExpress.setText(tvExpress.getText()+"+");
                    isPressed = true;
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPressed == false){
                    tvExpress.setText(tvExpress.getText()+"-");
                    isPressed = true;
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPressed == false){
                    tvExpress.setText(tvExpress.getText()+"*");
                    isPressed = true;
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPressed == false){
                    tvExpress.setText(tvExpress.getText()+"/");
                    isPressed = true;
                }
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Expression ex = new ExpressionBuilder(tvExpress.getText().toString()).build();
                try{
                    double result = ex.evaluate();
                    tvResult.setText(Double.toString(result));
                }catch(ArithmeticException e){
                    tvResult.setText("Error!");
                }
            }

        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExpress.setText("");
                tvResult.setText("");
            }
        });
    }
}
