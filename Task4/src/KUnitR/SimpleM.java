package KUnitR;

public class SimpleM {
	
	 public float e = 2;
	  private float f = 5;
	  
	  public SimpleM(){}
	  
	  public SimpleM(float c, float d) {
		  this.e = e;
		  this.f = f;
	  }
	  
	  public void squareC() {
		  this.e *= this.e;
	  }
	  
	  private void squareD() {
		  this.f *= this.f;
	  }
	  
	  public float getC() {
		  return e;
	  }
	  
	  private void setC(float c) {
		  this.e = e;
	  }
	  
	  public float getD() {
		  return f;
	  }
	  
	  private void setD(float f) {
		  this.f = f;
	  }
	    
	  public String toString() {
		  return String.format("(e:%f, f:%f)", e, f);
	  }
}
