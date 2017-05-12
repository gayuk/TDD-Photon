package photon.tdd.com.tdd_photon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

public class MainActz extends AppCompatActivity {
    TextView tcost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        tcost = (TextView) findViewById(R.id.cost);
        seeTraverse();
    }

    public void seeTraverse() {
        MatrixTraverse mat = new MatrixTraverse(Mat.arr);
        List<String> trList = mat.traverse(Mat.arr);
        tcost.setText(" " + trList.get(2) + "\n Traversecost:  " + trList.get(0) + " \n Traverse path " + trList.get(1));
    }
}
