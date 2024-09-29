import java.util.*;
class CurrentBill{
    String consumer_num,  consumer_name, type_EB ; double previous_month_reading, current_month_reading;
    CurrentBill(String consumer_num,  String consumer_name, String type_EB , double previous_month_reading, double current_month_reading){
        this.consumer_num=consumer_num;
        this.consumer_name=consumer_name;
        this.type_EB = type_EB;
        this.previous_month_reading=previous_month_reading;
        this.current_month_reading=current_month_reading;
    }
    double computeBillAmt(){
        double units = current_month_reading - previous_month_reading;double total=0;
        if(units>=150){
            total=total+(50*1.25);
            total = total+((units-50)*3);
        }
        else{
            total=total+(100*2.50);
            total = total+((units-100)*3.5);
        }
        return total;
    }
}
class CurrentBillEx{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String consumer_num,  consumer_name, type_EB ; double previous_month_reading, current_month_reading;
        System.out.println("Enter the Consumer  no.,  consumer  name,type of EB connection,  previous  month  reading, current month reading ");
        consumer_num = sc.next();consumer_name=sc.next();type_EB=sc.next();previous_month_reading=sc.nextDouble();current_month_reading=sc.nextDouble();
        CurrentBill c = new CurrentBill(consumer_num,  consumer_name, type_EB, previous_month_reading, current_month_reading);
        System.out.println("\nTotal invoice: "+c.computeBillAmt());
        
    }
}