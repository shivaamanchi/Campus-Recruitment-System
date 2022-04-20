package com.example.myproject;


public class CompanySignUpActivity extends AppCompatActivity {

    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_sign_up);


        signup = findViewById(R.id.signUpButton2);


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_company_dashboard);

            }
        });


    }
}

