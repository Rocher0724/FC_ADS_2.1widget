package widgets.android.com.widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    // 1. 위젯을 정의한다.
    Intent intent;
    Button btnGridOne;
    Button btnCal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main); //

        // 2. 정의된 위젯변수에 xml의 위젯 id를 가져와서 담아준다.
        btnGridOne = (Button) findViewById(R.id.btnGrid);
        btnCal = (Button) findViewById(R.id.btnCal);
        // 3. 위젯변수를 리스너에 달아준다.
        btnGridOne.setOnClickListener(this);
        btnCal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {

            case R.id.btnGrid:
                //안드로이드 메이저 컴포넌트를 로드하기 위해서는
                //intent를 통해서 로드할 컴포넌트를 지정해야한다.
                intent = new Intent(this, GridActivity.class);
                                                 // ^ 대상이 되는 컴포넌트
                                    // this는 액티비티가 가지고있는 컨텍스트이다.
                                    // intent를 통해서 현재의 정보를 GridActivity로 넘겨줄 준비를 한다.
                startActivity(intent); // intent에 담겨진 정보를 startActivity에 담아 실행한다. -> GridActivity가 열림.
                break;
            case R.id.btnCal:
                intent = new Intent(this, calculator1Activity.class);
                startActivity(intent);
        }
    }
}
