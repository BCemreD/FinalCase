package patikaStore.entity.concretes;

public class PhoneQuality {

	//they'll be shown on screen if it is wanted in future
	final int memoP64 =64;
	final int memoP128 = 128;
	final static double screenP =6.1;
	final int batery = 4000;
	final int ramP = 6;
	final String colurB = "Black", colourR = "Red", colourBl = "Blue";

	public int getMemoP64() {
		return memoP64;
	}

	public int getMemoP128() {
		return memoP128;
	}

	public static double getScreenP() {
		return screenP;
	}

	public int getBatery() {
		return batery;
	}

	public int getRamP() {
		return ramP;
	}

	public String getColurB() {
		return colurB;
	}

	public String getColourR() {
		return colourR;
	}

	public String getColourBl() {
		return colourBl;
	}


}
