package circuitBreakerPattern;

public class CircuitBreaker {
	private enum State {ClOSED ,OPEN, HALF_OPEN}
	
	private State state = State.ClOSED;
	private final int failureThreshold;
	private final long resetTimeout;
	private int failureCount =0;
	private long lastFailureTime;
	
	public CircuitBreaker(int failureThreshold, long resetTimeout) {
		this.failureThreshold = failureThreshold;
		this.resetTimeout = resetTimeout;
		
	}
	public void recordSuccess() {
		state = State.ClOSED;
		failureCount = 0;
		System.out.println("Circuit Breaker : reset to CLOSED ");
		
		
	}
	public void recordFailure() {
		failureCount++;
		if(failureCount > failureThreshold) {
			state = State.OPEN;
			lastFailureTime = System.currentTimeMillis();
			System.out.println("Circuit breaker : tripped to OPEN");
		}
		
	}
	public boolean allowRequest() {
		if(state == State.OPEN) {
			long now  = System.currentTimeMillis();
			if(now - lastFailureTime > resetTimeout) {
				state = State.HALF_OPEN;
				System.out.println("Circuit breaker : trying HALF_OPEN");
				return true;
			}
			return false;
		}
			
		return true;
	}
	public State getState() {
		return state;
	}
	

}
