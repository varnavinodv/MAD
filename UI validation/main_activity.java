package com.example.uivalidation;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText, passwordEditText;
    private CheckBox agreeCheckBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Initialize UI controls
        usernameEditText = findViewById(R.id.editTextUsername);
        passwordEditText = findViewById(R.id.editTextPassword);
        agreeCheckBox = findViewById(R.id.checkBoxAgree);
        Button submitButton = findViewById(R.id.buttonSubmit);
// Set click listener for the submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                validateForm();
            }
        });
    }
    private void validateForm() {
        String username = usernameEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();
        boolean agreeChecked = agreeCheckBox.isChecked();
        boolean isValid = true;
// Username validation
        if (TextUtils.isEmpty(username)) {
            usernameEditText.setError("Username is required");
            isValid = false;
        } else {
            usernameEditText.setError(null);
        }
// Password validation
        if (TextUtils.isEmpty(password)) {
            passwordEditText.setError("Password is required");
            isValid = false;
        } else {
            passwordEditText.setError(null);
        }

// Checkbox validation
        if (!agreeChecked) {
            Toast.makeText(this, "You must agree to the terms and conditions",
            Toast.LENGTH_SHORT).show();
            isValid = false;
        }
// If all validations pass, proceed with further actions
        if (isValid) {
// Perform actions such as submitting the form or navigating to the next screen

            Toast.makeText(this, "Form submitted successfully",
            Toast.LENGTH_SHORT).show();
        }
    }
}
