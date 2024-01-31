package Pegas.builder2;

public class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        this.order = new Order();
    }
    public OrderBuilder setClientName(String clientName) {
        order.setClientName(clientName);
        return this;
    }
    public OrderBuilder setCompanyName(String companyName) {
        order.setCompanyName(companyName);
        return this;
    }
    public OrderBuilder setProductId(int productId) {
        order.setProductId(productId);
        return this;
    }
    public OrderBuilder setProductName(String productName) {
        order.setProductName(productName);
        return this;
    }
    public OrderBuilder setQnt(int qnt) {
        order.setQnt(qnt);
        return this;
    }
    public OrderBuilder setPrice(double price) {
        order.setPrice(price);
        return this;
    }
    public OrderBuilder setSign(boolean sign) {
        order.setSign(sign);
        return this;
    }
    public Order build() {
        return order;
    }
}
