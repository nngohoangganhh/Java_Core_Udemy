package chapter9.lap7;

import chapter9.video90.OrderStatus;

public class Order {
    private String id;
    private OrderStatus status;

    public Order(String id,OrderStatus status) {
        this.id = id;
        this.status =status;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
         //Inner class //////////////////////////////////
     class CustomerInfo {
             private String name;
             private String sdt;

             public CustomerInfo(String name, String sdt) {
                 this.name = name;
                 this.sdt = sdt;
             }

             public void printInfo() {
                 System.out.println("Name: " + name + "Tuổi" + sdt + "Trạng Thái: " + status.getDescription());
             }
         }
         ///////////////////////////////////////////
         public void processOrder() {
          class Logger {
              void log (){
                  System.out.println("đang xử lý " +id);
                  System.out.println("Trạng Thái " +status.getDescription());
              }
          }
          Logger hihi = new Logger();
          hihi.log();

         }

        static class DiscountHelper {
                String calculateDiscount(OrderStatus status){
                    if(status.name().equals("SHIPPED") ) return "10%";
                    if(status.name().equals("DELIVERED") || status.name().equals("CANCLLED") ) return "0%";
                    return "5%";
                }
            }
    }

