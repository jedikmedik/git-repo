package com.example.gravity.scenes;

import android.graphics.Color;

import com.example.my_frameworck.CoreFW;
import com.example.my_frameworck.SceneFW;

public class GameScene extends SceneFW {

    public GameScene(CoreFW coreFW) {
        super(coreFW);
    }

    @Override
    public void update() {
    }

    @Override
    public void drawing() {
        graphicsFW.clearScene(Color.BLACK);
        graphicsFW.drawText("Игровая сцена", 100, 150, Color.GREEN, 60, null);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
