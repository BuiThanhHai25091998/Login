package com.dmt.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class goPage extends AppCompatActivity {
    Button thoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_page);
        thoat = (Button) findViewById(R.id.thoat);
        logOut();
    }

    private void logOut() {
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(goPage.this);
                alertDialog.setTitle("Bạn Chac Thoat Không");
                alertDialog.setIcon(R.drawable.fb);
                alertDialog.setMessage("Co arr Khong");
                alertDialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

                alertDialog.setNegativeButton("Khong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(goPage.this,"Không THoát",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.create();
                alertDialog.show();
            }
        });
    }
}