public class Category {

    int categoryId;
    String categoryName;

    //    phương thức khởi tạo không tham số
    public Category() {
    }

    //    phương thức khởi tạo 2 tham số
    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public void display() {
        System.out.println("Mã danh mục: " + categoryId + "\n" +
                "Tên danh mục: " + categoryName);
    }
}
