package Diziler;

public class HarmonikOrtalama {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double harmonik = 0;

        for(int i = 0; i<list.length; i++){
            harmonik = harmonik +(1.0/list[i]);
        }
        System.out.println(harmonik);

    }
}
