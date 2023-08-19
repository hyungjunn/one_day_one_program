package DAY_015.PolyArgumentTest;


import java.util.Vector;

class Buyer {

    int money = 1000;

    int bonusPoint = 0;

    // int i = 0;

    // Product[] item = new Product[10]; // 구입한 제품을 저장하기 위한 배열

    Vector item = new Vector(); // 구입한 제품을 저장하는데 사용될 Vector객체

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        // item[i++] = p;
        item.add(p);
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void refund(Product p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        if (item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        for (int i = 0; i < item.size(); i++) {
            Product p = (Product) item.get(i);
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }
//        for (int i = 0; i < item.length; i++) {
//            if (item[i] == null) {
//                break;
//            }
//            sum += item[i].price;
//            itemList += item[i] + ", ";
//        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
