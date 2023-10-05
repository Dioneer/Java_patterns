package main.builder;

public class Program {
    public static void main(String[] args) {
      Order order = new OrderBuilder()
                .setProductId(123)
                .setPrice(123)
                .setQnt(456)
                .setCompanyName("qwe")
                .setSign(true)
                .setProductName("asd")
                .build();
    }
}
