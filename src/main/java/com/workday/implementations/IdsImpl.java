package com.workday.implementations;

import com.workday.interfaces.Ids;

/**
 * Created by Praveen on 12/27/2018.
 */
public class IdsImpl implements  Ids {

    private short[] elements;
    private int  cursor; //Index of next elemet to return
    private int lastRet = -1; //  Index of last element returned

    public IdsImpl (short[] data)
    {
        elements = data;
    }


    public short nextId()
    {
        int i = cursor;
        short  id = Ids.END_OF_IDS;
        if(i < elements.length)
        {
            cursor = i+1;
            id = elements[lastRet =i];
        }
        return id;
    }

}
