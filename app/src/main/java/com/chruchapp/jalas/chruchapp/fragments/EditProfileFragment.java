package com.chruchapp.jalas.chruchapp.fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.data.DataModelLogin;
import com.chruchapp.jalas.chruchapp.data.DataModelUpdate;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;
import com.chruchapp.jalas.chruchapp.screens.EditProfile;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EditProfileFragment extends Fragment
{
    private Context context;
    private View v;


    @BindView(R.id.name)
    TextView nametext;
    @BindView(R.id.surname) TextView surnametext;
    @BindView(R.id.knownas) TextView knownastext;
    @BindView(R.id.gender) TextView gendertext;
    @BindView(R.id.age) TextView agetext;
    @BindView(R.id.email) TextView emailtext;
    @BindView(R.id.mobile) TextView mobiletext;
    @BindView(R.id.address) TextView addresstext;
    @BindView(R.id.profession) TextView professiontext;
    @BindView(R.id.interest) TextView interesttext;
    @BindView(R.id.otheractivities) TextView otheractivitiestext;
    //@BindView(R.id.dateCreated) TextView dateCreatedtext;
    @BindView(R.id.username) TextView usernametext;
    @BindView(R.id.password) TextView passwordtext;
    @BindView(R.id.chruch) TextView chruch;
    @BindView(R.id.userstatus) TextView userstatus;
    @BindView(R.id.cellGroup) TextView cellGroup;
    @BindView(R.id.ministry) TextView ministry;
    @BindView(R.id.branch) TextView branch;

    @BindView(R.id.editname)
    EditText editname;
    @BindView(R.id.editsurname) EditText editsurname;
    @BindView(R.id.editknownas) EditText editknownas;
    @BindView(R.id.editeage) EditText editage;
    @BindView(R.id.editemail) EditText editemail;
    @BindView(R.id.editmobile) EditText editmobile;
    @BindView(R.id.editaddress) EditText editaddress;
    @BindView(R.id.editprofession) EditText editprofession;
    @BindView(R.id.editinterest) EditText editinterest;
    @BindView(R.id.editotheractivities) EditText editotheractivities;
    @BindView(R.id.usernametext) TextView username;
    @BindView(R.id.editpassword) TextView password;
    //@BindView(R.id.editdatecreated) EditText editdatecreated;

    Typeface custom_font,custom_font1;

    private RadioGroup radioGroup;
    private RadioButton radioButton1,radioButton2;
    private String genderText;
    private APIService mAPIService;
    DataModelLogin data;
    DataModelUpdate dataModelUpdate = new DataModelUpdate();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.activity_edit_profile, container, false);
        context = getActivity();
        ButterKnife.bind(context,v);

        mAPIService = ApiCall.getAPIService();

        custom_font  = Typeface.createFromAsset(context.getAssets(), "fonts/LatoRegular.ttf");
        custom_font1 = Typeface.createFromAsset(context.getAssets(), "fonts/LatoLight.ttf");
        setTypefaceForTextView();
        setTypefaceForEditTextView();

        radioGroup = v.findViewById(R.id.radioGroup);
        radioButton1 = v.findViewById(R.id.radioButton1);
        radioButton2 = v.findViewById(R.id.radioButton2);

        /*Intent intent = context.getIntent();
        data = intent.getParcelableExtra("DataModelLogin");
        editname.setText(data.getName());
        editsurname.setText(data.getSurname());
        editknownas.setText(data.getKnownAs());
        editage.setText(String.valueOf(data.getAge()));
        editemail.setText(data.getEmailAddress());
        editmobile.setText(data.getMobileNumber());
        editaddress.setText(data.getAddress());
        editprofession.setText(data.getProfession());
        editinterest.setText(data.getInterests());
        editotheractivities.setText(data.getOtherActivities());
        // editdatecreated.setText(data.getDtCreated());
        username.setText(data.getUsername());
        password.setText(data.getPassword());*/

      /*  String gender = data.getGender();
        if(gender != null && gender.equalsIgnoreCase("Male"))
        {
            radioButton1.setChecked(true);
            radioButton2.setChecked(false);
        }
        else if (gender != null && gender.equalsIgnoreCase("Female"))
        {
            radioButton1.setChecked(false);
            radioButton2.setChecked(true);
        }*/

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton rb =  radioGroup.findViewById(checkedId);
                if(rb != null)
                {
                    genderText = rb.getText().toString();
                }
            }
        });

        //System.out.println("name ===="+data.getName());

        return v;
    }

    @OnClick(R.id.update)
    public void update()
    {
        System.out.println("data === "+data.getId());
        dataModelUpdate.setId(data.getId());
        dataModelUpdate.setName(editname.getText().toString());
        dataModelUpdate.setSurname(editsurname.getText().toString());
        dataModelUpdate.setKnownAs(editknownas.getText().toString());
        if(genderText!=null) {
            dataModelUpdate.setGender(genderText);
        }
        dataModelUpdate.setAge(Integer.valueOf(editage.getText().toString()));
        dataModelUpdate.setEmailAddress(editemail.getText().toString());
        dataModelUpdate.setMobileNumber(editmobile.getText().toString());
        dataModelUpdate.setAddress(editaddress.getText().toString());
        dataModelUpdate.setProfession(editprofession.getText().toString());
        dataModelUpdate.setInterests(editinterest.getText().toString());
        dataModelUpdate.setOtherActivities(editotheractivities.getText().toString());
        dataModelUpdate.setUsername(data.getUsername());
        dataModelUpdate.setPassword(password.getText().toString());
        dataModelUpdate.setChurchId(1);
        dataModelUpdate.setUserStatusId(1);
        dataModelUpdate.setCellGroupId(1);
        dataModelUpdate.setMinistryId(1);
        dataModelUpdate.setBranchId(1);
        // dataModelUpdate.setDtCreated(data.getDtCreated());
        // System.out.println("date =="+data.getDtCreated());
        updateApi(dataModelUpdate);

        //     createApiCall(userName,password);
    }

    private void updateApi(DataModelUpdate dataModelUpdate)
    {
        mAPIService.savePostUpdate(dataModelUpdate).enqueue(new retrofit2.Callback<DataModelUpdate>() {
            @Override
            public void onResponse(retrofit2.Call<DataModelUpdate> call, retrofit2.Response<DataModelUpdate> response) {
                if(response.isSuccessful())
                {
                    Toast.makeText(context,"Profile Updated...",Toast.LENGTH_LONG).show();
                }
            }
            @Override
            public void onFailure(retrofit2.Call<DataModelUpdate> call, Throwable t) {
                Log.e("Suresh", "Unable to submit post to API."+t.getMessage());
            }
        });
    }

    private void setTypefaceForEditTextView() {
       /* editname.setTypeface(custom_font1);
        editsurname.setTypeface(custom_font1);
        editknownas.setTypeface(custom_font1);
        editage.setTypeface(custom_font1);
        editemail.setTypeface(custom_font1);
        editmobile.setTypeface(custom_font1);
        editaddress.setTypeface(custom_font1);
        editprofession.setTypeface(custom_font1);
        editinterest.setTypeface(custom_font1);
        editotheractivities.setTypeface(custom_font1);*/
        //editdatecreated.setTypeface(custom_font1);
    }

    private void setTypefaceForTextView()
    {
       /* nametext.setTypeface(custom_font);
        surnametext.setTypeface(custom_font);
        knownastext.setTypeface(custom_font);
        gendertext.setTypeface(custom_font);
        agetext.setTypeface(custom_font);
        emailtext.setTypeface(custom_font);
        mobiletext.setTypeface(custom_font);
        addresstext.setTypeface(custom_font);
        professiontext.setTypeface(custom_font);
        interesttext.setTypeface(custom_font);
        otheractivitiestext.setTypeface(custom_font);
        //dateCreatedtext.setTypeface(custom_font);
        usernametext.setTypeface(custom_font);
        passwordtext.setTypeface(custom_font);
        chruch.setTypeface(custom_font);
        userstatus.setTypeface(custom_font);
        cellGroup.setTypeface(custom_font);
        ministry.setTypeface(custom_font);
        branch.setTypeface(custom_font);*/
    }
}
