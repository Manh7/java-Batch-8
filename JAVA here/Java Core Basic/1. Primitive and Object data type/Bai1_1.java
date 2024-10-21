public class Bai1_1 {
    int c1;
    float c2;
    char c3;
    Integer d1;
    Float d2;
    Character d3;
    public static void main(String[] args) {
        // Kiểu dữ liệu nguyên thủy
        int numPrimitive = 5;
        System.out.println("Primitive: " + numPrimitive);

        // Kiểu đối tượng
        Integer numObject = new Integer(10);
        System.out.println("Object: " + numObject);

        // Autoboxing (chuyển từ kiểu nguyên thủy sang đối tượng)
        Integer autoBoxed = numPrimitive;
        System.out.println("Autoboxing: " + autoBoxed);

        // Unboxing (chuyển từ đối tượng sang kiểu nguyên thủy)
        int unboxed = numObject;
        System.out.println("Unboxing: " + unboxed);

        // So sánh hai kiểu
        System.out.println("So sánh nguyên thủy: " + (numPrimitive == unboxed)); // true
        System.out.println("So sánh đối tượng: " + numObject.equals(autoBoxed)); // true

        // Giá trị khơi tạo của các kiểu dữ liệu
        Bai1_1 obj=new Bai1_1();
        System.out.println("khởi tạo biến nguyên thủy :" +obj.c1+" "+obj.c2+" "+obj.c3);
        System.out.println("khởi tạo biến object :" +obj.d1+" "+obj.d2+" "+obj.d3);
    }
}
