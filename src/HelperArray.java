public class HelperArray {
    static void helperArray(int[]dizi){
        for(int i=0;i<dizi.length;i++){
            System.out.println(dizi[i]);
        }
        System.out.println("------------");
    }
    static void fill(int[]array,int value){
        for(int i=0;i<array.length;i++){
            array[i]=value;
        }
    }
    static void search(int[]ab,int deger){
        for(int i=0;i<ab.length;i++){
            if(ab[i]==deger){
                System.out.println(i+".Indistir");

            }



        }



    }
    static void avarage(int[] abc){
        double sum=0;

        for(int i=0;i<abc.length;i++){
            sum+=abc[i];

        }

        System.out.println(sum/abc.length);
    }

}
