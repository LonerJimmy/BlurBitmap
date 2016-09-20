package example.loner.blurbitmapexample;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import loner.jni.ImageUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;
    private TextView ivBlur;
    Bitmap tmpBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.iv_icon);
        ivBlur = (TextView) findViewById(R.id.iv_blur);
        Bitmap localBitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
        tmpBitmap = Bitmap.createScaledBitmap(localBitmap,
                (int) (localBitmap.getWidth()), (int) (localBitmap.getHeight()), true);

        Button button = (Button) findViewById(R.id.btn_blur);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        BitmapDrawable bg = new BitmapDrawable(getResources(), ImageUtil.fastBlur(tmpBitmap, 25));
        ivBlur.setBackground(bg);
    }
}
