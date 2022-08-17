
        package com.example.ratingapp;
        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.RatingBar;
        import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {
    TextView textView2;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = findViewById(R.id.textView2);
        ratingBar = findViewById(R.id.ratingBar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if(rating==0)
                {
                    textView2.setText("Very BAD");
                }
                else if(rating==1)
                {
                    textView2.setText("BAD");
                }
                else if(rating==2 || rating==3)
                {
                    textView2.setText("AVERAGE");
                }
                else if(rating==4)
                {
                    textView2.setText("GOOD");
                }
                else if(rating==5)
                {
                    textView2.setText("Very GOOD");
                }
                else
                {

                }
            }
        });
    }
}
