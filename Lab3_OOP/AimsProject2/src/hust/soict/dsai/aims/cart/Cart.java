// Lớp Cart đại diện cho giỏ hàng của người dùng
package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    // Phương thức để thêm một đĩa DVD vào giỏ hàng
    public void addDVD(DigitalVideoDisc disc) {
        DigitalVideoDisc empty = new DigitalVideoDisc("", "", "", 0, 0);
        if (this.qtyOrdered < 20) {
            for (int i = 0; i < 20; i++) {
                if (itemOrdered[i] == null) {
                    itemOrdered[i] = disc;
                    break;
                }
            }
            this.qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    // Phương thức để xóa một đĩa DVD khỏi giỏ hàng
    public void removeDVD(DigitalVideoDisc disc) {
        DigitalVideoDisc empty = new DigitalVideoDisc("", "", "", 0, 0);
        for (int i = 0; i < 20; i++) {
            if (itemOrdered[i].equals(disc)) {
                itemOrdered[i] = empty;
                break;
            }
        }
        this.qtyOrdered--;
        System.out.println("The disc has been removed");
    }

    // Phương thức tính tổng giá trị của các đĩa DVD trong giỏ hàng
    public float calculateTotalCost() {
        float sum = 0.00f;
        for (int i = 0; i < 20; i++) {
            if (itemOrdered[i] != null) {
                sum += itemOrdered[i].getCost();
            }
        }
        return (float) Math.round(sum * 100) / 100;
    }

    // Phương thức để thêm một danh sách các đĩa DVD vào giỏ hàng
    public void addDVD(DigitalVideoDisc[] dvdList) {
        int j = 0;
        for (int i = 0; i < 20; i++) {
            if (this.qtyOrdered < 20) {
                if (itemOrdered[i] == null) {
                    itemOrdered[i] = dvdList[j];
                    j++;
                    this.qtyOrdered++;
                }
            }
        }
        System.out.println("The list of disc has been added");
    }

	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		
		float totalCost = 0.0f;
		
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if (itemOrdered[i] != null) {
				DigitalVideoDisc dvd = itemOrdered[i];
				totalCost += dvd.getCost();
				
				System.out.println((i + 1) + ". DVD - " +
                        "[" + dvd.getTitle() + "] - " +
                        "[" + dvd.getCategory() + "] - " +
                        "[" + dvd.getDirector() + "] - " +
                        "[" + dvd.getLength() + "]: " +
                        "[" + dvd.getCost() + "] $");
			}
			
		}
		System.out.println("Total cost: [" + totalCost + "]");
		System.out.println("***************************************************");
	}

//    public void addDVD(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
//        addDVD(dvd1);
//        addDVD(dvd2);
//    }
}
