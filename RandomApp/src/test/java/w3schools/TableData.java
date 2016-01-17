package w3schools;

import CommonApi.Base;
import org.testng.annotations.Test;

/**
 * Created by Shahida Lucky on 1/13/2016.
 */
public class TableData extends Base {
    @Test
    public void getTableData(){
        String text = getTextByCss(".table-responsive tbody");
        System.out.println(text);
    }

}
