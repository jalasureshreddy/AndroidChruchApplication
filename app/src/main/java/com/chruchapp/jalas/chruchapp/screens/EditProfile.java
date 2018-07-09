package com.chruchapp.jalas.chruchapp.screens;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.chruchapp.jalas.chruchapp.R;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class EditProfile extends AppCompatActivity {

    @BindView(R.id.name) TextView nametext;
    @BindView(R.id.surname) TextView surnametext;
    @BindView(R.id.knownas) TextView knownastext;
    @BindView(R.id.gender) TextView gendertext;
    @BindView(R.id.email) TextView emailtext;
    @BindView(R.id.mobile) TextView mobiletext;
    @BindView(R.id.address) TextView addresstext;
    @BindView(R.id.profession) TextView professiontext;
    @BindView(R.id.interest) TextView interesttext;
    @BindView(R.id.otheractivities) TextView otheractivitiestext;
    @BindView(R.id.dateCreated) TextView dateCreatedtext;
    @BindView(R.id.username) TextView usernametext;
    @BindView(R.id.password) TextView passwordtext;
    @BindView(R.id.chruch) TextView chruch;
    @BindView(R.id.userstatus) TextView userstatus;
    @BindView(R.id.cellGroup) TextView cellGroup;
    @BindView(R.id.ministry) TextView ministry;
    @BindView(R.id.branch) TextView branch;

    @BindView(R.id.editname) EditText editname;
    @BindView(R.id.editsurname) EditText editsurname;
    @BindView(R.id.editknownas) EditText editknownas;
    @BindView(R.id.editemail) EditText editemail;
    @BindView(R.id.editmobile) EditText editmobile;
    @BindView(R.id.editaddress) EditText editaddress;
    @BindView(R.id.editprofession) EditText editprofession;
    @BindView(R.id.editinterest) EditText editinterest;
    @BindView(R.id.editotheractivities) EditText editotheractivities;
    @BindView(R.id.editdatecreated) EditText editdatecreated;

    Typeface custom_font,custom_font1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        ButterKnife.bind(this);
        custom_font  = Typeface.createFromAsset(getAssets(), "fonts/LatoRegular.ttf");
        custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/LatoLight.ttf");
        setTypefaceForTextView();
        setTypefaceForEditTextView();

    }

    private void setTypefaceForEditTextView() {
        editname.setTypeface(custom_font1);
        editsurname.setTypeface(custom_font1);
        editknownas.setTypeface(custom_font1);
        editemail.setTypeface(custom_font1);
        editmobile.setTypeface(custom_font1);
        editaddress.setTypeface(custom_font1);
        editprofession.setTypeface(custom_font1);
        editinterest.setTypeface(custom_font1);
        editotheractivities.setTypeface(custom_font1);
        editdatecreated.setTypeface(custom_font1);
    }

    private void setTypefaceForTextView()
    {
        nametext.setTypeface(custom_font);
        surnametext.setTypeface(custom_font);
        knownastext.setTypeface(custom_font);
        gendertext.setTypeface(custom_font);
        emailtext.setTypeface(custom_font);
        mobiletext.setTypeface(custom_font);
        addresstext.setTypeface(custom_font);
        professiontext.setTypeface(custom_font);
        interesttext.setTypeface(custom_font);
        otheractivitiestext.setTypeface(custom_font);
        dateCreatedtext.setTypeface(custom_font);
        usernametext.setTypeface(custom_font);
        passwordtext.setTypeface(custom_font);
        chruch.setTypeface(custom_font);
        userstatus.setTypeface(custom_font);
        cellGroup.setTypeface(custom_font);
        ministry.setTypeface(custom_font);
        branch.setTypeface(custom_font);
    }
}
