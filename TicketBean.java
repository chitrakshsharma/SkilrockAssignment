public class TicketBean{
	
	private int merchantId;
	private int partyId;
	
	public TicketBean(int merchantId, int partyId) {
		super();
		this.merchantId = merchantId;
		this.partyId = partyId;
	}
	
	public int getMerchantId() {
		return merchantId;
	}
	
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	
	public int getPartyId() {
		return partyId;
	}
	
	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}
}