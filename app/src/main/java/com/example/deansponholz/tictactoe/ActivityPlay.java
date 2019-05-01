package com.example.deansponholz.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ActivityPlay extends AppCompatActivity {

    private Button m_newGameButton;
    private TableLayout m_tableLayout;
    private TextView m_currentPlayerTextView;
    private GameState m_gameState;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        m_currentPlayerTextView = (TextView) findViewById(R.id.activity_play_currentPlayerIndicator);
        m_tableLayout = (TableLayout) findViewById(R.id.activity_play_tableLayout);


        m_newGameButton = (Button) findViewById(R.id.activity_play_newGameButton);
        m_newGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_tableLayout.removeAllViews();
                for (int i = 0; i < 4; i++){
                    TableRow m_tableRow = (TableRow) getLayoutInflater().inflate(R.layout.tictactoe_row, null);
                    m_tableLayout.addView(m_tableRow, i);

                    for (int j = 0; j < m_tableRow.getChildCount(); j++){
                        final Button boardButton = (Button) m_tableRow.getChildAt(j);
                        boardButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                boardButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        });
                    }

                }

            }
        });



        //m_gameState = new GameState(4);
        //m_gameState.getM_gameBoard();

    }


}
