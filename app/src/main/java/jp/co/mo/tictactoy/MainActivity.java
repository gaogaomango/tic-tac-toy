package jp.co.mo.tictactoy;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private static final int PLAYER_1_ID = 1;
    private static final int PLAYER_2_ID = PLAYER_1_ID + 1;

    private static final int BTN_ID_1 = 1;
    private static final int BTN_ID_2 = BTN_ID_1 + 1;
    private static final int BTN_ID_3 = BTN_ID_2 + +1;
    private static final int BTN_ID_4 = BTN_ID_3 + +1;
    private static final int BTN_ID_5 = BTN_ID_4 + +1;
    private static final int BTN_ID_6 = BTN_ID_5 + +1;
    private static final int BTN_ID_7 = BTN_ID_6 + +1;
    private static final int BTN_ID_8 = BTN_ID_7 + +1;
    private static final int BTN_ID_9 = BTN_ID_8 + +1;

    private int activePlayer = 0; // 1- for first, 2 for second
    List<Integer> player1; // hold player 1 data
    List<Integer> player2; // hold player 2 data

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_main);
        setElement();
    }

    private void setElement() {
        activePlayer = PLAYER_1_ID; // 1- for first, 2 for second
        player1 = new ArrayList<>();
        player2 = new ArrayList<>();
    }

    public void btnClick(View view) {
        Button selectedBtn = (Button) view;
        int cellId = 0;
        switch (selectedBtn.getId()) {
            case R.id.btn1:
                cellId = BTN_ID_1;
                break;
            case R.id.btn2:
                cellId = BTN_ID_2;
                break;
            case R.id.btn3:
                cellId = BTN_ID_3;
                break;
            case R.id.btn4:
                cellId = BTN_ID_4;
                break;
            case R.id.btn5:
                cellId = BTN_ID_5;
                break;
            case R.id.btn6:
                cellId = BTN_ID_6;
                break;
            case R.id.btn7:
                cellId = BTN_ID_7;
                break;
            case R.id.btn8:
                cellId = BTN_ID_8;
                break;
            case R.id.btn9:
                cellId = BTN_ID_9;
                break;
        }
        playGame(cellId, selectedBtn);
    }

    private void playGame(int cellId, Button selectedBtn) {
        Log.d(TAG, "cell id: " + String.valueOf(cellId));

        if(activePlayer == PLAYER_1_ID) {
            selectedBtn.setText("x");
            selectedBtn.setBackgroundColor(Color.GREEN);
            player1.add(cellId);
            activePlayer = PLAYER_2_ID;
        } else if(activePlayer == PLAYER_2_ID) {
            selectedBtn.setText("0");
            selectedBtn.setBackgroundColor(Color.BLUE);
            player2.add(cellId);
            activePlayer = PLAYER_1_ID;
        }
    }
}
