public class DigitalVideoDisc {
    // Tạo thuộc tính của đĩa DVD
    private String title;       
    private String category;    
    private String director;    
    private int length;         
    private float cost;         

    // Thiết lập Id cho đĩa DVD
    private static int totalDigitalVideoDiscsCreated  = 0;
    private int id;

    // Constructor - Các hàm khởi tạo
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        totalDigitalVideoDiscsCreated ++;
        this.id = totalDigitalVideoDiscsCreated ;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        totalDigitalVideoDiscsCreated ++;
        this.id = totalDigitalVideoDiscsCreated ;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        totalDigitalVideoDiscsCreated ++;
        this.id = totalDigitalVideoDiscsCreated ;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        totalDigitalVideoDiscsCreated ++;
        this.id = totalDigitalVideoDiscsCreated ;
    }

    // Getters và Setters để truy xuất và cập nhật thuộc tính
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
