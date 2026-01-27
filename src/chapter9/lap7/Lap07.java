package chapter9.lap7;

import chapter9.video90.OrderStatus;

public class Lap07 {
    public static void main(String[] args) {
            Runnable task  = new Runnable() {
                @Override
                public void run() {
                    OrderStatus myStatus = OrderStatus.CANCELLED;
                    Order haha = new Order("A101" ,myStatus);
                    haha.processOrder();
                    Order.CustomerInfo hahi = haha.new CustomerInfo(" Hoàng Anh " , " 01922222222 ");
                    hahi.printInfo();
                    Order.DiscountHelper huhi = new Order.DiscountHelper();
                    System.out.println(" chiết khấu : "+ huhi.calculateDiscount(myStatus));
                    System.out.println("đơn đang xử lý :" + haha.getId() + " được xử lý trạng thái :"+ myStatus.getDescription());
                }
            };
            task.run();

    }
    }

