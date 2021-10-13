package day_07.Phone;

import java.util.ArrayList;
import java.util.Arrays;

public class Objects {

    public static void main(String[] args) {
        IPhone XS = new IPhone("XS", 600, 6);
        XS.FaceTime();
        XS.Call();
        XS.Text();
        Nokia PureView = new Nokia("9 PureView", 449.99, 5);
        PureView.Call();
        PureView.Selfie();
        Samsung Galaxy = new Samsung("S20", 699.99, 6);
        Galaxy.freezing();
        Galaxy.Call();
        ArrayList phones = new ArrayList(Arrays.asList(XS,PureView, Galaxy));
        for(Object each:phones){
            System.out.println(each);
        }
    }
}
