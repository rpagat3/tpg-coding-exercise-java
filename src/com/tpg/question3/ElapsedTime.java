package com.tpg.question3;

import java.util.concurrent.TimeUnit;

/**
 * Measures the execution time. Instantiate this class and call start() to start the timer. Call the end() to end the timer.
 * @author Rey Pagataptan
 *
 */
public class ElapsedTime {

	private long startTime;
	private long endTime;
	
	/**
	 * Starts the timer. 
	 */
	public void start() {
		startTime = System.nanoTime();
	}
	
	/**
	 * Ends the timer
	 */
	public void end() {
		endTime = System.nanoTime();
	}
	
	/**
	 * Displays the total execution time in the format <b>minutes seconds milliseconds</b> (e.g. 1min 20sec 100ms). 
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		long duration = endTime - startTime;
		sb.append("Total execution time is ");
		sb.append(TimeUnit.NANOSECONDS.toMinutes(duration)).append("min ");
		sb.append(TimeUnit.NANOSECONDS.toSeconds(duration) - TimeUnit.MINUTES.toSeconds(TimeUnit.NANOSECONDS.toMinutes(duration))).append("sec ");
		sb.append(TimeUnit.NANOSECONDS.toMillis(duration) - TimeUnit.SECONDS.toMillis(TimeUnit.NANOSECONDS.toSeconds(duration))).append("ms ");
		return sb.toString();
	}
	
	public static void main(String[] args) {
		ElapsedTime elapsed  = new ElapsedTime();
		elapsed.start();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elapsed.end();
		System.out.println(elapsed);
	}
}
