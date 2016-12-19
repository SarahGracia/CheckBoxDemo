package com.example.sarah.checkboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> selection = new ArrayList<String>();
        TextView final_text;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            final_text = (TextView) findViewById(R.id.final_result);
            final_text.setEnabled(false);
        }

        public void selectItem(View view)

        {
            boolean checked = ((CheckBox) view).isChecked();
            switch (view.getId())
            {
                case R.id.Breakfast_Toast:

                    if(checked)
                    {
                        selection.add("Toast");
                    }

                    else
                    {
                        selection.remove("Toast");
                    }
                    break;

                case R.id.Breakfast_Egg:

                    if(checked)
                    {
                        selection.add("Egg");
                    }

                    else
                    {
                        selection.remove("Egg");
                    }
                    break;
                case R.id.Breakfast_Fruits:

                    if(checked)
                    {
                        selection.add("Fruits");
                    }

                    else
                    {
                        selection.remove("Fruits");
                    }
                    break;
            }

        }
        public void finalSelection(View view)
        {
            String final_fruit_selection="";

            for (String Selections : selection)
            {
                final_fruit_selection=final_fruit_selection+ Selections + "\n";
            }

            final_text.setText(final_fruit_selection);
            final_text.setEnabled(true);
        }

    }







