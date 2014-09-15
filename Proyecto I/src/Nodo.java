
public class Nodo<Ele> {
	
	Ele data;
	Nodo<Ele> next;
	
	
	public Nodo(Ele x){
		data=x;
		next=null;
	}
	
	public Nodo(Ele x, Nodo<Ele> n){
		data=x;
		next= n;
	}
	
	public Ele getData() {
		return data;
	}
	
	public Nodo<Ele> getNext(){
		return next;
	}
	
	public void	 setNext (Nodo<Ele> next){
		this.next=next;
	}

}
