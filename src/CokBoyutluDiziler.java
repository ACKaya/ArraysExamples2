public class CokBoyutluDiziler {
    public static void main(String[] args) {
        int [][] sayilar= new int [3][4];
        int x=1;
        for(int i=0;i< sayilar.length;i++){
            for(int j=0;j<sayilar[0].length;j++){
                sayilar[i][j]=x++;
            }

        }
        System.out.println(sayilar[1][2]);
    }
}
