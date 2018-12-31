package com.workday.implementations;

import com.workday.interfaces.Ids;
import com.workday.interfaces.RangeContainer;

import java.util.*;

/**
 * Created by Praveen on 12/27/2018.
 * Immutable
 */
public  class RangeContainerImpl implements RangeContainer {

    private  final NavigableMap<Long ,Integer> container = new TreeMap<>();

    public RangeContainerImpl (long[] data)
    {

        for(int i=0;i<data.length;i++)
        {
            container.put(data[i] , i);
        }
    }

    public Ids findIdsInRange(long fromValue, long toValue,
                              boolean fromInclusive, boolean toInclusive)
    {


         //Sorted Map submap returns from key inclusive and to key  exclusive
         SortedMap<Long , Integer> subMap = container.subMap(fromValue, fromInclusive,
                                                             toValue,toInclusive);
         short[] ids = new short[subMap.size()];

         int index =0;
         for ( Map.Entry<Long , Integer> entry : subMap.entrySet()) {
             ids[index++] = entry.getValue().shortValue();
    }

        Arrays.sort(ids);
        Ids id  = new IdsImpl(ids);
        return id;
    }
}
