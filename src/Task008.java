public class Task008 {

    public static class Customer{
        public void accept(){
            System.out.println("accept customer called");
        }
        public void display(){
            System.out.println("display customer called");
        }
    }

    public static void main(String[] args){
        Customer cobj = new Customer();
        cobj.accept();
        cobj.display();
    }
}
