package course.labs.activitylab;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ActivityOne extends Activity {

		// string for logcat documentation
		private final static String TAG = "Lab-ActivityOne";

		// lifecycle counts
		public static int onCreateCount, onStartCount, onDestroyCount, onPauseCount, onResumeCount, onStopCount, onRestartCount;
		TextView create ,start, pause, resume, stop, restart, destroy;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_one);
			
			//Log cat print out
			Log.i(TAG, "onCreate called");
			create = (TextView) findViewById(R.id.create);
			//TODO: update the appropriate count variable & update the view
			onCreateCount++;
			String counter = String.valueOf(onCreateCount);
			create.setText(getString(R.string.onCreate) + " " + counter);
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.activity_one, menu);
			return true;
		}

		@Override
		public void onStart(){
			super.onStart();
			//Log cat print out
			Log.i(TAG, "onStart called");
			start = (TextView) findViewById(R.id.start);
			//TODO:  update the appropriate count variable & update the view
			onStartCount++;
			String counter = String.valueOf(onStartCount);
			start.setText(getString(R.string.onStart) + " " + counter);

		}

		// lifecycle callback overrides

		@Override
		public void onDestroy(){
			super.onDestroy();

			//Log cat print out
			Log.i(TAG, "onDestroy called");
			destroy = (TextView) findViewById(R.id.destroy);
			//TODO:  update the appropriate count variable & update the view
			onDestroyCount++;
			String counter = String.valueOf(onDestroyCount);
			destroy.setText(getString(R.string.onDestroy) + " " + counter);

		}

	    // TODO: implement 5 missing lifecycle callback methods

		@Override
		public void onPause(){
			super.onPause();

			//Log cat print out
			Log.i(TAG, "onPause called");
			pause = (TextView) findViewById(R.id.pause);
			//TODO:  update the appropriate count variable & update the view
			onPauseCount++;
			String counter = String.valueOf(onPauseCount);
			pause.setText(getString(R.string.onPause) + " " + counter);

		}

		@Override
		public void onResume(){
			super.onResume();

			//Log cat print out
			Log.i(TAG, "onResume called");
			resume = (TextView) findViewById(R.id.resume);
			//TODO:  update the appropriate count variable & update the view
			onResumeCount++;
			String counter = String.valueOf(onResumeCount);
			resume.setText(getString(R.string.onResume) + " " + counter);

		}
		@Override
		public void onStop(){
			super.onStop();

			//Log cat print out
			Log.i(TAG, "onStop called");
			stop = (TextView) findViewById(R.id.stop);
			//TODO:  update the appropriate count variable & update the view
			onStopCount++;
			String counter = String.valueOf(onStopCount);
			stop.setText(getString(R.string.onStop) + " " + counter);

		}
		@Override
		public void onRestart(){
		super.onRestart();

			//Log cat print out
			Log.i(TAG, "onRestart called");
			restart = (TextView) findViewById(R.id.restart);
			//TODO:  update the appropriate count variable & update the view
			onRestartCount++;
			String counter = String.valueOf(onRestartCount);
			restart.setText(getString(R.string.onRestart) + " " + counter);

		}

		@Override
		public void onSaveInstanceState(Bundle savedInstanceState){
			//TODO:  save state information with a collection of key-value pairs & save all  count variables
		}


		public void launchActivityTwo(View view) {
			startActivity(new Intent(this, ActivityTwo.class));
		}
		

}
