package mistypanda.schedulerprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity {

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button next = (Button) findViewById(R.id.button1);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), EventsActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }
}
