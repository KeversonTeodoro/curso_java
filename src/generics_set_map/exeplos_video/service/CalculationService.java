package generics_set_map.exeplos_video.service;

import java.util.List;

public class CalculationService {


    public static <TipoGenerico extends Comparable<TipoGenerico>> TipoGenerico  max(List<TipoGenerico> list){
        if(list.isEmpty()){
            throw new IllegalArgumentException("List can't be empty");
        }

        TipoGenerico max = list.get(0);

        for(TipoGenerico num : list){

            if(num.compareTo(max) > 0){
                max = num;
            }
        }

        return max;

    }


}
