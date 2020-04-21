package com.example.ettimadai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class quizes extends AppCompatActivity {
ImageView ans;
    boolean one=false,two=false,three=false,four=false,five=false,six=false,seven=false,eight=false,nine=false,ten=false,eleven=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizes);
    }
    public void q1(View v)
    {
        CheckBox f,a,b,c,d,e;
        a=findViewById(R.id.checkBox);
        b=findViewById(R.id.checkBox2);
        c=findViewById(R.id.checkBox3);
        d=findViewById(R.id.checkBox4);
        e=findViewById(R.id.checkBox5);
        f=findViewById(R.id.checkBox6);
        if(a.isChecked()==true && b.isChecked()==true && d.isChecked()==true && e.isChecked()==true && c.isChecked()==false && f.isChecked()==false){
            //count++;
            one=true;
            ans=findViewById(R.id.resu);
            ans.setVisibility(View.VISIBLE);
            ans.setBackgroundResource(R.drawable.correct);
        }
        else{
one=false;
            ans=findViewById(R.id.resu);
            ans.setVisibility(View.VISIBLE);
            ans.setBackgroundResource(R.drawable.wrong);

        }

    }
    public void q2(View v){
        CheckBox a,b,c;
        a=findViewById(R.id.checkBox21);
        b=findViewById(R.id.checkBox22);
        c=findViewById(R.id.checkBox23);
        if(a.isChecked()==true && b.isChecked()==false && c.isChecked()==false){
            ImageView ans=findViewById(R.id.resu1);
            ans.setVisibility(View.VISIBLE);
            ans.setBackgroundResource(R.drawable.correct);
            two=true;
           // Toast.makeText(quizes.this,String.valueOf(count),Toast.LENGTH_LONG).show();
        }
        else{
            ImageView ans=findViewById(R.id.resu1);
            ans.setVisibility(View.VISIBLE);
            two=false;
            ans.setBackgroundResource(R.drawable.wrong);
        }

    }
    public void q3(View v){
        CheckBox a,b,c;
        a=findViewById(R.id.checkBox31);
        b=findViewById(R.id.checkBox32);
        c=findViewById(R.id.checkBox33);
        if(a.isChecked()==false && b.isChecked()==false && c.isChecked()==true){
            ImageView ans=findViewById(R.id.resu3);
            ans.setVisibility(View.VISIBLE);
            ans.setBackgroundResource(R.drawable.correct);
            three=true;
           // Toast.makeText(quizes.this,String.valueOf(count),Toast.LENGTH_LONG).show();
        }
        else{
            ImageView ans=findViewById(R.id.resu3);
            ans.setVisibility(View.VISIBLE);
            three=false;
            ans.setBackgroundResource(R.drawable.wrong);
        }

    }
    public void q4(View v){
        CheckBox a,b,c;
        a=findViewById(R.id.checkBox41);
        b=findViewById(R.id.checkBox42);

        if(a.isChecked()==false && b.isChecked()==true){
            ImageView ans=findViewById(R.id.resu4);
            ans.setVisibility(View.VISIBLE);
            ans.setBackgroundResource(R.drawable.correct);
            four=true;
           // Toast.makeText(quizes.this,String.valueOf(count),Toast.LENGTH_LONG).show();
        }
        else{
            ImageView ans=findViewById(R.id.resu4);
            ans.setVisibility(View.VISIBLE);
            four=false;
            ans.setBackgroundResource(R.drawable.wrong);
        }

    }
    public void q5(View v){
        CheckBox a,b,c;
        a=findViewById(R.id.checkBox51);
        b=findViewById(R.id.checkBox52);

        if(a.isChecked()==false && b.isChecked()==true){
            ImageView ans=findViewById(R.id.resu5);
            ans.setVisibility(View.VISIBLE);
            ans.setBackgroundResource(R.drawable.correct);
            five=true;
            //Toast.makeText(quizes.this,String.valueOf(count),Toast.LENGTH_LONG).show();
        }
        else{
            ImageView ans=findViewById(R.id.resu5);
            ans.setVisibility(View.VISIBLE);
            five=false;
            ans.setBackgroundResource(R.drawable.wrong);
        }

    }
    public void q6(View v){
        CheckBox a,b,c;
        a=findViewById(R.id.checkBox61);
        b=findViewById(R.id.checkBox62);
        c=findViewById(R.id.checkBox63);


        if(a.isChecked()==true && b.isChecked()==false && c.isChecked()==false){
            ImageView ans=findViewById(R.id.resu6);
            ans.setVisibility(View.VISIBLE);
            ans.setBackgroundResource(R.drawable.correct);
            six=true;
           // Toast.makeText(quizes.this,String.valueOf(count),Toast.LENGTH_LONG).show();
        }
        else{
            ImageView ans=findViewById(R.id.resu6);
            ans.setVisibility(View.VISIBLE);
            six=false;
            ans.setBackgroundResource(R.drawable.wrong);
        }

    }
    public void q7(View v){
        CheckBox a,b,c;
        a=findViewById(R.id.checkBox71);
        b=findViewById(R.id.checkBox72);
        c=findViewById(R.id.checkBox73);


        if(a.isChecked()==false && b.isChecked()==false && c.isChecked()==true){
            ImageView ans=findViewById(R.id.resu7);
            ans.setVisibility(View.VISIBLE);
            ans.setBackgroundResource(R.drawable.correct);
            seven=true;
            //Toast.makeText(quizes.this,String.valueOf(count),Toast.LENGTH_LONG).show();
        }
        else{
            ImageView ans=findViewById(R.id.resu7);
            ans.setVisibility(View.VISIBLE);
            seven=false;
            ans.setBackgroundResource(R.drawable.wrong);
        }

    }
    public void q8(View v){
        CheckBox a,b,c,d,e,g,h,f;
        a=findViewById(R.id.checkBox81);

        b=findViewById(R.id.checkBox82);

        c=findViewById(R.id.checkBox83);
        d=findViewById(R.id.checkBox84);

        e=findViewById(R.id.checkBox85);

        f=findViewById(R.id.checkBox86);
        g=findViewById(R.id.checkBox87);

        h=findViewById(R.id.checkBox88);

        if(a.isChecked()==false && b.isChecked()==true && c.isChecked()==true && d.isChecked()==false && e.isChecked()==true
        && f.isChecked()==true && g.isChecked()==false && h.isChecked()==true){
            ImageView ans=findViewById(R.id.resu8);
            ans.setVisibility(View.VISIBLE);
            ans.setBackgroundResource(R.drawable.correct);
            eight=true;
            //Toast.makeText(quizes.this,String.valueOf(count),Toast.LENGTH_LONG).show();
        }
        else{
            ImageView ans=findViewById(R.id.resu8);
            ans.setVisibility(View.VISIBLE);
            eight=false;
            ans.setBackgroundResource(R.drawable.wrong);
        }

    }
    public void q9(View v){
        CheckBox a,b,c;
        a=findViewById(R.id.checkBox91);
        b=findViewById(R.id.checkBox92);
        c=findViewById(R.id.checkBox93);


        if(a.isChecked()==false && b.isChecked()==false && c.isChecked()==true){
            ImageView ans=findViewById(R.id.resu9);
            ans.setVisibility(View.VISIBLE);
            ans.setBackgroundResource(R.drawable.correct);
            nine=true;
            //Toast.makeText(quizes.this,String.valueOf(count),Toast.LENGTH_LONG).show();
        }
        else{
            ImageView ans=findViewById(R.id.resu9);
            ans.setVisibility(View.VISIBLE);
            nine=false;
            ans.setBackgroundResource(R.drawable.wrong);
        }

    }
    public void q10(View v){
        CheckBox a,b,c;
        a=findViewById(R.id.checkBox101);
        b=findViewById(R.id.checkBox102);
        c=findViewById(R.id.checkBox103);


        if(a.isChecked()==false && b.isChecked()==false && c.isChecked()==true){
            ImageView ans=findViewById(R.id.resu10);
            ans.setVisibility(View.VISIBLE);
            ans.setBackgroundResource(R.drawable.correct);
            ten=true;
            //Toast.makeText(quizes.this,String.valueOf(count),Toast.LENGTH_LONG).show();
        }
        else{
            ImageView ans=findViewById(R.id.resu10);
            ans.setVisibility(View.VISIBLE);
            ten=false;
            ans.setBackgroundResource(R.drawable.wrong);
        }

    }
    public void score(View v){
        Intent in=new Intent(this,score.class);
        int c=0;
        if(one){
            c++;
        }
        if(two){
            c++;
        }
        if(three){
            c++;
        }
        if(four){
            c++;
        }
        if(five){
            c++;
        }
        if(six){
            c++;
        }
        if(seven){
            c++;
        }
        if(eight){
            c++;
        }
        if(nine){
            c++;
        }
        if(ten){
            c++;
        }
Toast.makeText(this,String.valueOf(c),Toast.LENGTH_LONG).show();
        in.putExtra("STRING_I_NEED",String.valueOf(c));
        startActivity(in);
    }

}
