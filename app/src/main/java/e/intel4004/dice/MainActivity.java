package e.intel4004.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    Button btn1;
    Button btn2;
    TextView txtview;
    final int[] images={R.mipmap.die_01,R.mipmap.die_02,R.mipmap.die_03,R.mipmap.die_04,R.mipmap.die_05,R.mipmap.die_06};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=(ImageView)findViewById(R.id.imageView1);
        img2=(ImageView)findViewById(R.id.imageView2);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        txtview=(TextView)findViewById(R.id.textView);

        btn2.setEnabled(false);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setEnabled(true);
                Random RandomNumber= new Random();
                int number1= RandomNumber.nextInt(6);
                int number2= RandomNumber.nextInt(6);
                img1.setImageResource(images[number1]);
                img2.setImageResource(images[number2]);
                btn1.setEnabled(false);
                if (number1 == number2) {
                    txtview.setText("player 1 won");
                }else {
                    txtview.setText("");
                }


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setEnabled(true);
                Random RandomNumber= new Random();
                int number1=RandomNumber.nextInt(6);
                int number2=RandomNumber.nextInt(6);
                img1.setImageResource(images[number1]);
                img2.setImageResource(images[number2]);
                btn2.setEnabled(false);
                if (number1 == number2) {
                    txtview.setText("player 2 won");
                }else {
                    txtview.setText("");
                }

            }
        });

    }
}
