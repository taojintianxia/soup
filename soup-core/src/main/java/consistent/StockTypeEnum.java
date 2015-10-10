package consistent;

public enum StockTypeEnum {

	SZ("深圳"), SH("上海");

	private String market;

	public String getMarket() {
		return this.market;
	}

	private StockTypeEnum(String market) {
		this.market = market;
	}

}
