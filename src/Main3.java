import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int [] list= {1,2,3,3,4,5,5,6};
        int [] newList=new int [list.length];
        int sayi=0;
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list.length;j++){
                if(j!=i && list[i]==list[j]){
                    if(!isHas(newList,list[i])){
                        newList[sayi++]=list[i];


                    }
                }

                }


            }
        for(int i:newList){
            if(i!=0){
                System.out.print(" "+i);
            }
        }

        }




    static boolean isHas(int [] arr,int value){
        for(int i:arr){
            if(i==value){
                return true;
            }
        }
        return false;


    }



    }

