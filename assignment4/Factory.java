package assignment4;



public class Factory {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MobileShop ms=Factory1.getShop();
		System.out.println(ms.sellMobile());
	}
}



class Factory1{
	public static MobileShop getShop() throws Exception{
		String Mobileshopclass="asssignment4.Poorvika";
		String Mobilefactoryclass="asssignment4.Nokia";


		
		MobileManufacturer m1=(MobileManufacturer)Class.forName(Mobilefactoryclass).getConstructor().newInstance();
		
		MobileShop m2=(MobileShop)Class.forName(Mobileshopclass).getConstructor().newInstance();
		
		//dependency injection
		m2.setmm(m1);
		
		return m2;
	}
}




abstract class Mobile{
	
}
class Keypad extends Mobile{
	
}
class Touch extends Mobile{
	
}
class Tablet extends Mobile{
	
}





interface Manufacturer{
	
}

interface MobileManufacturer extends Manufacturer{
	public Mobile makeMobile();
	
}
abstract class MobileFactory implements MobileManufacturer{		
}



interface Seller{
	
}

interface MobileSeller extends Seller{
	public Mobile sellMobile();
}


class Nokia extends MobileFactory{
    public Nokia(){
        
    }
	@Override
	public Mobile makeMobile() {
		// TODO Auto-generated method stub
		return new Keypad();
	}
}

class Samsung extends MobileFactory{
    public Samsung(){
        
    }
	@Override
	public Mobile makeMobile() {
		// TODO Auto-generated method stub
		return new Touch();
	}
}

class Ipad extends MobileFactory{
    public Ipad(){
        
    }
	@Override
	public Mobile makeMobile() {
		// TODO Auto-generated method stub
		return new Tablet();
	}
}


abstract class MobileShop implements MobileSeller{
	private MobileManufacturer mobmani;
	public MobileManufacturer getmm() {
		return mobmani;
	}
	public void setmm(MobileManufacturer mobmani) {
		this.mobmani=mobmani;
	}
	
}

class Poorvika extends MobileShop{
    public Poorvika(){
        
    }
	@Override
	public Mobile sellMobile() {
		// TODO Auto-generated method stub
		return getmm().makeMobile();
	}
}



