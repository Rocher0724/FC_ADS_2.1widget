package widgets.android.com.widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GridActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1;
    Button mainReturnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);


        btn1 = (Button) findViewById(R.id.btn1);
        mainReturnBtn = (Button) findViewById(R.id.mainReturn);
        btn1.setOnClickListener(this);
        mainReturnBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn1:
                //안드로이드 메이저 컴포넌트를 로드하기 위해서는
                //intent를 통해서 로드할 컴포넌트를 지정해야한다.
                Intent intent = new Intent(this, Btn1Activity.class);
                // ^ 대상이 되는 컴포넌트
                // this는 액티비티가 가지고있는 컨텍스트이다.
                startActivity(intent);
                break;
            case R.id.mainReturn:
                //안드로이드 메이저 컴포넌트를 로드하기 위해서는
                //intent를 통해서 로드할 컴포넌트를 지정해야한다.
                Intent intent_MainReturn = new Intent(this, MainActivity.class);
                // ^ 대상이 되는 컴포넌트
                // this는 액티비티가 가지고있는 컨텍스트이다.
                startActivity(intent_MainReturn);
                break;
        }
    }
}
