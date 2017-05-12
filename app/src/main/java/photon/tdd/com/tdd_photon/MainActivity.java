package photon.tdd.com.tdd_photon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context ctx;
    EditText et1, et2;
    Button b1;
    int row = 0, col = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ctx = this;
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    row = Integer.parseInt(et1.getText().toString());
                    col = Integer.parseInt(et2.getText().toString());
                    if (col > 10)
                        Globals.showAlert(ctx, "Sorry!", "Max col size is 10 because the int value can hold upto 32500 approx. only.");
                    else if (col >= 1) {
                        Intent i = new Intent(ctx, Mat.class);
                        i.putExtra("row", row);
                        i.putExtra("col", col);
                        startActivity(i);
                    } else if (col < 1)
                        Globals.showAlert(ctx, "No input!", "Improper value detected. Please enter a number greater than 0.");
                } catch (NumberFormatException nfe) {
                    nfe.printStackTrace();
                    Globals.showAlert(ctx, "Non numeric!", "Invalid Matrix.");
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(ctx, "Something went wrong.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
