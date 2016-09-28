package example.loner.blurbitmapexample;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import loner.jni.ImageUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;
    private TextView ivBlur;
    private Bitmap localBitmap;
    private boolean isBlur = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.iv_icon);
        ivBlur = (TextView) findViewById(R.id.iv_blur);
        localBitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();

        Button button = (Button) findViewById(R.id.btn_blur);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (!isBlur) {
            BitmapDrawable bg = new BitmapDrawable(getResources(), ImageUtil.fastBlur(localBitmap, 25));
            ivBlur.setBackground(bg);
            isBlur = !isBlur;
        } else {
            ivBlur.setBackgroundResource(R.drawable.img);
            isBlur = !isBlur;
        }
    }
}
