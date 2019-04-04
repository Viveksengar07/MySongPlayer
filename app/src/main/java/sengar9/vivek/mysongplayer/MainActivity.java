package sengar9.vivek.mysongplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button playbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playbutton=findViewById(R.id.button3);

        final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.song);
        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                if (mediaPlayer.isPlaying())
                {
                    playbutton.setText("Pause");
                    mediaPlayer.pause();
                }
                else
                {
                    playbutton.setText("Play");
                    mediaPlayer.start();
                }
            }
        });


    }
}
