package com.example.ettimadai;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.IOException;
import java.util.UUID;

import static com.google.android.gms.common.internal.safeparcel.SafeParcelable.NULL;

public class Register extends AppCompatActivity {
    FirebaseStorage storage;
    StorageReference storageReference;
    private Button btnSelect, btnUpload;
    ProgressDialog progressDialog;
    // view for image view
    private ImageView imageView;

    // Uri indicates, where the image will be picked from
    private Uri filePath;
    DatabaseReference reff;
    // request code
    private final int PICK_IMAGE_REQUEST = 22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        SharedPreferences pref = getSharedPreferences("ActivityPREF", Context.MODE_PRIVATE);
        if(pref.getBoolean("activity_executed", false)){
            Intent intent = new Intent(this, menuactivity.class);
            startActivity(intent);
            finish();
        } else {
            SharedPreferences.Editor ed = pref.edit();
            ed.putBoolean("activity_executed", true);
            ed.commit();
        }
//        ActionBar actionBar;
//        actionBar = getSupportActionBar();
//        ColorDrawable colorDrawable
//                = new ColorDrawable(
//                Color.parseColor("#0F9D58"));
//        actionBar.setBackgroundDrawable(colorDrawable);

        // initialise views
        btnSelect = findViewById(R.id.btnChoose);
        btnUpload = findViewById(R.id.btnUpload);
        imageView = findViewById(R.id.imgView);

        // get the Firebase  storage reference
        storage = FirebaseStorage.getInstance();
        storageReference = storage.getReference();

        // on pressing btnSelect SelectImage() is called
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                SelectImage();

            }
        });

        // on pressing btnUpload uploadImage() is called
        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                uploadImage();
            }
        });
//        UploadButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                // Calling method to upload selected image on Firebase storage.
//                UploadImageFileToFirebaseStorage();
//
//            }
//        });
    }
    public void submitfirebase(View v)
    {
        reff= FirebaseDatabase.getInstance().getReference().child("Users");
        Member member=new Member();
        String aadhar,mobile,name,age,address;
        EditText e1,e2,e3,e4,e5;
        e1=findViewById(R.id.aadhar);
        e2=findViewById(R.id.mobile);
        e3=findViewById(R.id.name);
        e4=findViewById(R.id.age);
        e5=findViewById(R.id.address);

        if(e1.getText().toString()==NULL || e2.getText().toString()==NULL ){
            Toast.makeText(Register.this,"Please fill all the details properly!",Toast.LENGTH_LONG).show();
        }
        else{
            aadhar=e1.getText().toString();
            mobile=e2.getText().toString();
            name=e3.getText().toString();
            age=e4.getText().toString();
            address=e5.getText().toString();

            member.setAadhar(aadhar);
        member.setMobile(mobile);
            member.setName(name);
            member.setAge(age);
            member.setAddress(address);



            reff.child(aadhar).setValue(member);
            Toast.makeText(Register.this,"data inserted",Toast.LENGTH_LONG).show();
            Intent in=new Intent(this,menuactivity.class);
            startActivity(in);
        }
    }
    public void video(View v){
        Intent in=new Intent(this,menuactivity.class);
        startActivity(in);
    }
    private void SelectImage()
    {

        // Defining Implicit Intent to mobile gallery
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(
                Intent.createChooser(
                        intent,
                        "Select Image from here..."),
                PICK_IMAGE_REQUEST);
    }

    // Override onActivityResult method
    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode,
                                    Intent data)
    {

        super.onActivityResult(requestCode,
                resultCode,
                data);
        if (requestCode == PICK_IMAGE_REQUEST
                && resultCode == RESULT_OK
                && data != null
                && data.getData() != null) {

            filePath = data.getData();
            try {

                Bitmap bitmap = MediaStore
                        .Images
                        .Media
                        .getBitmap(
                                getContentResolver(),
                                filePath);
                imageView.setImageBitmap(bitmap);
                uploadImage();
            }

            catch (IOException e) {
                // Log the exception
                e.printStackTrace();
            }
        }
    }

    // UploadImage method
    private void uploadImage()
    {
        if (filePath != null) {
             progressDialog
                    = new ProgressDialog(this);
            progressDialog.setTitle("Uploading...");
            progressDialog.show();

            // Defining the child of storageReference
            StorageReference ref = storageReference.child("images/" + UUID.randomUUID().toString());

            ref.putFile(filePath).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {

                                @Override
                                public void onSuccess(
                                        UploadTask.TaskSnapshot taskSnapshot)
                                {

                                    // Image uploaded successfully
                                    // Dismiss dialog
                                    progressDialog.dismiss();
                                    Toast.makeText(Register.this,
                                                    "Image Uploaded!!",
                                                    Toast.LENGTH_SHORT)
                                            .show();
                                }
                            })

                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e)
                        {

                            // Error, Image not uploaded
                            progressDialog.dismiss();
                            Toast
                                    .makeText(Register.this,
                                            "Failed " + e.getMessage(),
                                            Toast.LENGTH_SHORT)
                                    .show();
                        }
                    })
                    .addOnProgressListener(
                            new OnProgressListener<UploadTask.TaskSnapshot>() {

                                // Progress Listener for loading
                                // percentage on the dialog box
                                @Override
                                public void onProgress(
                                        UploadTask.TaskSnapshot taskSnapshot)
                                {
                                    double progress
                                            = (100.0
                                            * taskSnapshot.getBytesTransferred()
                                            / taskSnapshot.getTotalByteCount());
                                    progressDialog.setMessage(
                                            "Uploaded "
                                                    + (int)progress + "%");
                                }
                            });
        }}
    }
