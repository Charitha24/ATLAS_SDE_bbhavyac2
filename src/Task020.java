public class Task020 {
    public static void main(String[] args){
        char[] Name = {'B', 'h', 'a', 'v', 'y', 'a'};
        System.out.println(Name);
        int n = Name.length;
        System.out.println("There are"+ n +"letters in my name.");
        for(int i = 0; i < n; i++){
            System.out.println(Name[i] + "");
        }
    }
}
