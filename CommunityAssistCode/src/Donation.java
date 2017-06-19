import java.util.Date;

public class Donation {
	private int donationKey;
	private Person donor;
	private Date donationDate;
	private float donationAmount;

	public Donation() {
		
	}
	
	public Donation(int donationKey, Person donor, Date donationDate, float donationAmount){
	
		this.donationKey = donationKey;
		this.donor = donor;
		this.donationDate = donationDate;
		this.donationAmount = donationAmount;
	}

	/**
	 * @return the donationKey
	 */
	public int getDonationKey() {
		return donationKey;
	}

	/**
	 * @param donationKey the donationKey to set
	 */
	public void setDonationKey(int donationKey) {
		this.donationKey = donationKey;
	}

	/**
	 * @return the donor
	 */
	public Person getDonor() {
		return donor;
	}

	/**
	 * @param donor the donor to set
	 */
	public void setDonor(Person donor) {
		this.donor = donor;
	}

	/**
	 * @return the donationDate
	 */
	public Date getDonationDate() {
		return donationDate;
	}

	/**
	 * @param donationDate the donationDate to set
	 */
	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
	}

	/**
	 * @return the donationAmount
	 */
	public float getDonationAmount() {
		return donationAmount;
	}

	/**
	 * @param donationAmount the donationAmount to set
	 */
	public void setDonationAmount(float donationAmount) {
		this.donationAmount = donationAmount;
	}

}
