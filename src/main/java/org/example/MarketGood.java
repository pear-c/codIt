package org.example;

public class MarketGood {
    private String name;        // 상품의 이름
    private int retailPrice;    // 상품의 출시 가격
    private int discountRate;   // 상품 할인율

    // 생성자 1
    public MarketGood(String name, int retailPrice, int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;
        if(discountRate < 0 || discountRate > 100) {
            this.discountRate = 0;
        } else {
            this.discountRate = discountRate;
        }
    }
    // 생성자 2
    public MarketGood(String name, int retailPrice) {
        this(name, retailPrice, 0);
    }

    // Getter, Setter
    public String getName() {
        return name;
    }
    public int getRetailPrice() {
        return retailPrice;
    }
    public int getDiscountRate() {
        return discountRate;
    }
    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    // 할인가격 리턴 메소드
    public int getDiscountedPrice() {
        return retailPrice - (retailPrice * discountRate / 100);
    }
}
