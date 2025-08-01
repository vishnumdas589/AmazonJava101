package circuitBreakerPattern;

public class TestCircuitBeaker {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CircuitBreaker circuitBreaker = new CircuitBreaker(3, 5000);
		for ( int i = 0 ; i < 20 ;i++) {
			Thread.sleep(1000);
			if(!circuitBreaker.allowRequest()) {
				System.out.println("request blocked (circuit open)");
				continue;
			}
			try {
				boolean success = externalServiceCall();
				if(success) {
					circuitBreaker.recordSuccess();
					System.out.println("request succeeded");
				}else {
					circuitBreaker.recordFailure();
					System.out.println("requst failed ");
				}
				
			}catch(Exception e) {
				circuitBreaker.recordFailure();
				System.out.println("requst failed with exception");
				
			}
			
		}

	}
	public static boolean externalServiceCall() {
		return Math.random() > 0.6;
	}

}
