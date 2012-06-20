package com.jiangli;
import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.widget.ViewFlipper;
public class SwitchActivity extends Activity implements OnGestureListener{
    /** Called when the activity is first created. */
	 private ViewFlipper flipper;
	 private GestureDetector detector;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        flipper = (ViewFlipper)findViewById(R.id.viewFlipper1);
        detector = new GestureDetector(this);
    }

    @Override 
    public boolean onTouchEvent(MotionEvent event) { 
        return this.detector.onTouchEvent(event); 
    }
    
	@Override
	public boolean onDown(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
	        if (e1.getX() > e2.getX()) { 
	            this.flipper.showNext(); 
	        } else if (e1.getX() < e2.getX()) { 
	            this.flipper.showPrevious(); 
	        } else { 
	            return false; 
	        } 
	        return true; 
	}

	@Override
	public void onLongPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onShowPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}

}