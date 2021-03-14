package com.fyp.finage_user;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends Activity {

    String[] CountryNames = {"PAK(+92)", "IND(+91)", "GER(+49)",
            "BRA(+55)","AFG(+54)"};

    ArrayAdapter<String> adapter;
    ListView listView;
    ArrayList<String> listitems;


    TextView countryname;
    TextView countrycode;
    TextView  continue_button;
    EditText phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        countryname = findViewById(R.id.countname);
        countrycode = findViewById(R.id.countcode);
        continue_button = findViewById(R.id.continuebutton);
        phoneNumber = findViewById(R.id.phnumber);






    }


    public void continue_button (View v) {

        final RelativeLayout relativeLayout= findViewById(R.id.contnuetoverify);
        final Animation animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fadein);


        relativeLayout.startAnimation(animFadeIn);
        Intent intent = new Intent(MainActivity.this,Code_Verification.class);
        intent.putExtra("arg", countrycode.getText()+""+phoneNumber.getText());
        startActivity(intent);
    }






    public void openDialog(View v){
        AlertDialog.Builder alertDialog = new
                AlertDialog.Builder(this);
        final View country_code = getLayoutInflater().inflate(R.layout.dialog_countriescode, null);
        listView = country_code.findViewById(R.id.listView);
        listitems=new ArrayList<>(Arrays.asList(CountryNames));
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listitems);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        alertDialog.setView(country_code);
        final AlertDialog dialog = alertDialog.create();

        dialog.show();



        EditText editText = country_code.findViewById(R.id.codesearch);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(charSequence.toString().equals("")){

                    String[] Names = {"PAK(+92)", "IND(+91)", "GER(+49)",
                             "BRA(+55)","AFG(+54)"};


                    listitems=new ArrayList<>(Arrays.asList(Names));

                    adapter=new ArrayAdapter<String>(getApplicationContext(),
                            android.R.layout.simple_list_item_1 , listitems);

                    listView.setAdapter(adapter);

                }
                else {
                    for (String item : CountryNames) {

                        if (!item.contains(charSequence)) {

                            listitems.remove(item);

                        }


                    }

                    adapter.notifyDataSetChanged();
                }
            }
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                 String name = adapterView.getItemAtPosition(i).toString();

                countryname.setText(name.substring(0,3));
                countrycode.setText(name.substring(4,7));
                dialog.cancel();
            }
        });
    }
}