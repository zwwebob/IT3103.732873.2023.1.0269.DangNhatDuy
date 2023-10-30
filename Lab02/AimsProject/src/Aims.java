public class Aims {
    public static void main(String[] args) {
        // Tạo một đối tượng Cart mới có tên là anOrder
        Cart anOrder = new Cart();
        
        // Tạo các đối tượng DVD  với các thông tin cụ thể và thêm vào anOrder
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDVD(dvd1);

        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Sci-fi", "George Lucas", 87, 24.95f);
        anOrder.addDVD(dvd2);

 
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDVD(dvd3);

        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Spiderman: No way home", "Action", 16.95f);
        anOrder.addDVD(dvd4);
        
        
        anOrder.removeDVD(dvd4);
        
        // In ra tổng giá trị của các đĩa DVD trong anOrder
        System.out.println("The total cost is: ");
        System.out.println(anOrder.calculateTotalCost());
    }
}
