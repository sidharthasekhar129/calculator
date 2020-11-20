package com.example.backgroundprep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Theme2 extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6,button7,button8,
            button9,button0,add,sub,mul,div,equal,dot,del,ac;
    private TextView tv1,tv2,tv3,tv4;
    private  double x=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme2);



        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        tv3=(TextView)findViewById(R.id.tv3);
        tv4=(TextView)findViewById(R.id.tv4);

        button0=(Button)findViewById(R.id.button0);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        dot=(Button)findViewById(R.id.dot);
        del=(Button)findViewById(R.id.del);
        ac=(Button)findViewById(R.id.ac);
        equal=(Button)findViewById(R.id.equal);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a= tv1.getText().toString();

                tv1.setText(a+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b=tv1.getText().toString();
                tv1.setText(b+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c=tv1.getText().toString();
                tv1.setText(c+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String d=tv1.getText().toString();

                tv1.setText(d+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e=tv1.getText().toString();

                tv1.setText(e+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String f=tv1.getText().toString();

                tv1.setText(f+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String g=tv1.getText().toString();

                tv1.setText(g+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String h=tv1.getText().toString();

                tv1.setText(h+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String i=tv1.getText().toString();

                tv1.setText(i+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String j=tv1.getText().toString();

                tv1.setText(j+"9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String k=tv1.getText().toString();

                tv1.setText(k+".");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String l=tv1.getText().toString();
                tv3.setText(l);
                tv1.setText("");
                tv2.setText("");
                x=1;
                tv4.setText("+");

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String y=tv1.getText().toString();
                tv3.setText(y);
                tv1.setText("");
                tv2.setText("");
                x=2;
                tv4.setText("-");


            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String y1=tv1.getText().toString();
                tv3.setText(y1);
                tv1.setText("");
                tv2.setText("");
                x=3;
                tv4.setText("*");

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String y2=tv1.getText().toString();
                tv3.setText(y2);
                tv1.setText("");
                tv2.setText("");
                x=4;
                tv4.setText("/");

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv2.setText(tv1.getText().toString());
                tv1.setText("");
                String m=tv3.getText().toString();
                String m1=tv2.getText().toString();
                try {
                    if (x==1)
                    {
                        double d=Double.parseDouble(m);
                        double d1=Double.parseDouble(m1);
                        double d2=d+d1;
                        tv1.setText(Double.toString(d2));
                    }
                    else if (x==2)
                    {
                        double d=Double.parseDouble(m);
                        double d1=Double.parseDouble(m1);
                        double d2=d-d1;
                        tv1.setText(Double.toString(d2));
                    }
                    else if (x==3)
                    {
                        double d=Double.parseDouble(m);
                        double d1=Double.parseDouble(m1);
                        double d2=d*d1;
                        tv1.setText(Double.toString(d2));
                    }
                    else if (x==4)
                    {
                        double d=Double.parseDouble(m);
                        double d1=Double.parseDouble(m1);
                        double d2=d/d1;
                        tv1.setText(Double.toString(d2));
                    }




                }catch (Exception e){}



            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("");
                tv2.setText("");
                tv3.setText("");
                tv4.setText("");

            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    StringBuffer buffer=new StringBuffer(tv1.getText().toString());
                    tv1.setText(buffer.deleteCharAt(buffer.length()-1));
                }catch (Exception e)
                {

                }



            }
        });
    }
}
