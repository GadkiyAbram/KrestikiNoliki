package com.example.aleksandrabramovski.zeros;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    initializing result arrays
    public int[][] result = new int[3][3];
    public boolean[] button = new boolean[9];
    public boolean mrObamaDisplay = false;
//
    public TextView mTextViewArrayResult;
    public boolean firstPlayer = true;
    public boolean secondPlayer = false;
    public int n;

//    initializing extra text field for result determining
    public Button mButtonResultArray1;
    public Button mButtonResultArray2;
    public Button mButtonResultArray3;
    public Button mButtonResultArray4;
    public Button mButtonResultArray5;
    public Button mButtonResultArray6;
    public Button mButtonResultArray7;
    public Button mButtonResultArray8;
    public Button mButtonResultArray9;
//    initializing method of not clicking buttons
    public boolean button1;
    public boolean button2;
    public boolean button3;
    public boolean button4;
    public boolean button5;
    public boolean button6;
    public boolean button7;
    public boolean button8;
    public boolean button9;
    public boolean startGame;
    public Button mButtonStartGame;
    public ImageView mImageViewNotBad;
    public ImageView mImageViewLosers;
    //    initializing buttons
    public ImageButton mButton1;
    public ImageButton mButton2;
    public ImageButton mButton3;
    public ImageButton mButton4;
    public ImageButton mButton5;
    public ImageButton mButton6;
    public ImageButton mButton7;
    public ImageButton mButton8;
    public ImageButton mButton9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonStartGame = (Button)findViewById(R.id.buttonStartGame);
        mTextViewArrayResult = (TextView)findViewById(R.id.textViewArrayResult);
        mImageViewNotBad = (ImageView)findViewById(R.id.imageViewNotBad);
        mImageViewLosers = (ImageView)findViewById(R.id.imageViewLosers);
        mButton1 = (ImageButton)findViewById(R.id.imageButton1);
        mButton2 = (ImageButton)findViewById(R.id.imageButton2);
        mButton3 = (ImageButton)findViewById(R.id.imageButton3);
        mButton4 = (ImageButton)findViewById(R.id.imageButton4);
        mButton5 = (ImageButton)findViewById(R.id.imageButton5);
        mButton6 = (ImageButton)findViewById(R.id.imageButton6);
        mButton7 = (ImageButton)findViewById(R.id.imageButton7);
        mButton8 = (ImageButton)findViewById(R.id.imageButton8);
        mButton9 = (ImageButton)findViewById(R.id.imageButton9);
        mButtonResultArray1 = (Button)findViewById(R.id.button1);
        mButtonResultArray2 = (Button)findViewById(R.id.button2);
        mButtonResultArray3 = (Button)findViewById(R.id.button3);
        mButtonResultArray4 = (Button)findViewById(R.id.button4);
        mButtonResultArray5 = (Button)findViewById(R.id.button5);
        mButtonResultArray6 = (Button)findViewById(R.id.button6);
        mButtonResultArray7 = (Button)findViewById(R.id.button7);
        mButtonResultArray8 = (Button)findViewById(R.id.button8);
        mButtonResultArray9 = (Button)findViewById(R.id.button9);
        onCreateGame();
    }

    public void onCreateGame(){
        int mCountForResult = 3;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                result[i][j] = mCountForResult++;
            }
        }
    }

    public void onClickResetGame(View view) {
        mButton1.setImageResource(R.drawable.part001);
        mButton2.setImageResource(R.drawable.part002);
        mButton3.setImageResource(R.drawable.part003);
        mButton4.setImageResource(R.drawable.part004);
        mButton5.setImageResource(R.drawable.part005);
        mButton6.setImageResource(R.drawable.part006);
        mButton7.setImageResource(R.drawable.part007);
        mButton8.setImageResource(R.drawable.part008);
        mButton9.setImageResource(R.drawable.part009);
        mButtonResultArray1.setText(" ");
        mButtonResultArray2.setText(" ");
        mButtonResultArray3.setText(" ");
        mButtonResultArray4.setText(" ");
        mButtonResultArray5.setText(" ");
        mButtonResultArray6.setText(" ");
        mButtonResultArray7.setText(" ");
        mButtonResultArray8.setText(" ");
        mButtonResultArray9.setText(" ");
        n = 1;
        startGame = false;
        mrObamaDisplay = false;
        mButtonStartGame.setText("Start game");
        mImageViewNotBad.setImageResource(R.drawable.abc_action_bar_item_background_material);
        mImageViewLosers.setImageResource(R.drawable.abc_action_bar_item_background_material);
        onCreateGame();
    }

    public void onClickStartGame(View view) {
        startGame = true;
        button1 = true;
        button2 = true;
        button3 = true;
        button4 = true;
        button5 = true;
        button6 = true;
        button7 = true;
        button8 = true;
        button9 = true;
        n = 1;
        mButtonStartGame.setText("Game started");
        mTextViewArrayResult.setText("");
        onCreateGame();
    }

    public void onClickButton1(View view) {
        if (startGame == true && button1 == true){
            if (n == 1){
                mButton1.setImageResource(R.drawable.mx);
                n = 0;
                result[0][0] = 1;
                mButtonResultArray1.setText("" + result[0][0]);
            } else if (n == 0){
                mButton1.setImageResource(R.drawable.mo);
                n = 1;
                result[0][0] = 0;
                mButtonResultArray1.setText("" + result[0][0]);
            }
        }
            mTextViewArrayResult.setText("" + startGame);
        button1 = false;
        checkWinner();
        mrObamaDisplay();
    }

    public void onClickButton2(View view) {
        if (startGame == true && button2 == true){
            if (n == 1){
                mButton2.setImageResource(R.drawable.mx);
                n = 0;
                result[0][1] = 1;
                mButtonResultArray2.setText("" + result[0][1]);
            } else if (n == 0){
                mButton2.setImageResource(R.drawable.mo);
                n = 1;
                result[0][1] = 0;
                mButtonResultArray2.setText("" + result[0][1]);
            }
        }
            mTextViewArrayResult.setText("" + startGame);
        button2 = false;
        checkWinner();
        mrObamaDisplay();
    }

    public void onClickButton3(View view) {
        if (startGame == true && button3 == true){
            if (n == 1){
                mButton3.setImageResource(R.drawable.mx);
                n = 0;
                result[0][2] = 1;
                mButtonResultArray3.setText("" + result[0][2]);
            } else if (n == 0){
                mButton3.setImageResource(R.drawable.mo);
                n = 1;
                result[0][2] = 0;
                mButtonResultArray3.setText("" + result[0][2]);
            }
        }
            mTextViewArrayResult.setText("" + startGame);
        button3 = false;
        checkWinner();
        mrObamaDisplay();
    }

    public void onClickButton4(View view) {
        if (startGame == true && button4 == true){
            if (n == 1){
                mButton4.setImageResource(R.drawable.mx);
                n = 0;
                result[1][0] = 1;
                mButtonResultArray4.setText("" + result[1][0]);
            } else if (n == 0){
                mButton4.setImageResource(R.drawable.mo);
                n = 1;
                result[1][0] = 0;
                mButtonResultArray4.setText("" + result[1][0]);
            }
        }
            mTextViewArrayResult.setText("" + startGame);
        button4 = false;
        checkWinner();
        mrObamaDisplay();
    }

    public void onClickButton5(View view) {
        if (startGame == true && button5 == true){
            if (n == 1){
                mButton5.setImageResource(R.drawable.mx);
                n = 0;
                result[1][1] = 1;
                mButtonResultArray5.setText("" + result[1][1]);
            } else if (n == 0){
                mButton5.setImageResource(R.drawable.mo);
                n = 1;
                result[1][1] = 0;
                mButtonResultArray5.setText("" + result[1][1]);
            }
        }
            mTextViewArrayResult.setText("" + startGame);
        button5 = false;
        checkWinner();
        mrObamaDisplay();
    }

    public void onClickButton6(View view) {
        if (startGame == true && button6 == true){
            if (n == 1){
                mButton6.setImageResource(R.drawable.mx);
                n = 0;
                result[1][2] = 1;
                mButtonResultArray6.setText("" + result[1][2]);
            } else if (n == 0){
                mButton6.setImageResource(R.drawable.mo);
                n = 1;
                result[1][2] = 0;
                mButtonResultArray6.setText("" + result[1][2]);
            }
        }
            mTextViewArrayResult.setText("" + startGame);
        button6 = false;
        checkWinner();
        mrObamaDisplay();
    }

    public void onClickButton7(View view) {
        if (startGame == true && button7 == true){
            if (n == 1){
                mButton7.setImageResource(R.drawable.mx);
                n = 0;
                result[2][0] = 1;
                mButtonResultArray7.setText("" + result[2][0]);
            } else if (n == 0){
                mButton7.setImageResource(R.drawable.mo);
                n = 1;
                result[2][0] = 0;
                mButtonResultArray7.setText("" + result[2][0]);
            }
        }
            mTextViewArrayResult.setText("" + startGame);
        button7 = false;
        checkWinner();
        mrObamaDisplay();
    }

    public void onClickButton8(View view) {
        if (startGame == true && button8 == true){
            if (n == 1){
                mButton8.setImageResource(R.drawable.mx);
                n = 0;
                result[2][1] = 1;
                mButtonResultArray8.setText("" + result[2][1]);
            } else if (n == 0){
                mButton8.setImageResource(R.drawable.mo);
                n = 1;
                result[2][1] = 0;
                mButtonResultArray8.setText("" + result[2][1]);
            }
        }
            mTextViewArrayResult.setText("" + startGame);
        button8 = false;
        checkWinner();
        mrObamaDisplay();
    }

    public void onClickButton9(View view) {
        if (startGame == true && button9 == true){
            if (n == 1){
                mButton9.setImageResource(R.drawable.mx);
                n = 0;
                result[2][2] = 1;
                mButtonResultArray9.setText("" + result[2][2]);
            } else if (n == 0){
                mButton9.setImageResource(R.drawable.mo);
                n = 1;
                result[2][2] = 0;
                mButtonResultArray9.setText("" + result[2][2]);
            }
        }
            mTextViewArrayResult.setText("" + startGame);
        button9 = false;
        checkWinner();
        mrObamaDisplay();
    }

    public boolean checkWinner() {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if ((result[0][0] == result[0][1] && result[0][1] == result[0][2]) ||
                        (result[1][0] == result[1][1] && result[1][1] == result[1][2]) ||
                        (result[2][0] == result[2][1] && result[2][1] == result[2][2]) ||
                        (result[0][0] == result[1][0] && result[1][0] == result[2][0]) ||
                        (result[0][1] == result[1][1] && result[1][1] == result[2][1]) ||
                        (result[0][2] == result[1][2] && result[1][2] == result[2][2]) ||
                        (result[0][0] == result[1][1] && result[1][1] == result[2][2]) ||
                        (result[2][0] == result[1][1] && result[1][1] == result[0][2])){
                    startGame = false;
                    mrObamaDisplay = true;
                }
            }
        }
        return startGame;
    }

    public void mrObamaDisplay() {
        if (mrObamaDisplay == true) {
            mImageViewNotBad.setImageResource(R.drawable.notbad);
        }
    }
}

