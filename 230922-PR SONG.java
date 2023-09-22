import java.util.Random;
public class Main{
  public static void main(String[]args){
    Random rnd=new Random();
    int[]lottoNumbers=new int[6];
    for(int i=0;i<6;i++){
        int randomNumber=rnd.nextInt(43)+1;
        for(int j=0;j<i;j++){
            if(lottoNumbers[j]==randomNumber){
                randomNumber=rnd.nextInt(43)+1;
                j=-1;
            }
        }
        lottoNumbers[i]=randomNumber;
    }
    java.util.Arrays.sort(lottoNumbers);
    System.out.println("今回のロト6予測番号はこちらです。");
    String word="";
        for(int number:lottoNumbers){
        word=word+"["+(number+"")+"]";
        }
    System.out.println(word);
    }
}
//20230922 ロト6番号自動発行　プログラム