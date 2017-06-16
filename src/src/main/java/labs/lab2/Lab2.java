package src.main.java.labs.lab2;




public class Lab2 {
    public static void main(String[] args) {
        PostStamp postStamp1 =new PostStamp("ukr",10,false, 1952,true);

        PostStamp postStamp2 =new PostStamp("usa",50,true, 1931,true);

        PostStamp postStamp3 =new PostStamp("arg",10,true, 1980, true);



        System.out.println(postStamp1.toString());
        System.out.println(postStamp2.toString());
        System.out.println(postStamp3.toString());

        postStamp1.countPrice();
        postStamp2.countPrice();
        postStamp3.countPrice();

    }
}
