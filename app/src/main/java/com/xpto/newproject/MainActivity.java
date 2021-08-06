package com.xpto.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this se refere a MainActivity
        this.mViewHolder.editName = findViewById(R.id.edit_Name2);
        this.mViewHolder.editTelephone = findViewById(R.id.edit_Telephone2);
        this.mViewHolder.textName = findViewById(R.id.text_Name);
        this.mViewHolder.editEmail = findViewById(R.id.edit_Email);
        this.mViewHolder.textEmail = findViewById(R.id.text_Email);
        this.mViewHolder.textTelephone = findViewById(R.id.text_Telephone);
        this.mViewHolder.buttonSend = findViewById(R.id.button_Send);
        //onclick é um callback, espera ser chamado.
        this.mViewHolder.buttonSend.setOnClickListener(this);
        this.clearValues();
        //viewholder
        //mapeia os findviewbyid de uma vez

    }



    private void clearValues() {
        this.mViewHolder.editTelephone.setText("");
        this.mViewHolder.editName.setText("");
        this.mViewHolder.editEmail.setText("");
    }

    @Override
    public void onClick(View view) {
        //codigo do onclick this
        if (view.getId() == R.id.button_Send) {
            String value = this.mViewHolder.editName.getText().toString();
            String value2 = this.mViewHolder.editEmail.getText().toString();
            String value3 = this.mViewHolder.editEmail.getText().toString();
            if ("".equals(value)) {
                //mostra mensagem para o usuario
                Toast.makeText(this, this.getString(R.string.enter_name), Toast.LENGTH_SHORT).show();
            }
            if ("".equals(value3)) {
                //mostra mensagem para o usuario
                for (int i = 0; i < 1; i++) {
                    Toast.makeText(this, this.getString(R.string.enter_telephone), Toast.LENGTH_SHORT).show();
                }
            }
            if ("".equals(value2)) {
                //mostra mensagem para o usuario
                for (int i = 0; i < 2; i++) {
                    Toast.makeText(this, this.getString(R.string.enter_email), Toast.LENGTH_SHORT).show();
                }
            } else {
                clearValues();
            }
        }
    }


    private static class ViewHolder {
        Button   mButton;
        EditText mEdit;
        EditText editName;
        EditText editTelephone;
        TextView textName;
        EditText editEmail;
        TextView textEmail;
        TextView textTelephone;
        Button buttonSend;

    }

}