package pl.narodzinyprograsmity.eunisiowe;

public class EuniaKod {

    public static void main(String[] args) {

        int[] tab = {1, 5, 6, 2, 7, 1, 3, 5, 7, 9, 14};

        System.out.println(tab);

        boolean isSmmaler ;

        for (int i = 0; i <= tab.length; i++) {
            isSmmaler = true;

            for (int digit : tab) {
            if (tab[i] > digit){
                isSmmaler = false;
                break;
            }



            }





        }







        System.out.println("posortowana : " + tab);
    }

}
