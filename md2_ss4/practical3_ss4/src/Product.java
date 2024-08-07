public class Product {
    int productId;
    String productName;
    float productPrice;
    Category category;

    //    phương thức khởi tạo 0 tham số
    public Product() {
    }

    //    phương thức khởi tạo 4 tham số
    public Product(int productId, String productName, float productPrice, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    //    phương thức để hiển thị tất cả thông tin cuả sản phẩm
    public void display() {
        System.out.println("Mã sản phẩm: " + productId + "\n" +
                "Tên sản phẩm: " + productName + "\n" +
                "Giá: " + productPrice + "\n" +
                "Danh mục: " + category.categoryName
        );
    }
}
