public class Main {
    public static void main(String[] args) {
//       tạo 2 danh mục như sau
        Category dm1 = new Category(1, "quần");
        Category dm2 = new Category(2, "áo");
//        tạo các sản phẩm thuộc danh mục 1
        Product product1 = new Product(1, "quần âu", 150000, dm1);
        Product product2 = new Product(2, "quần jean", 250000, dm1);
//tạo các sản phẩm thuộc danh mục 2
        Product product3 = new Product(3, "áo sơ mi", 1250000, dm2);
        Product product4 = new Product(4, "áo phông", 1750000, dm2);
//        hiển thị
        System.out.println("tất cả các sản phẩm");

        product1.display();
        product2.display();
        product3.display();
        product4.display();
    }
}