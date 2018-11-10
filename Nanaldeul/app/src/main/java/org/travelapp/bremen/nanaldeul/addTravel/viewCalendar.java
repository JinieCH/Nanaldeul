package org.travelapp.bremen.nanaldeul.addTravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import calendarLibrary.DayPickerView;
import calendarLibrary.SimpleMonthAdapter;

import org.travelapp.bremen.nanaldeul.R;

public class viewCalendar extends AppCompatActivity implements calendarLibrary.DatePickerController {
    private DayPickerView dayPickerView;
    Button titleInputBnt, select_date_btn;
    InputMethodManager inputMM;
    EditText travleTitleEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_calendar);

        dayPickerView = (DayPickerView) findViewById(R.id.pickerView);
        dayPickerView.setController(this);

        titleInputBnt = (Button) findViewById(R.id.titleInputBnt);
        travleTitleEdit = findViewById(R.id.travleTitleEdit);
        inputMM = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);

        // 키보드를 숨기게 할 버튼 클릭 이벤트 정의
        titleInputBnt.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        inputMM.hideSoftInputFromWindow(travleTitleEdit.getWindowToken(), 0);
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public int getMaxYear()
    {
        return 3000;
    }

    @Override
    public void onDayOfMonthSelected(int year, int month, int day)
    {
        Log.d("Day Selected", day + " / " + month + " / " + year);
    }

    @Override
    public void onDateRangeSelected(SimpleMonthAdapter.SelectedDays<SimpleMonthAdapter.CalendarDay> selectedDays)
    {
        Log.d("Date range selected", selectedDays.getFirst().toString() + " --> " + selectedDays.getLast().toString());//year, mont, day 순서

        select_date_btn = (Button) findViewById(R.id.select_date_btn);
        if(selectedDays.getFirst().toString() == "0 0 0" || selectedDays.getLast().toString() == "0 0 0"){
            Log.d("TTT", "TES");
            select_date_btn.setVisibility(View.INVISIBLE);
        }
        else {
            String[] firstDate = selectedDays.getFirst().toString().split(" ");
            String[] lastDate = selectedDays.getLast().toString().split(" ");

            String dateRangeSelected = firstDate[0] + "." + firstDate[1] + "." + firstDate[2] + " ~ " + lastDate[0] + "." + lastDate[1] + "." + lastDate[2] + "  등록";

            select_date_btn.setText(dateRangeSelected);
            select_date_btn.setVisibility(View.VISIBLE);
        }
    }
}
