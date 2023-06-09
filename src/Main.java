public class Main {
    public static void main(String[] args) {
       int [] list = sayilar();
       int [] list2=tersSayilar(sayilar());
       System.out.println(list2);





    }
    static int [] sayilar(){
        int[] liste= new int[10];
        for(int i=1;i<liste.length;i++){
            liste[i]=i*5;


        }
        return liste;
    }
    static int [] tersSayilar(int []sayilar){
        int [] tersSayilar= new int[sayilar.length];
        for(int i=0,j=sayilar.length-1;i<sayilar.length;i++,j--){
            sayilar[i]=tersSayilar[j];

        }

        return sayilar;
    }
    static void ekranaYazdir(){
        for(int i=0;i<sayilar().length;i++){
            System.out.println(sayilar());
        }

    }
}
