
public class MarketPeople {

	
	public static void main(String[] args) {
		Marketeers b = new Builder();
		Marketeers v = new Vender();
		
		boolean b_atMarket = b.market();
		boolean v_atMarket = v.market();
		
		b.workTransportation();
		v.workTransportation();
		
		b.beginWork(b_atMarket);
		v.beginWork(v_atMarket);
	}

}
