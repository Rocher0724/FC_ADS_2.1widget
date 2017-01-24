package widgets.android.com.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class widgetActivity extends AppCompatActivity implements View.OnClickListener {

    TextView result;
    TextView testSideView;
    TextView downTestSideView;


    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnPlus;
    Button btnMinus;
    Button btnMulti;
    Button btnDivide;
    Button btnRun;
    Button btnCancel;

    int previous = 0;
    int nextNum = 0;
    int runtime = 0;
    String strarr[];
    int realResult = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);

        // 2. 정의된 위젯변수에 xml의 위젯 id를 가져와서 담아준다.
        result = (TextView) findViewById(R.id.result);
        testSideView = (TextView) findViewById(R.id.testSide);
        downTestSideView = (TextView) findViewById(R.id.downTestSide);


        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMulti = (Button) findViewById(R.id.btnMul);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnRun = (Button) findViewById(R.id.btnRun);
        // 3. 위젯변수를 리스너에 달아준다.

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnRun.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.btn0:
                testSideView.setText(testSideView.getText() + "0");
                break;
            case R.id.btn1:
                testSideView.setText(testSideView.getText() + "1");
                break;
            case R.id.btn2:
                testSideView.setText(testSideView.getText() + "2");
                break;
            case R.id.btn3:
                testSideView.setText(testSideView.getText() + "3");
                break;
            case R.id.btn4:
                testSideView.setText(testSideView.getText() + "4");
                break;
            case R.id.btn5:
                testSideView.setText(testSideView.getText() + "5");
                break;
            case R.id.btn6:
                testSideView.setText(testSideView.getText() + "6");
                break;
            case R.id.btn7:
                testSideView.setText(testSideView.getText() + "7");
                break;
            case R.id.btn8:
                testSideView.setText(testSideView.getText() + "8");
                break;
            case R.id.btn9:
                testSideView.setText(testSideView.getText() + "9");
                break;


            case R.id.btnPlus:
                if ( previous > 0) {
                    testSideView.setText(previous + " + ");
                    runtime = 1;
                } else {
                    previous = Integer.parseInt(testSideView.getText().toString());
                    testSideView.setText(testSideView.getText() + " + ");
                    runtime = 1;
                }
                break;

            case R.id.btnMinus:
                if ( previous > 0) {
                    testSideView.setText(previous + " - ");
                    runtime = 2;
                } else {
                    previous = Integer.parseInt(testSideView.getText().toString());
                    testSideView.setText(testSideView.getText() + " - ");
                    runtime = 2;
                }
                break;

            case R.id.btnMul:
                if ( previous > 0) {
                    testSideView.setText(previous + " X ");
                    runtime = 3;
                } else {
                    previous = Integer.parseInt(testSideView.getText().toString());
                    testSideView.setText(testSideView.getText() + " X ");
                    runtime = 3;
                }
                break;

            case R.id.btnDivide:
                if ( previous > 0) {
                    testSideView.setText(previous + " / ");
                    runtime = 4;
                } else {
                    previous = Integer.parseInt(testSideView.getText().toString());
                    testSideView.setText(testSideView.getText() + " / ");
                    runtime = 4;
                }
                break;


            case R.id.btnRun:
                strarr = testSideView.getText().toString().split(" ");

                if (strarr.length == 3) {
                    nextNum = Integer.parseInt(strarr[2]);
                    downTestSideView.setText(runtime + "");
                    switch (runtime) {
                        case 1:
                            realResult = previous + nextNum;
                            result.setText(realResult + "");
                            previous = realResult;
                            break;
                        case 2:
                            realResult = previous - nextNum;
                            result.setText(realResult + "");
                            previous = realResult;
                            break;
                        case 3:
                            realResult = previous * nextNum;
                            result.setText(realResult + "");
                            previous = realResult;
                            break;
                        case 4:
                            realResult = previous / nextNum;
                            result.setText(realResult + "");
                            previous = realResult;
                            break;
                    }
                } else {
                    previous = 0;
                    nextNum = 0;
                    testSideView.setText("");
                    result.setText("");
                }

                break;
            case R.id.btnCancel:
                previous = 0;
                nextNum = 0;
                result.setText("");
                testSideView.setText("");
                break;


        }
    }
}
