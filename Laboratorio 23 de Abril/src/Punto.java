




public class Punto {

	
	private double x;
	private double y;
	private int theta;
	private int rho;
	
	
	/*public void setValores(double x,double y){
		
		this.x=x;
		this.y=y;
		
	}*/
	
     /*public void setValores(int theta,int rho){
		
		this.theta=theta;
		this.rho=rho;
		
	}*/
	
	
	
	public Punto(short x, short y){
		this.x=1;
		this.y=1;	
		this.theta=1;
		this.rho=1;
	}
	
	public Punto(short x, short y){
		this.x=x;
		this.y=y;		
	}
	
	
	public Punto(int theta,int rho){
		this.theta=theta;
		this.rho=rho;		
	}
	
	
	public Punto(int theta,int rho,short x, short y){
		
		this(theta, rho);
		this.x=x;
		this.y=y;
		
	}
	
     public void setValores(double x,double y){
	
	 System.out.println("X,Y:"+this.x,+this.y+");
	 System.out.println("THETA,RHO:"+this.theta,this.rho+");
	
}
	
	
	
	
	
	
	
	
	
}
