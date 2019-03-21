package br.com.candev.aajm.activity;

import android.os.Bundle;
import android.view.View;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

import br.com.candev.aajm.R;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setFullscreen(true);
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_1)
                .build());

        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_2)
                .build());

        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_3)
                .build());

        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_4)
                .build());

        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_cadastro)
                .canGoForward(false)
                .build());
    }

    public void btEntrar(View view){
        //startActivity(new Intent(this, LoginActivity.class));
    }

    public void btCadastrar(View view){
        //startActivity(new Intent(this, CadastroActivity.class));
    }
}
