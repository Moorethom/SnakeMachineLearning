
public class NeuralNetwork {

	
		public NeuralNetwork(){
		
		}
		
		public void networking(int[] data){				
	        
	        System.out.println("true");
	        
	        Neuron xor = new Neuron(0.5f);
	        Neuron left = new Neuron(1.5f);
	        Neuron right = new Neuron(0.5f);
	        
	        left.setWeight(-1.0f);
	        right.setWeight(1.0f);
	        xor.connect(left, right);

	        for (int val : data) {
	            Neuron op = new Neuron(0.0f);
	            
	            op.setWeight(val);
	            
	            left.connect(op);
	            right.connect(op);
	        }

	        xor.fire();

	        System.out.println("Result: " + xor.isFired());

	  }
}
			