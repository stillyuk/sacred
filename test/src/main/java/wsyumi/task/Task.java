package  wsyumi.task;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.stereotype.Component;

@Component
public class Task {
	public void task() {
		Timer timer = new Timer();
		timer.schedule(new MyTask(), 5000, 1000);
		while (true) {
			
		}
	}
	
	private final class MyTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("test");
		}
		
	}
}
