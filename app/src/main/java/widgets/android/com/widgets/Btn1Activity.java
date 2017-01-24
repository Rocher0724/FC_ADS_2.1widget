package widgets.android.com.widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


// 혼자 만든 액티비티. 리턴버튼을 통해서 GridActivity로 되돌아간다.
public class Btn1Activity extends AppCompatActivity implements View.OnClickListener{

    Button returnbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn1);

        returnbtn = (Button) findViewById(R.id.returnButton);
        returnbtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.returnButton:
                //안드로이드 메이저 컴포넌트를 로드하기 위해서는
                //intent를 통해서 로드할 컴포넌트를 지정해야한다.
                Intent intent = new Intent(this, GridActivity.class);
                // ^ 대상이 되는 컴포넌트
                // this는 액티비티가 가지고있는 컨텍스트이다.
                startActivity(intent);
        }
    }
}
