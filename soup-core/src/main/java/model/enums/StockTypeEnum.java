package model.enums;

public enum StockTypeEnum {

	SH("上海"), SZ("深圳");

	private String market;

	public String getMarket() {
		return this.market;
	}

	private StockTypeEnum(String market) {
		this.market = market;
	}

}
