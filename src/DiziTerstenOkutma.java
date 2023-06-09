public class DiziTerstenOkutma {
    int [] sayilar(){
        int[] list= new int[10];
        for(int i=1;i<list.length;i++){
            list[i]=i*5;

        }
        return list;
    }
     int[] tersi(int [] list){
        int [] tersList= new int[10];
        for(int i=0, j=tersList.length-1; i<list.length;i++,j--){
            list[i]=tersList[j];

        }

        return tersList;

    }
     void printDizi(int [] list){
        for(int i=0;i< list.length;i++){
            System.out.println(tersi(list));
        }

    }

}
