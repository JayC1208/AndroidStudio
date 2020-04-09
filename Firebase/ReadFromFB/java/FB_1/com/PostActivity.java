package FB_1.com;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PostActivity extends AppCompatActivity {

    EditText etText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        ImageView myimg = findViewById(R.id.cam_img);

        Intent intent =getIntent();
        Uri photoUri = intent.getData();

        Bitmap bittimg = (Bitmap) intent.getExtras().get("bitmap");
        try {
            File myFile = bitmap2file(bittimg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        myimg.setImageBitmap(bittimg);
//        Glide.with(this).load(photoUri).into(myimg);  //still not working
//        myimg.setImageURI(photoUri);    //not working

        //Uri -> Bitmap -> File

    }

    //no need...
//    public Bitmap getBitmapFromUri (Uri uri) throws IOException {
//        ParcelFileDescriptor pfd = getContentResolver().openFileDescriptor(uri,"r");
//        FileDescriptor fd = pfd.getFileDescriptor();
//        Bitmap bitimg = BitmapFactory.decodeFileDescriptor(fd);
//        pfd.close();
//        return bitimg;
//    }

    public String makeImgPath(){
        SimpleDateFormat sd = new SimpleDateFormat("yyyyMMdd_hhmmss");
        Date date = new Date();
        String strdate = sd.format(date);
        return strdate+".png";
    }
    public File bitmap2file(Bitmap bitmap) throws IOException {
//        File newFile = new File(getFilesDir(), makeImgPath());  //not working...?
        File newFile = new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES), makeImgPath());
        FileOutputStream fop = new FileOutputStream(newFile);
        bitmap.compress(Bitmap.CompressFormat.PNG,100,fop);
        fop.close();
        return newFile;
    }
}
