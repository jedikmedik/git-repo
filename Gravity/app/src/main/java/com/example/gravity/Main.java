package com.example.gravity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.gravity.scenes.MainMenuScene;
import com.example.my_frameworck.CoreFW;
import com.example.my_frameworck.SceneFW;

public class Main extends CoreFW {

    public SceneFW getStartScene(){
        return new MainMenuScene(this);
    }
}