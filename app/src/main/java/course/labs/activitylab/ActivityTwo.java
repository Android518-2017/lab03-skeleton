package course.labs.activitylab;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ActivityTwo extends Activity {

	// string for logcat documentation
	private final static String TAG = "Lab-ActivityTwo";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
		
		//Log cat print out
		Log.i(TAG, "onCreate called");
		
	}

	@Override
	public void onStart(){
		super.onStart();
		//Log cat print out
		Log.i(TAG, "onStart called");
	}

	// lifecycle callback overrides

	@Override
	public void onDestroy(){
		super.onDestroy();
		destroy = (TextView) findViewById(R.id.destroy);
		//Log cat print out
		Log.i(TAG, "onDestroy called");
		//TODO:  update the appropriate count variable & update the view
		ActivityOne.onDestroyCount++;
		String counter = String.valueOf(ActivityOne.onDestroyCount);
		destroy.setText(getString(R.string.onDestroy) + " " + counter);
	}

	// TODO: implement 5 missing lifecycle callback methods

	@Override
	public void onPause(){
		super.onPause();

		//Log cat print out
		Log.i(TAG, "onPause called");
	}

	@Override
	public void onResume(){
		super.onResume();

		//Log cat print out
		Log.i(TAG, "onResume called");
	}
	@Override
	public void onStop(){
		super.onStop();

		//Log cat print out
		Log.i(TAG, "onStop called");

	}
	@Override
	public void onRestart(){
		super.onRestart();

		//Log cat print out
		Log.i(TAG, "onRestart called");

	}
}
